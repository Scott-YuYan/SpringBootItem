package hello.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

//告诉SpringBoot这是用以生成配置文件的
@Configuration
public class AppConfig {
    //Redis会扫描所以带Bean注解的方法，并自动调用它，生成相关的Bean
    @Bean
    //RedisTemplate用以实现与Redis进行交互
    RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;

    }
}
