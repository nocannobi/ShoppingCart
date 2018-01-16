package src.com.entity;

import java.sql.Timestamp;

public class OuterStock extends BaseEntity{
    private Integer outerStockNumber;
    private Timestamp outerCreateTime;
    private Timestamp outerModifiedTime;

    public Integer getOuterStockNumber() {
        return outerStockNumber;
    }

    public void setOuterStockNumber(Integer outerStockNumber) {
        this.outerStockNumber = outerStockNumber;
    }

    public Timestamp getOuterCreateTime() {
        return outerCreateTime;
    }

    public void setOuterCreateTime(Timestamp outerCreateTime) {
        this.outerCreateTime = outerCreateTime;
    }

    public Timestamp getOuterModifiedTime() {
        return outerModifiedTime;
    }

    public void setOuterModifiedTime(Timestamp outerModifiedTime) {
        this.outerModifiedTime = outerModifiedTime;
    }

    @Override
    public String toString() {
        return "OuterStock{" +
                "outerStockNumber=" + outerStockNumber +
                ", outerCreateTime=" + outerCreateTime +
                ", outerModifiedTime=" + outerModifiedTime +
                '}';
    }

}
