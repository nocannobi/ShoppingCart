package src.com.entity;

import java.sql.Timestamp;

public class ProductShelf extends BaseEntity{
    public static final Integer PRODUCT_SHELF_IS_STATE = 1;
    public static final Integer PRODUCT_SHELF_IS_NOT_STATE =0;

    private Integer productShelfIsState;
    private Timestamp shelfCreateTime;
    private Timestamp shelfModifiedTime;

    public Integer getProductShelfIsState() {
        return productShelfIsState;
    }

    public void setProductShelfIsState(Integer productShelfIsState) {
        this.productShelfIsState = productShelfIsState;
    }

    public Timestamp getShelfCreateTime() {
        return shelfCreateTime;
    }

    public void setShelfCreateTime(Timestamp shelfCreateTime) {
        this.shelfCreateTime = shelfCreateTime;
    }

    public Timestamp getShelfModifiedTime() {
        return shelfModifiedTime;
    }

    public void setShelfModifiedTime(Timestamp shelfModifiedTime) {
        this.shelfModifiedTime = shelfModifiedTime;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "productShelfIsState=" + productShelfIsState +
                ", shelfCreateTime=" + shelfCreateTime +
                ", shelfModifiedTime=" + shelfModifiedTime +
                '}';
    }
}
