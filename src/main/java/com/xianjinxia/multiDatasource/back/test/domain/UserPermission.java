package com.xianjinxia.multiDatasource.back.test.domain;

public class UserPermission {
    private Long userId;
    private String userName;
    private String mobile;
    private String userLoginName;
    private Integer registerPermission;
    private Integer applyPermission;
    private Integer loanPermission;
    private String userPermissionStr;
    private String updatePermissionTime;

    public String getUserPermissionStr() {
        return userPermissionStr;
    }

    public void setUserPermissionStr(String userPermissionStr) {
        this.userPermissionStr = userPermissionStr;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public Integer getRegisterPermission() {
        return registerPermission;
    }

    public void setRegisterPermission(Integer registerPermission) {
        this.registerPermission = registerPermission;
    }

    public Integer getApplyPermission() {
        return applyPermission;
    }

    public void setApplyPermission(Integer applyPermission) {
        this.applyPermission = applyPermission;
    }

    public Integer getLoanPermission() {
        return loanPermission;
    }

    public void setLoanPermission(Integer loanPermission) {
        this.loanPermission = loanPermission;
    }

    public String getUpdatePermissionTime() {
        return updatePermissionTime;
    }

    public void setUpdatePermissionTime(String updatePermissionTime) {
        this.updatePermissionTime = updatePermissionTime;
    }
}
