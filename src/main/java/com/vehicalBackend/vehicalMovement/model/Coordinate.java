package com.vehicalBackend.vehicalMovement.model;

public class Coordinate {
 private Point start;
 private Point end;

 // Constructors
 public Coordinate() {}

 public Coordinate(Point start, Point end) {
     this.start = start;
     this.end = end;
 }

 // Getters and Setters
 public Point getStart() {
     return start;
 }

 public void setStart(Point start) {
     this.start = start;
 }

 public Point getEnd() {
     return end;
 }

 public void setEnd(Point end) {
     this.end = end;
 }

 // Nested Point class
 public static class Point {
     private double lat;
     private double lng;

     // Constructors
     public Point() {}

     public Point(double lat, double lng) {
         this.lat = lat;
         this.lng = lng;
     }

     // Getters and Setters
     public double getLat() {
         return lat;
     }

     public void setLat(double lat) {
         this.lat = lat;
     }

     public double getLng() {
         return lng;
     }

     public void setLng(double lng) {
         this.lng = lng;
     }
 }
}
