package com.hky.entity;

import java.util.Date;

public class RoleModule {
    private String id;

    private String moId;

    private String rId;

    private Date moDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId == null ? null : moId.trim();
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }

    public Date getMoDate() {
        return moDate;
    }

    public void setMoDate(Date moDate) {
        this.moDate = moDate;
    }
}