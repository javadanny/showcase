package com.cs.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/13/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "titles", schema = "", catalog = "showcase")
@Entity
public class TitlesEntity {
    private int titleId;

    @javax.persistence.Column(name = "title_id")
    @Id
    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    private String titleDesc;

    @javax.persistence.Column(name = "title_desc")
    @Basic
    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    private String jobCode;

    @javax.persistence.Column(name = "job_code")
    @Basic
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    private int minPay;

    @javax.persistence.Column(name = "min_pay")
    @Basic
    public int getMinPay() {
        return minPay;
    }

    public void setMinPay(int minPay) {
        this.minPay = minPay;
    }

    private int midPay;

    @javax.persistence.Column(name = "mid_pay")
    @Basic
    public int getMidPay() {
        return midPay;
    }

    public void setMidPay(int midPay) {
        this.midPay = midPay;
    }

    private int maxPay;

    @javax.persistence.Column(name = "max_pay")
    @Basic
    public int getMaxPay() {
        return maxPay;
    }

    public void setMaxPay(int maxPay) {
        this.maxPay = maxPay;
    }

    private String payGrade;

    @javax.persistence.Column(name = "pay_grade")
    @Basic
    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitlesEntity that = (TitlesEntity) o;

        if (maxPay != that.maxPay) return false;
        if (midPay != that.midPay) return false;
        if (minPay != that.minPay) return false;
        if (titleId != that.titleId) return false;
        if (jobCode != null ? !jobCode.equals(that.jobCode) : that.jobCode != null) return false;
        if (payGrade != null ? !payGrade.equals(that.payGrade) : that.payGrade != null) return false;
        if (titleDesc != null ? !titleDesc.equals(that.titleDesc) : that.titleDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = titleId;
        result = 31 * result + (titleDesc != null ? titleDesc.hashCode() : 0);
        result = 31 * result + (jobCode != null ? jobCode.hashCode() : 0);
        result = 31 * result + minPay;
        result = 31 * result + midPay;
        result = 31 * result + maxPay;
        result = 31 * result + (payGrade != null ? payGrade.hashCode() : 0);
        return result;
    }
}
