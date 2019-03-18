package com.baseclass;

public class MyTriangle extends MyPoint{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3 ) {
        if ((x1 == x2) && (y1 == y2) ||
            (x1 == x3) && (y1 == y3) ||
            (x2 == x3) && (y2 == y3) ||
            (x1 == x2) && (x1 == x3) ||
            (y1 == y2) && (y1 == y3)){
            System.out.println("ERROR!!! IT'S NOT A TRIANGLE!");
            throw new ArithmeticException("Wrong parameters!!!");
        }
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ']';
    }

    public double getPerimeter() {
        double getPerimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);//distance(new MyTriangle(v1, v2, v3));
        return getPerimeter;
    }
    public String getType() {
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)) {
            return "Equilateral";
        }
        else if(v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2)) {
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyTriangle equal = (MyTriangle) obj;
        return v1.equals(equal.v1) &&
                v2.equals(equal.v2) &&
                v3.equals(equal.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (v1 == null ? 0 : v1.hashCode());
        result = 37 * result + (v2 == null ? 0 : v2.hashCode());
        result = 37 * result + (v3 == null ? 0 : v3.hashCode());
        return result;
    }
}
