package src.com.entity;

import java.sql.Timestamp;

public class ShopCart extends BaseEntity {
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
        return "ShopCart{" +
                "stockNumber=" + stockNumber +
                ", stockCreateTime=" + stockCreateTime +
                ", stockModifiedTime=" + stockModifiedTime +
                '}';
    }
}
