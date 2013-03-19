package com.cs.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/13/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "mentors", schema = "", catalog = "showcase")
@Entity
public class MentorsEntity {
    private String onepassId;

    @Column(name = "onepass_id")
    @Id
    public String getOnepassId() {
        return onepassId;
    }

    public void setOnepassId(String onepassId) {
        this.onepassId = onepassId;
    }

    private String name;

    @Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MentorsEntity that = (MentorsEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (onepassId != null ? !onepassId.equals(that.onepassId) : that.onepassId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = onepassId != null ? onepassId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
