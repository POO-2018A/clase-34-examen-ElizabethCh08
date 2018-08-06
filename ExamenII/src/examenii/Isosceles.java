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
public class Isosceles implements FiguraAyP{
   
    private double lado1;
    private double lado2=lado1;
    private double base;

    public Isosceles(double lado1, double base) {
        this.lado1 = lado1;
        this.base = base;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    @Override
    public double calcularPerimetro(){
        System.out.println("Perimetro del Triangulo Isosceles:");
        float hipotenusa= (float)Math.sqrt((int)Math.pow(lado1,2)+(int)Math.pow(lado2,2));
    return hipotenusa;
    }
    
    @Override
    public double calcularArea(){
        System.out.println("Area del Triangulo Isosceles:");
    return (base*(float)Math.sqrt((int)Math.pow(lado1,2)-(int)Math.pow(base,2)/4)/2);
    }
    
    @Override
    public double calcularAltura(){
        System.out.println("Altura:");
        return (float)Math.sqrt((lado1*lado2)-((int)Math.pow(base,2)/4));
    }
    
}
