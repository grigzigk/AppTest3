package com.example.test2;

import java.io.Serializable;

public class Place implements Serializable {
    private String NamePlace;
    private String ImagePath;
    private String Description;

    // constructor
    public Place(String name, String imPath, String descr) {
        NamePlace = name;
        ImagePath = imPath;
        Description = descr;

    }

    public Place() {
        NamePlace = "";
        ImagePath = "";
        Description = "";

    }

    //set methods
    public void setNameP( String name ) {
        this.NamePlace = name;
    }

    public void setImagePath(String imPath) {
        this.ImagePath = imPath;
    }

    public void setDescriptionP(String descr) {
        this.Description = descr;
    }


    //get methods
    public String getNameP(){
        return NamePlace;
    }

    public String getImagePath(){
        return ImagePath;
    }

    public String getDescriptionP(){
        return Description;
    }

}
