package com.securesoft.lucid.ui.help;

public class DoctorModel {
    int image;
    String name,desig;

    public DoctorModel(int image, String name, String desig) {
        this.image = image;
        this.name = name;
        this.desig = desig;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
}
