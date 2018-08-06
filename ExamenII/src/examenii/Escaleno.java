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
public class Escaleno implements FiguraAyP {
    
    private double lado1;
    private double lado2;
    private double lado3;
    private double semi;

    public Escaleno(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularPerimetro(){
        System.out.println("Perimetro del Triangulo Escaleno:");
    return lado1+lado2+lado3;
    }
    
    @Override
    public double calcularArea(){
        System.out.println("Area del Triangulo Escaleno:");
        semi=(lado1+lado2+lado3)/2;
    return (float)Math.sqrt(semi*(semi-lado1)*(semi-lado2)*(semi-lado3));
    }
    
    @Override
    public double calcularAltura(){
        System.out.println("Altura:");
        return (2/lado1)*(float)Math.sqrt(semi*(semi-lado1)*(semi-lado2)*(semi-lado3));
    }
    
}
