package com.baseclass;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Запуск методов класса Circle

        /*System.out.println("Запуск методов класса Circle");
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());
        circle.setColor("green");
        circle.setRadius(32);
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());
        System.out.println(" ");


        // Запуск методов класса Rectangle

        System.out.println("Запуск методов класса Rectangle");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.setLength(20);
        rectangle.setWidth(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(" ");*/


        // Зупуск методов класса Employee

        /*System.out.println("Запуск методов класса Employee");
        Employee employee = new Employee(1, "Jack", "London", 1000);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(30));
        System.out.println(employee.getSalary());
        System.out.println(" ");*/


        // Запуск методов класса Book

        /*System.out.println("Запуск методов класса Book");
        ArrayList <Author> authors = new ArrayList<>();
        authors.add(new Author("authorName1", "au1@gmail.com", 'm'));
        authors.add(new Author("authorName2", "au2@gmail.com", 'f'));

        Book book = new Book("Game of thrones",authors, 1000, 43);
        System.out.println("Вызов метода toString: " + book.toString());
        System.out.println("Вызов метода getAuthorNames: " + book.getAuthorNames());
        System.out.println("Вызов метода getAuthors: " + book.getAuthors());
        System.out.println(" ");*/


        // Запуск методов класса MyPoint

        /*System.out.println("Запуск методов класса MyPoint");
        MyPoint myPoint = new MyPoint(5,5);
        System.out.println(Arrays.toString(myPoint.getXY()));
        myPoint.setXY(6, 6);
        System.out.println(Arrays.toString(myPoint.getXY()));
        System.out.println(myPoint.toString());
        System.out.println(myPoint.distance(15, 15));
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(new MyPoint(8,8)));
        System.out.println(" ");*/


        // Запуск методов класса MyTriangle

        System.out.println("Запуск методов класса MyTriangle");
        MyTriangle myTriangle = new MyTriangle(3,4,7,8,7,5);
        System.out.println("Вызов метода toString: " + myTriangle.toString());
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(" ");
    }
}
