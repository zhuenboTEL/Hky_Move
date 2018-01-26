package com.hky.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Role {
	List<Module> Modules = new ArrayList<Module>();
	
    private String rId;

    private String rName;

    private String rRemark;

    private String rNumber;

    private String rCreateby;

    private String rDept;

    private Date rCreatetime;

    private String rUpdateby;

    private Date rUpdatetime;
    
    public List<Module> getModules() {
		return Modules;
	}

	public void setModules(List<Module> modules) {
		Modules = modules;
	}

	public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrRemark() {
        return rRemark;
    }

    public void setrRemark(String rRemark) {
        this.rRemark = rRemark == null ? null : rRemark.trim();
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

    public String getrCreateby() {
        return rCreateby;
    }

    public void setrCreateby(String rCreateby) {
        this.rCreateby = rCreateby == null ? null : rCreateby.trim();
    }

    public String getrDept() {
        return rDept;
    }

    public void setrDept(String rDept) {
        this.rDept = rDept == null ? null : rDept.trim();
    }

    public Date getrCreatetime() {
        return rCreatetime;
    }

    public void setrCreatetime(Date rCreatetime) {
        this.rCreatetime = rCreatetime;
    }

    public String getrUpdateby() {
        return rUpdateby;
    }

    public void setrUpdateby(String rUpdateby) {
        this.rUpdateby = rUpdateby == null ? null : rUpdateby.trim();
    }

    public Date getrUpdatetime() {
        return rUpdatetime;
    }

    public void setrUpdatetime(Date rUpdatetime) {
        this.rUpdatetime = rUpdatetime;
    }
}