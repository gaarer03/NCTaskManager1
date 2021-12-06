package mx.edu.j2se.Gaona.evaluation;
import java.lang.Math;
import java.util.*;

public class Circle {
    private int radio;
    ArrayList<Circle> arr = new ArrayList<>();
    int i;

    public Circle() {
        this.radio = 1;
    }

    public Circle(int radio){
        /*String str=" ";
        int numero;
        try{
            numero=Integer.parseInt(str);
        }catch(NumberFormatException ex){
            System.out.println("No se ha escrito nada");
        }*/
        if(radio<0){
            throw new IllegalArgumentException(Integer.toString(radio));
        }
        else{
            this.radio=radio;
        }
    }

   /* public Circle biggestCircle() {

        int max = arr[0];
        for(int i=0; i<arr.length; i++);
        if(arr[i]<max)
            max=arr[i];
        return ;
    }*/
    public void setRadio(int radio) {
        if(radio<0){
            throw new IllegalArgumentException(Integer.toString(radio));
        }
        else{
            this.radio = radio;
        }

    }

    public double getRadio() {
        return radio;
    }

    public double getArea(){
        return Math.PI*Math.pow(radio,2);
    }
}
