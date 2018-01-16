package src.com.entity;

import java.sql.Timestamp;

public class Address extends BaseEntity {
    private String province;
    private String city;
    private String country;
    private String road;
    private String addressLable;
    private Timestamp addressCreateTime;
    private Timestamp addressModifiedTime;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getAddressLable() {
        return addressLable;
    }

    public void setAddressLable(String addressLable) {
        this.addressLable = addressLable;
    }

    public Timestamp getAddressCreateTime() {
        return addressCreateTime;
    }

    public void setAddressCreateTime(Timestamp addressCreateTime) {
        this.addressCreateTime = addressCreateTime;
    }

    public Timestamp getAddressModifiedTime() {
        return addressModifiedTime;
    }

    public void setAddressModifiedTime(Timestamp addressModifiedTime) {
        this.addressModifiedTime = addressModifiedTime;
    }

    @Override
    public String toString() {
        return "address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", road='" + road + '\'' +
                ", addressLable='" + addressLable + '\'' +
                ", addressCreateTime=" + addressCreateTime +
                ", addressModifiedTime=" + addressModifiedTime +
                '}';
    }
}
