package com.hky.entity;

import java.util.Date;

public class Module {
    private String moId;

    private String moParentid;

    private String moParentname;

    private String moName;

    private String moLevel;

    private String moStatu;

    private String moCpermission;

    private String moUrl;

    private String moType;

    private String moState;

    private String moBelogin;

    private String moExplain;

    private String moNumber;

    private String moCreateby;

    private String moCreatedept;

    private Date moCreatetime;

    private String moUpdateby;

    private Date moUpdatetime;

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId == null ? null : moId.trim();
    }

    public String getMoParentid() {
        return moParentid;
    }

    public void setMoParentid(String moParentid) {
        this.moParentid = moParentid == null ? null : moParentid.trim();
    }

    public String getMoParentname() {
        return moParentname;
    }

    public void setMoParentname(String moParentname) {
        this.moParentname = moParentname == null ? null : moParentname.trim();
    }

    public String getMoName() {
        return moName;
    }

    public void setMoName(String moName) {
        this.moName = moName == null ? null : moName.trim();
    }

    public String getMoLevel() {
        return moLevel;
    }

    public void setMoLevel(String moLevel) {
        this.moLevel = moLevel == null ? null : moLevel.trim();
    }

    public String getMoStatu() {
        return moStatu;
    }

    public void setMoStatu(String moStatu) {
        this.moStatu = moStatu == null ? null : moStatu.trim();
    }

    public String getMoCpermission() {
        return moCpermission;
    }

    public void setMoCpermission(String moCpermission) {
        this.moCpermission = moCpermission == null ? null : moCpermission.trim();
    }

    public String getMoUrl() {
        return moUrl;
    }

    public void setMoUrl(String moUrl) {
        this.moUrl = moUrl == null ? null : moUrl.trim();
    }

    public String getMoType() {
        return moType;
    }

    public void setMoType(String moType) {
        this.moType = moType == null ? null : moType.trim();
    }

    public String getMoState() {
        return moState;
    }

    public void setMoState(String moState) {
        this.moState = moState == null ? null : moState.trim();
    }

    public String getMoBelogin() {
        return moBelogin;
    }

    public void setMoBelogin(String moBelogin) {
        this.moBelogin = moBelogin == null ? null : moBelogin.trim();
    }

    public String getMoExplain() {
        return moExplain;
    }

    public void setMoExplain(String moExplain) {
        this.moExplain = moExplain == null ? null : moExplain.trim();
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber == null ? null : moNumber.trim();
    }

    public String getMoCreateby() {
        return moCreateby;
    }

    public void setMoCreateby(String moCreateby) {
        this.moCreateby = moCreateby == null ? null : moCreateby.trim();
    }

    public String getMoCreatedept() {
        return moCreatedept;
    }

    public void setMoCreatedept(String moCreatedept) {
        this.moCreatedept = moCreatedept == null ? null : moCreatedept.trim();
    }

    public Date getMoCreatetime() {
        return moCreatetime;
    }

    public void setMoCreatetime(Date moCreatetime) {
        this.moCreatetime = moCreatetime;
    }

    public String getMoUpdateby() {
        return moUpdateby;
    }

    public void setMoUpdateby(String moUpdateby) {
        this.moUpdateby = moUpdateby == null ? null : moUpdateby.trim();
    }

    public Date getMoUpdatetime() {
        return moUpdatetime;
    }

    public void setMoUpdatetime(Date moUpdatetime) {
        this.moUpdatetime = moUpdatetime;
    }
}