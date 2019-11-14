package hello;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Aspect
@Configuration
public class CacheAspect {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Around("@annotation(hello.anno.Cache)")
    public Object cache(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object obj = redisTemplate.opsForValue().get(methodName);
        if (obj == null) {
            Object real = joinPoint.proceed();
            redisTemplate.opsForValue().set(methodName, real);
            System.out.println("Get value form database");
            return real;
        } else {
            System.out.println("Get value form cache");
            return obj;
        }
    }
}