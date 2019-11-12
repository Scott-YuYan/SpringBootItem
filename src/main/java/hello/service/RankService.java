package hello.service;

import hello.dao.RankDao;
import hello.entity.ScoreItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private RankDao rankDao;

    public List<ScoreItem> sort() {
        return rankDao.getRankItem();
    }
}

