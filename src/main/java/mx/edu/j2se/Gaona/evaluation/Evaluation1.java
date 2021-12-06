package mx.edu.j2se.Gaona.evaluation;

import java.util.ArrayList;

public class Evaluation1 {
    public static void main(String[] args) {
        Circle circulo1 = new Circle(7);
        System.out.println(circulo1.getRadio());
        System.out.println(circulo1.getArea());
        Circle circulo2 = new Circle(-4);
        ArrayList<Circle> circles = new ArrayList<>();
    }
}
