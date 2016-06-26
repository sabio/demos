package com.demolambdas.example.beans;

import java.util.Date;


public class Console {
    private String name;
    private String companyName;
    private Date releaseDate;
    private Double unitsSold;
    private Integer generation;

    public Console() {
    }

    public Console(String name, String companyName, Date releaseDate, Double unitsSold, Integer generation) {
        this.name = name;
        this.companyName = companyName;
        this.releaseDate = releaseDate;
        this.unitsSold = unitsSold;
        this.generation = generation;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(Double unitsSold) {
        this.unitsSold = unitsSold;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }
    
    

    @Override
    public String toString() {
        return name+", "+companyName+", "+releaseDate+", "+unitsSold+", "+generation;
    }

}
