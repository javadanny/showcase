package com.cs.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/13/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "hire_source", schema = "", catalog = "showcase")
@Entity
public class HireSourceEntity {
    private int sourceId;

    @Column(name = "source_id")
    @Id
    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    private String sourceDesc;

    @Column(name = "source_desc")
    @Basic
    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HireSourceEntity that = (HireSourceEntity) o;

        if (sourceId != that.sourceId) return false;
        if (sourceDesc != null ? !sourceDesc.equals(that.sourceDesc) : that.sourceDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sourceId;
        result = 31 * result + (sourceDesc != null ? sourceDesc.hashCode() : 0);
        return result;
    }
}
