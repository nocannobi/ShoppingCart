package src.com.entity;

import java.sql.Timestamp;

public class OrderItem extends BaseEntity{
    private Integer productNumber;
    private Timestamp itemCreateTime;
    private Timestamp itemModifiedTime;

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Timestamp getItemCreateTime() {
        return itemCreateTime;
    }

    public void setItemCreateTime(Timestamp itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
    }

    public Timestamp getItemModifiedTime() {
        return itemModifiedTime;
    }

    public void setItemModifiedTime(Timestamp itemModifiedTime) {
        this.itemModifiedTime = itemModifiedTime;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productNumber=" + productNumber +
                ", itemCreateTime=" + itemCreateTime +
                ", itemModifiedTime=" + itemModifiedTime +
                '}';
    }
}
