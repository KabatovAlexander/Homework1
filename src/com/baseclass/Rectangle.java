package com.baseclass;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {

    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double square = length * width;
        return square;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "length =" + length + ", width =" + width + ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle equal = (Rectangle) obj;
        return length == equal.length && width == equal.width;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + Float.floatToIntBits(length);
        result = 37 * result + Float.floatToIntBits(width);
        return result;
    }
}