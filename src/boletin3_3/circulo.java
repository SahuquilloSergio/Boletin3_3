package boletin3_3;
import java.util.Scanner;
class circulo {
    private double radio;
    private final double Pi=3.14;
    private double area;
    private double perimetro;
  
 Scanner sc = new Scanner(System.in);   
    //Metodos

public circulo(){
    }
     public circulo(double r){
        radio = r;
    }
     
 public double setRadio(){
       System.out.println("Escriba el valor del Radio:");
       radio = sc.nextDouble();
       //System.out.println("Valor del Radio: = " + radio);
        return radio;
    }


  
    //Metodo para calcular o area
    public double getArea(){
        area = (Math.pow(radio, 2)*Pi);
        System.out.println("Valor Del Area = " + area + "cm^2");
        return area;
    }
    
   //Metodo para saber la longitud de la circunferencia
    public double getLonxitudeCircunferencia(){
        perimetro = ((2*radio)*Pi);
        System.out.println("Valor del Perimetro = " + perimetro + "cm");
        return perimetro;
        
    }
}