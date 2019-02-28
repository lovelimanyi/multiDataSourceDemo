package com.xianjinxia.multiDatasource.back.domain;

import java.util.Date;
import java.util.List;

public class Userinfo {
    private Long id;

    private String userName;

    private String userLoginName;

    private String userPwd;

    private String status;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateUser;

    private String descript;

    private Date lastLoginTime;

    private List<Long> roleIdList;

    private String mobile;

    private List<Long> merchantIdList;

    private List<Long> promotionChannelIdList;

    private String channelOrgIds;

    private String channelOrgIdsYoumi;

    private List<Long> promotionChannelIdListYoumi;

    private Boolean allChannel;

    private Boolean allChannelYoumi;

    public Boolean getAllChannel() {
        return allChannel;
    }

    public void setAllChannel(Boolean allChannel) {
        this.allChannel = allChannel;
    }

    public Boolean getAllChannelYoumi() {
        return allChannelYoumi;
    }

    public void setAllChannelYoumi(Boolean allChannelYoumi) {
        this.allChannelYoumi = allChannelYoumi;
    }

    public String getChannelOrgIdsYoumi() {
        return channelOrgIdsYoumi;
    }

    public void setChannelOrgIdsYoumi(String channelOrgIdsYoumi) {
        this.channelOrgIdsYoumi = channelOrgIdsYoumi;
    }

    public List<Long> getPromotionChannelIdListYoumi() {
        return promotionChannelIdListYoumi;
    }

    public void setPromotionChannelIdListYoumi(List<Long> promotionChannelIdListYoumi) {
        this.promotionChannelIdListYoumi = promotionChannelIdListYoumi;
    }

    public String getChannelOrgIds() {
        return channelOrgIds;
    }

    public void setChannelOrgIds(String channelOrgIds) {
        this.channelOrgIds = channelOrgIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public List<Long> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<Long> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Long> getMerchantIdList() {
        return merchantIdList;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public List<Long> getPromotionChannelIdList() {
        return promotionChannelIdList;
    }

    public void setPromotionChannelIdList(List<Long> promotionChannelIdList) {
        this.promotionChannelIdList = promotionChannelIdList;
    }
}