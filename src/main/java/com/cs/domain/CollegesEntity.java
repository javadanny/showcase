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
@Table(name = "colleges", schema = "", catalog = "showcase")
@Entity
public class CollegesEntity {
    private int collegeId;

    @Column(name = "college_id")
    @Id
    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    private String collegeNm;

    @Column(name = "college_nm")
    @Basic
    public String getCollegeNm() {
        return collegeNm;
    }

    public void setCollegeNm(String collegeNm) {
        this.collegeNm = collegeNm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollegesEntity that = (CollegesEntity) o;

        if (collegeId != that.collegeId) return false;
        if (collegeNm != null ? !collegeNm.equals(that.collegeNm) : that.collegeNm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = collegeId;
        result = 31 * result + (collegeNm != null ? collegeNm.hashCode() : 0);
        return result;
    }

    private Collection<PartnersEntity> partnersesByCollegeId;

    @OneToMany(mappedBy = "collegesByCollegeId")
    public Collection<PartnersEntity> getPartnersesByCollegeId() {
        return partnersesByCollegeId;
    }

    public void setPartnersesByCollegeId(Collection<PartnersEntity> partnersesByCollegeId) {
        this.partnersesByCollegeId = partnersesByCollegeId;
    }
}
