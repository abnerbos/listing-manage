package com.litb.listing.domain;

import java.util.Date;

public class Product {

    private Integer id;

    private Integer litbPid;

    private Integer litbCategoryId;

    private String name;

    private String description;

    private String brandName;

    private String conditionNote;

    private String feature;

    private String searchTerm;

    private Date lastModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLitbPid() {
        return litbPid;
    }

    public void setLitbPid(Integer litbPid) {
        this.litbPid = litbPid;
    }

    public Integer getLitbCategoryId() {
        return litbCategoryId;
    }

    public void setLitbCategoryId(Integer litbCategoryId) {
        this.litbCategoryId = litbCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getConditionNote() {
        return conditionNote;
    }

    public void setConditionNote(String conditionNote) {
        this.conditionNote = conditionNote;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", litbPid=" + litbPid +
                ", litbCategoryId=" + litbCategoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brandName='" + brandName + '\'' +
                ", conditionNote='" + conditionNote + '\'' +
                ", feature='" + feature + '\'' +
                ", searchTerm='" + searchTerm + '\'' +
                ", lastModified=" + lastModified +
                '}';
    }
}