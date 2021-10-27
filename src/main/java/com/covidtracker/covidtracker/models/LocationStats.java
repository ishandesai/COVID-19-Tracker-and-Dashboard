package com.covidtracker.covidtracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;


    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state=state;
    }
    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }

    public void setLatestTotalCases(int latestTotalCases){
        this.latestTotalCases=latestTotalCases;
    }
    public int getLatestTotalCases(){
    return  this.latestTotalCases;
    }
    public void setDiffFromPrevDay(int diffFromPrevDay){
        this.diffFromPrevDay=diffFromPrevDay;
    }
    public int getDiffFromPrevDay(){
    return  this.diffFromPrevDay;
    }
    @Override
    public String toString(){
        return "LocationStats{" + "state='"+ this.state +'\''+", country='" + this.country + '\'' + ", latestTotalCases=" + this.latestTotalCases + ", diffFromPrevDay=" + this.diffFromPrevDay +'}';
    }
    
}
