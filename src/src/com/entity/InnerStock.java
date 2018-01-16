package src.com.entity;

import java.sql.Timestamp;

public class InnerStock extends BaseEntity{
    private Integer innerStockNumber;
    private Timestamp innerCreateTime;
    private Timestamp innerModifiedTime;

    public Integer getInnerStockNumber() {
        return innerStockNumber;
    }

    public void setInnerStockNumber(Integer innerStockNumber) {
        this.innerStockNumber = innerStockNumber;
    }

    public Timestamp getInnerCreateTime() {
        return innerCreateTime;
    }

    public void setInnerCreateTime(Timestamp innerCreateTime) {
        this.innerCreateTime = innerCreateTime;
    }

    public Timestamp getInnerModifiedTime() {
        return innerModifiedTime;
    }

    public void setInnerModifiedTime(Timestamp innerModifiedTime) {
        this.innerModifiedTime = innerModifiedTime;
    }

    @Override
    public String toString() {
        return "InnerStock{" +
                "innerStockNumber=" + innerStockNumber +
                ", innerCreateTime=" + innerCreateTime +
                ", innerModifiedTime=" + innerModifiedTime +
                '}';
    }
}
