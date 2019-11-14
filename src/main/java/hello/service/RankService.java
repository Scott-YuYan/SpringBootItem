package hello.service;

import hello.anno.Cache;
import hello.dao.RankDao;
import hello.entity.ScoreItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    RankDao rankDao;

    @Cache
    public List<ScoreItem> sort() {
        return rankDao.getRankItem();
    }
}

