package com.baseclass;

import java.util.Arrays;

public class MyPoint {
    private int x;
    private int y;

    public  MyPoint () {
        this.x = x;
        this.y = y;
    }

    public MyPoint (int x, int y) {
        this.x = x;
        this.y = y;

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] point = new int[2];
        point[0] = getX();
        point[1] = getY();
        return point;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y){
        double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance;
    }

    public  double distance (MyPoint point) {
        double distance = Math.sqrt(Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow((this.x), 2) + Math.pow((this.y), 2));
        return distance;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyPoint equal = (MyPoint) obj;
        return x == equal.x &&
                y == equal.y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + x;
        result = 37 * result + y;
        return result;
    }
}
