package src.com.entity;

import java.security.Timestamp;

public class ProductStock extends BaseEntity{
    private Integer stockNumber;
    private Timestamp stockCreateTime;
    private Timestamp stockModifiedTime;

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Timestamp getStockCreateTime() {
        return stockCreateTime;
    }

    public void setStockCreateTime(Timestamp stockCreateTime) {
        this.stockCreateTime = stockCreateTime;
    }

    public Timestamp getStockModifiedTime() {
        return stockModifiedTime;
    }

    public void setStockModifiedTime(Timestamp stockModifiedTime) {
        this.stockModifiedTime = stockModifiedTime;
    }

    @Override
    public String toString() {
        return "ProductStock{" +
                "stockNumber=" + stockNumber +
                ", stockCreateTime=" + stockCreateTime +
                ", stockModifiedTime=" + stockModifiedTime +
                '}';
    }
}
