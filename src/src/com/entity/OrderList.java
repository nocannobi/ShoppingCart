package src.com.entity;

import java.math.BigDecimal;
import java.security.Timestamp;

public class OrderList extends BaseEntity{
    public static final Integer ORDER_IS_PAY= 1;
    public static final Integer ORDER_IS_NOT_PAY = 0;
    public static final Integer ORDER_IS_DELETES = 1;
    public static final Integer ORDER_IS_NOT_DELETES = 0;
    public static final Integer ORDER_IS_TRANSPORT =1;
    public static final Integer ORDER_IS_NOT_TRANSPORT =0;
    public static final Integer ORDER_IS_ALREADY_TRANSPORT =2;

    private BigDecimal totalMoney;
    private Integer orderIsPay;
    private Integer orderIsDeletes;
    private Integer orderIsTranSport;
    private Timestamp orderCreateTime;
    private Timestamp orderModifiedTime;

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getOrderIsPay() {
        return orderIsPay;
    }

    public void setOrderIsPay(Integer orderIsPay) {
        this.orderIsPay = orderIsPay;
    }

    public Integer getOrderIsDeletes() {
        return orderIsDeletes;
    }

    public void setOrderIsDeletes(Integer orderIsDeletes) {
        this.orderIsDeletes = orderIsDeletes;
    }

    public Integer getOrderIsTranSport() {
        return orderIsTranSport;
    }

    public void setOrderIsTranSport(Integer orderIsTranSport) {
        this.orderIsTranSport = orderIsTranSport;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Timestamp getOrderModifiedTime() {
        return orderModifiedTime;
    }

    public void setOrderModifiedTime(Timestamp orderModifiedTime) {
        this.orderModifiedTime = orderModifiedTime;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "totalMoney=" + totalMoney +
                ", orderIsPay=" + orderIsPay +
                ", orderIsDeletes=" + orderIsDeletes +
                ", orderIsTranSport=" + orderIsTranSport +
                ", orderCreateTime=" + orderCreateTime +
                ", orderModifiedTime=" + orderModifiedTime +
                '}';
    }
}
