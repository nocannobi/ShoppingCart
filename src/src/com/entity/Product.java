package src.com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product extends BaseEntity {
    public static final Integer PRODUCT_IS_DELETED = 1;
    public static final Integer PRODUCT_IS_NOT_DELETED = 0;

    private String productName;
    private BigDecimal productPrice;
    private String productType;
    private Integer productIsDeleted;
    private Timestamp productCreateTime;
    private Timestamp productModifiedTime;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductIsDeleted() {
        return productIsDeleted;
    }

    public void setProductIsDeleted(Integer productIsDeleted) {
        this.productIsDeleted = productIsDeleted;
    }

    public Timestamp getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Timestamp productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public Timestamp getProductModifiedTime() {
        return productModifiedTime;
    }

    public void setProductModifiedTime(Timestamp productModifiedTime) {
        this.productModifiedTime = productModifiedTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productType='" + productType + '\'' +
                ", productIsDeleted=" + productIsDeleted +
                ", productCreateTime=" + productCreateTime +
                ", productModifiedTime=" + productModifiedTime +
                '}';
    }
}
