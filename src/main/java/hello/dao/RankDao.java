package hello.dao;

import hello.entity.ScoreItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDao {

    @Autowired
    SqlSession sqlSession;

    public List<ScoreItem> getRankItem(){
        return sqlSession.selectList("MyUserMapper.rankUser");
    }
}