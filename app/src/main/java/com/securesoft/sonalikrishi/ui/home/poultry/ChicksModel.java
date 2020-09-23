package com.securesoft.sonalikrishi.ui.home.poultry;

import androidx.annotation.NonNull;

public class ChicksModel {

    private String companyname;
    private String broiler;
    private String layer;

    public ChicksModel(String companyname, String broiler, String layer) {
        this.companyname = companyname;
        this.broiler = broiler;
        this.layer = layer;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getBroiler() {
        return broiler;
    }

    public void setBroiler(String broiler) {
        this.broiler = broiler;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    @NonNull
    @Override
    public String toString() {
        return companyname;
    }
}
