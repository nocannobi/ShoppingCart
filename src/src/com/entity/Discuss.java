package src.com.entity;

import java.sql.Timestamp;

public class Discuss extends BaseEntity{
    public static final Integer DISCUSS_IS_DELETED = 1;
    public static final Integer DISCUSS_IS_NOT_DELETED = 0;
    private Integer discussScore;
    private Integer discussIsDeleted;
    private Timestamp discussCreateTime;
    private Timestamp discussModied_time;

    public Integer getDiscussScore() {
        return discussScore;
    }

    public void setDiscussScore(Integer discussScore) {
        this.discussScore = discussScore;
    }

    public Integer getDiscussIsDeleted() {
        return discussIsDeleted;
    }

    public void setDiscussIsDeleted(Integer discussIsDeleted) {
        this.discussIsDeleted = discussIsDeleted;
    }

    public Timestamp getDiscussCreateTime() {
        return discussCreateTime;
    }

    public void setDiscussCreateTime(Timestamp discussCreateTime) {
        this.discussCreateTime = discussCreateTime;
    }

    public Timestamp getDiscussModied_time() {
        return discussModied_time;
    }

    public void setDiscussModied_time(Timestamp discussModied_time) {
        this.discussModied_time = discussModied_time;
    }

    @Override
    public String toString() {
        return "discuss{" +
                "discussScore=" + discussScore +
                ", discussIsDeleted=" + discussIsDeleted +
                ", discussCreateTime=" + discussCreateTime +
                ", discussModied_time=" + discussModied_time +
                '}';
    }
}
