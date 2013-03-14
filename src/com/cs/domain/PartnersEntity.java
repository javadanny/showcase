package com.cs.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/13/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "partners", schema = "", catalog = "showcase")
@Entity
public class PartnersEntity {
    private String onepassId;

    @javax.persistence.Column(name = "onepass_id")
    @Id
    public String getOnepassId() {
        return onepassId;
    }

    public void setOnepassId(String onepassId) {
        this.onepassId = onepassId;
    }

    private String firstName;

    @javax.persistence.Column(name = "first_name")
    @Basic
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    @javax.persistence.Column(name = "last_name")
    @Basic
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int teamRank;

    @javax.persistence.Column(name = "team_rank")
    @Basic
    public int getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(int teamRank) {
        this.teamRank = teamRank;
    }

    private int sadcRank;

    @javax.persistence.Column(name = "sadc_rank")
    @Basic
    public int getSadcRank() {
        return sadcRank;
    }

    public void setSadcRank(int sadcRank) {
        this.sadcRank = sadcRank;
    }

    private Date startDt;

    @javax.persistence.Column(name = "start_dt")
    @Basic
    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    private int sourceId;

    @javax.persistence.Column(name = "source_id")
    @Basic
    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    private int psId;

    @javax.persistence.Column(name = "ps_id")
    @Basic
    public int getPsId() {
        return psId;
    }

    public void setPsId(int psId) {
        this.psId = psId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartnersEntity that = (PartnersEntity) o;

        if (psId != that.psId) return false;
        if (sadcRank != that.sadcRank) return false;
        if (sourceId != that.sourceId) return false;
        if (teamRank != that.teamRank) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (onepassId != null ? !onepassId.equals(that.onepassId) : that.onepassId != null) return false;
        if (startDt != null ? !startDt.equals(that.startDt) : that.startDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = onepassId != null ? onepassId.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + teamRank;
        result = 31 * result + sadcRank;
        result = 31 * result + (startDt != null ? startDt.hashCode() : 0);
        result = 31 * result + sourceId;
        result = 31 * result + psId;
        return result;
    }
}
