package hello.entity;

import java.io.Serializable;

public class ScoreItem implements Serializable {
    private Integer score;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
