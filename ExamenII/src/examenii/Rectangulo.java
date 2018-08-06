/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii;

/**
 *
 * @author ESFOT
 */
public class Rectangulo implements FiguraAyP{
    private double lado1;
    private double lado2;
    private float hipotenusa;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public double calcularPerimetro(){
        System.out.println("Perimetro del Triangulo Recatngulo:");
        hipotenusa= (float)Math.sqrt((int)Math.pow(lado1,2)+(int)Math.pow(lado2,2));
    return hipotenusa;
    }
    
    @Override
    public double calcularArea(){
        System.out.println("Area del Triangulo Recatngulo:");
    return (lado1+lado2)/2;
    }
    
    @Override
    public double calcularAltura(){
        System.out.println("Altura:");
        return (lado1*lado2)/hipotenusa;
    }
    
}
