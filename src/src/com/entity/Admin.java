package src.com.entity;

import java.sql.Timestamp;

public class Admin extends BaseEntity{
    private String adminName;
    private String adminPassword;
    private Integer adminIsNormal;
    private Timestamp adminCreateTime;
    private Timestamp adminModifiedTime;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminIsNormal() {
        return adminIsNormal;
    }

    public void setAdminIsNormal(Integer adminIsNormal) {
        this.adminIsNormal = adminIsNormal;
    }

    public Timestamp getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Timestamp adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public Timestamp getAdminModifiedTime() {
        return adminModifiedTime;
    }

    public void setAdminModifiedTime(Timestamp adminModifiedTime) {
        this.adminModifiedTime = adminModifiedTime;
    }

    @Override
    public String toString() {
        return "admin{" +
                "adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminIsNormal=" + adminIsNormal +
                ", adminCreateTime=" + adminCreateTime +
                ", adminModifiedTime=" + adminModifiedTime +
                '}';
    }
}
