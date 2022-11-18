package com.example.test2;


import java.io.Serializable;

public class ImportCity implements Serializable {

    private String CityName;
    private Place place1;
    private Place place2;
    private Place place3;

    // constructor
    public ImportCity(){
        CityName="";
        place1 = new Place();
        place2 = new Place();
        place3 = new Place();
    }


    //set methods
    public void setNameCity( String nameCity ) {
        this.CityName = nameCity;
    }

    public void setPlace1(String placeName, String placeImage, String placeDescription){
        place1.setNameP(placeName);
        place1.setImagePath(placeImage);
        place1.setDescriptionP(placeDescription);
    }

    public void setPlace2(String placeName, String placeImage, String placeDescription){
        place2.setNameP(placeName);
        place2.setImagePath(placeImage);
        place2.setDescriptionP(placeDescription);
    }

    public void setPlace3(String placeName, String placeImage, String placeDescription){
        place3.setNameP(placeName);
        place3.setImagePath(placeImage);
        place3.setDescriptionP(placeDescription);
    }


    //get methods
    public String getNameCity(){
        return CityName;
    }

    public Place getPlace1() {return place1;}

    public Place getPlace2() {return place2;}

    public Place getPlace3() {return place3;}

}
