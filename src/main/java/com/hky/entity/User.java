package com.hky.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	List<Role> Roles = new ArrayList<Role>();
	
	List<Module> Modules = new ArrayList<Module>();
	
    private String tId;

    private String username;

    private String tOvername;

    private String password;

    private String tSex;

    private Date tDate;

    private String nId;

    private String aId;

    private String aaId;

    private Date tWorktime;

    private String pId;

    private Date tPartytime;

    private String arId;

    private Date tGettime;

    private Date tEngagetime;

    private String gId;

    private String tDuty;

    private Date tTackofficetime;

    private String adId;

    private String sId;

    private String tMagor;

    private String stId;

    private String dId;

    private String tIdnumber;

    private String tState;

    private String tEnglishstate;

    private String tStatu;
    
	public List<Role> getRoles() {
		return Roles;
	}

	public void setRoles(List<Role> roles) {
		Roles = roles;
	}

	public List<Module> getModules() {
		return Modules;
	}

	public void setModules(List<Module> modules) {
		Modules = modules;
	}

	public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String gettOvername() {
        return tOvername;
    }

    public void settOvername(String tOvername) {
        this.tOvername = tOvername == null ? null : tOvername.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId == null ? null : nId.trim();
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String getAaId() {
        return aaId;
    }

    public void setAaId(String aaId) {
        this.aaId = aaId == null ? null : aaId.trim();
    }

    public Date gettWorktime() {
        return tWorktime;
    }

    public void settWorktime(Date tWorktime) {
        this.tWorktime = tWorktime;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public Date gettPartytime() {
        return tPartytime;
    }

    public void settPartytime(Date tPartytime) {
        this.tPartytime = tPartytime;
    }

    public String getArId() {
        return arId;
    }

    public void setArId(String arId) {
        this.arId = arId == null ? null : arId.trim();
    }

    public Date gettGettime() {
        return tGettime;
    }

    public void settGettime(Date tGettime) {
        this.tGettime = tGettime;
    }

    public Date gettEngagetime() {
        return tEngagetime;
    }

    public void settEngagetime(Date tEngagetime) {
        this.tEngagetime = tEngagetime;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    public String gettDuty() {
        return tDuty;
    }

    public void settDuty(String tDuty) {
        this.tDuty = tDuty == null ? null : tDuty.trim();
    }

    public Date gettTackofficetime() {
        return tTackofficetime;
    }

    public void settTackofficetime(Date tTackofficetime) {
        this.tTackofficetime = tTackofficetime;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId == null ? null : adId.trim();
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String gettMagor() {
        return tMagor;
    }

    public void settMagor(String tMagor) {
        this.tMagor = tMagor == null ? null : tMagor.trim();
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId == null ? null : stId.trim();
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String gettIdnumber() {
        return tIdnumber;
    }

    public void settIdnumber(String tIdnumber) {
        this.tIdnumber = tIdnumber == null ? null : tIdnumber.trim();
    }

    public String gettState() {
        return tState;
    }

    public void settState(String tState) {
        this.tState = tState == null ? null : tState.trim();
    }

    public String gettEnglishstate() {
        return tEnglishstate;
    }

    public void settEnglishstate(String tEnglishstate) {
        this.tEnglishstate = tEnglishstate == null ? null : tEnglishstate.trim();
    }

    public String gettStatu() {
        return tStatu;
    }

    public void settStatu(String tStatu) {
        this.tStatu = tStatu == null ? null : tStatu.trim();
    }
}