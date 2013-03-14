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
@javax.persistence.Table(name = "teams", schema = "", catalog = "showcase")
@Entity
public class TeamsEntity {
    private int teamId;

    @javax.persistence.Column(name = "team_id")
    @Id
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    private String teamName;

    @javax.persistence.Column(name = "team_name")
    @Basic
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private Date callupDate;

    @javax.persistence.Column(name = "callup_date")
    @Basic
    public Date getCallupDate() {
        return callupDate;
    }

    public void setCallupDate(Date callupDate) {
        this.callupDate = callupDate;
    }

    private int size;

    @javax.persistence.Column(name = "size")
    @Basic
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamsEntity that = (TeamsEntity) o;

        if (size != that.size) return false;
        if (teamId != that.teamId) return false;
        if (callupDate != null ? !callupDate.equals(that.callupDate) : that.callupDate != null) return false;
        if (teamName != null ? !teamName.equals(that.teamName) : that.teamName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamId;
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        result = 31 * result + (callupDate != null ? callupDate.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }
}
