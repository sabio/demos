package com.demolambdas.example.beans;

import java.util.Date;


public class Console {
    private String name;
    private String companyName;
    private Date releaseDate;
    private double unitsSold;
    private int generation;

    public Console() {
    }

    public Console(String name, String companyName, Date releaseDate, double unitsSold, int generation) {
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

    public double getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(double unitsSold) {
        this.unitsSold = unitsSold;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    
    

    @Override
    public String toString() {
        return name+", "+companyName+", "+releaseDate+", "+unitsSold+", "+generation;
    }

}
