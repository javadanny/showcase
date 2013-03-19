package com.cs.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/13/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "majors", schema = "", catalog = "showcase")
@Entity
public class MajorsEntity {
    private int majorId;

    @Column(name = "major_id")
    @Id
    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    private String majorDesc;

    @Column(name = "major_desc")
    @Basic
    public String getMajorDesc() {
        return majorDesc;
    }

    public void setMajorDesc(String majorDesc) {
        this.majorDesc = majorDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MajorsEntity that = (MajorsEntity) o;

        if (majorId != that.majorId) return false;
        if (majorDesc != null ? !majorDesc.equals(that.majorDesc) : that.majorDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = majorId;
        result = 31 * result + (majorDesc != null ? majorDesc.hashCode() : 0);
        return result;
    }

    private Collection<PartnersEntity> partnersesByMajorId;

    @OneToMany(mappedBy = "majorsByMajorId")
    public Collection<PartnersEntity> getPartnersesByMajorId() {
        return partnersesByMajorId;
    }

    public void setPartnersesByMajorId(Collection<PartnersEntity> partnersesByMajorId) {
        this.partnersesByMajorId = partnersesByMajorId;
    }
}
