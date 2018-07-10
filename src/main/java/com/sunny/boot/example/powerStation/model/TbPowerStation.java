/**
 * Copyright(C) 2018 Hangzhou sunny Technology Co., Ltd. All rights reserved.
 */
package com.sunny.boot.example.powerStation.model;

import com.sunny.boot.example.common.model.BaseModel;
import java.util.Date;

public class TbPowerStation extends BaseModel<Long> {
    /**
     * 编号:
     */
    private Long tbpsId;

    /**
     * 运营地区:
     */
    private Long tbpsHost;

    /**
     * 所在网点:
     */
    private Long tbpsOutlets;

    /**
     * 接入商:
     */
    private Long tbpsSupplier;

    /**
     * 所在区域[tb_area]
     */
    private Long tbpsArea;

    /**
     * 电站名称:
     */
    private String tbpsName;

    /**
     * 详细地址:
     */
    private String tbpsAddress;

    /**
     * 位置信息:
     */
    private String tbpsLocation;

    /**
     * 经度:
     */
    private Double tbpsLongitude;

    /**
     * 纬度:
     */
    private Double tbpsLatitude;

    /**
     * 快充个数:
     */
    private Integer tbpsFast;

    /**
     * 慢充个数:
     */
    private Integer tbpsSlow;

    /**
     * 负责人:
     */
    private String tbpsPerson;

    /**
     * 联系电话:
     */
    private String tbpsTel;

    /**
     * 摘要信息:
     */
    private String tbpsProfile;

    /**
     * 时间描述:
     */
    private String tbpsTimeDesc;

    /**
     * 服务费用:
     */
    private String tbpsFeeServer;

    /**
     * 停车费用:
     */
    private String tbpsFeePark;

    /**
     * 备注信息:
     */
    private String tbpsRemark;

    /**
     * 修改时间:
     */
    private Date tbpsUpdateTime;

    /**
     * 添加时间:
     */
    private Date tbpsAddTime;

    /**
     * 状态:1:正常,2:预设,0:无效;
     */
    private Short tbpsStatus;

    /**
     * tb_power_station
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号:
     * @return tbpsId 编号:
     */
    public Long getTbpsId() {
        return tbpsId;
    }

    /**
     * 编号:
     * @param tbpsId 编号:
     */
    public void setTbpsId(Long tbpsId) {
        this.tbpsId = tbpsId;
    }

    /**
     * 运营地区:
     * @return tbpsHost 运营地区:
     */
    public Long getTbpsHost() {
        return tbpsHost;
    }

    /**
     * 运营地区:
     * @param tbpsHost 运营地区:
     */
    public void setTbpsHost(Long tbpsHost) {
        this.tbpsHost = tbpsHost;
    }

    /**
     * 所在网点:
     * @return tbpsOutlets 所在网点:
     */
    public Long getTbpsOutlets() {
        return tbpsOutlets;
    }

    /**
     * 所在网点:
     * @param tbpsOutlets 所在网点:
     */
    public void setTbpsOutlets(Long tbpsOutlets) {
        this.tbpsOutlets = tbpsOutlets;
    }

    /**
     * 接入商:
     * @return tbpsSupplier 接入商:
     */
    public Long getTbpsSupplier() {
        return tbpsSupplier;
    }

    /**
     * 接入商:
     * @param tbpsSupplier 接入商:
     */
    public void setTbpsSupplier(Long tbpsSupplier) {
        this.tbpsSupplier = tbpsSupplier;
    }

    /**
     * 所在区域[tb_area]
     * @return tbpsArea 所在区域[tb_area]
     */
    public Long getTbpsArea() {
        return tbpsArea;
    }

    /**
     * 所在区域[tb_area]
     * @param tbpsArea 所在区域[tb_area]
     */
    public void setTbpsArea(Long tbpsArea) {
        this.tbpsArea = tbpsArea;
    }

    /**
     * 电站名称:
     * @return tbpsName 电站名称:
     */
    public String getTbpsName() {
        return tbpsName;
    }

    /**
     * 电站名称:
     * @param tbpsName 电站名称:
     */
    public void setTbpsName(String tbpsName) {
        this.tbpsName = tbpsName == null ? null : tbpsName.trim();
    }

    /**
     * 详细地址:
     * @return tbpsAddress 详细地址:
     */
    public String getTbpsAddress() {
        return tbpsAddress;
    }

    /**
     * 详细地址:
     * @param tbpsAddress 详细地址:
     */
    public void setTbpsAddress(String tbpsAddress) {
        this.tbpsAddress = tbpsAddress == null ? null : tbpsAddress.trim();
    }

    /**
     * 位置信息:
     * @return tbpsLocation 位置信息:
     */
    public String getTbpsLocation() {
        return tbpsLocation;
    }

    /**
     * 位置信息:
     * @param tbpsLocation 位置信息:
     */
    public void setTbpsLocation(String tbpsLocation) {
        this.tbpsLocation = tbpsLocation == null ? null : tbpsLocation.trim();
    }

    /**
     * 经度:
     * @return tbpsLongitude 经度:
     */
    public Double getTbpsLongitude() {
        return tbpsLongitude;
    }

    /**
     * 经度:
     * @param tbpsLongitude 经度:
     */
    public void setTbpsLongitude(Double tbpsLongitude) {
        this.tbpsLongitude = tbpsLongitude;
    }

    /**
     * 纬度:
     * @return tbpsLatitude 纬度:
     */
    public Double getTbpsLatitude() {
        return tbpsLatitude;
    }

    /**
     * 纬度:
     * @param tbpsLatitude 纬度:
     */
    public void setTbpsLatitude(Double tbpsLatitude) {
        this.tbpsLatitude = tbpsLatitude;
    }

    /**
     * 快充个数:
     * @return tbpsFast 快充个数:
     */
    public Integer getTbpsFast() {
        return tbpsFast;
    }

    /**
     * 快充个数:
     * @param tbpsFast 快充个数:
     */
    public void setTbpsFast(Integer tbpsFast) {
        this.tbpsFast = tbpsFast;
    }

    /**
     * 慢充个数:
     * @return tbpsSlow 慢充个数:
     */
    public Integer getTbpsSlow() {
        return tbpsSlow;
    }

    /**
     * 慢充个数:
     * @param tbpsSlow 慢充个数:
     */
    public void setTbpsSlow(Integer tbpsSlow) {
        this.tbpsSlow = tbpsSlow;
    }

    /**
     * 负责人:
     * @return tbpsPerson 负责人:
     */
    public String getTbpsPerson() {
        return tbpsPerson;
    }

    /**
     * 负责人:
     * @param tbpsPerson 负责人:
     */
    public void setTbpsPerson(String tbpsPerson) {
        this.tbpsPerson = tbpsPerson == null ? null : tbpsPerson.trim();
    }

    /**
     * 联系电话:
     * @return tbpsTel 联系电话:
     */
    public String getTbpsTel() {
        return tbpsTel;
    }

    /**
     * 联系电话:
     * @param tbpsTel 联系电话:
     */
    public void setTbpsTel(String tbpsTel) {
        this.tbpsTel = tbpsTel == null ? null : tbpsTel.trim();
    }

    /**
     * 摘要信息:
     * @return tbpsProfile 摘要信息:
     */
    public String getTbpsProfile() {
        return tbpsProfile;
    }

    /**
     * 摘要信息:
     * @param tbpsProfile 摘要信息:
     */
    public void setTbpsProfile(String tbpsProfile) {
        this.tbpsProfile = tbpsProfile == null ? null : tbpsProfile.trim();
    }

    /**
     * 时间描述:
     * @return tbpsTimeDesc 时间描述:
     */
    public String getTbpsTimeDesc() {
        return tbpsTimeDesc;
    }

    /**
     * 时间描述:
     * @param tbpsTimeDesc 时间描述:
     */
    public void setTbpsTimeDesc(String tbpsTimeDesc) {
        this.tbpsTimeDesc = tbpsTimeDesc == null ? null : tbpsTimeDesc.trim();
    }

    /**
     * 服务费用:
     * @return tbpsFeeServer 服务费用:
     */
    public String getTbpsFeeServer() {
        return tbpsFeeServer;
    }

    /**
     * 服务费用:
     * @param tbpsFeeServer 服务费用:
     */
    public void setTbpsFeeServer(String tbpsFeeServer) {
        this.tbpsFeeServer = tbpsFeeServer == null ? null : tbpsFeeServer.trim();
    }

    /**
     * 停车费用:
     * @return tbpsFeePark 停车费用:
     */
    public String getTbpsFeePark() {
        return tbpsFeePark;
    }

    /**
     * 停车费用:
     * @param tbpsFeePark 停车费用:
     */
    public void setTbpsFeePark(String tbpsFeePark) {
        this.tbpsFeePark = tbpsFeePark == null ? null : tbpsFeePark.trim();
    }

    /**
     * 备注信息:
     * @return tbpsRemark 备注信息:
     */
    public String getTbpsRemark() {
        return tbpsRemark;
    }

    /**
     * 备注信息:
     * @param tbpsRemark 备注信息:
     */
    public void setTbpsRemark(String tbpsRemark) {
        this.tbpsRemark = tbpsRemark == null ? null : tbpsRemark.trim();
    }

    /**
     * 修改时间:
     * @return tbpsUpdateTime 修改时间:
     */
    public Date getTbpsUpdateTime() {
        return tbpsUpdateTime;
    }

    /**
     * 修改时间:
     * @param tbpsUpdateTime 修改时间:
     */
    public void setTbpsUpdateTime(Date tbpsUpdateTime) {
        this.tbpsUpdateTime = tbpsUpdateTime;
    }

    /**
     * 添加时间:
     * @return tbpsAddTime 添加时间:
     */
    public Date getTbpsAddTime() {
        return tbpsAddTime;
    }

    /**
     * 添加时间:
     * @param tbpsAddTime 添加时间:
     */
    public void setTbpsAddTime(Date tbpsAddTime) {
        this.tbpsAddTime = tbpsAddTime;
    }

    /**
     * 状态:1:正常,2:预设,0:无效;
     * @return tbpsStatus 状态:1:正常,2:预设,0:无效;
     */
    public Short getTbpsStatus() {
        return tbpsStatus;
    }

    /**
     * 状态:1:正常,2:预设,0:无效;
     * @param tbpsStatus 状态:1:正常,2:预设,0:无效;
     */
    public void setTbpsStatus(Short tbpsStatus) {
        this.tbpsStatus = tbpsStatus;
    }
}