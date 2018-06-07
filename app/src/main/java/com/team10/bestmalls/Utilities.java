package com.team10.bestmalls;

import android.location.LocationListener;
import android.location.LocationManager;

public class Utilities {


    public double getDistanceBetween2Coord(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;

        dist *= 1.609344;

        //abschneiden nach der 2ten Kommastelle
        int i = (int) (dist *100);
        dist = i;
        return dist/100;

    }


    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }


    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


}


