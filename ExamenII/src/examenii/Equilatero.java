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
public class Equilatero implements FiguraAyP {
    private double lado1;

    public Equilatero(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
     @Override
    public double calcularPerimetro(){
        System.out.println("Perimetro del Triangulo Equilatero:");
    return 3*lado1;
    }
    
    @Override
    public double calcularArea(){
        System.out.println("Area del Triangulo Equilatero:");
        
    return ((float)Math.sqrt(3)*lado1)/2*(int)Math.pow(lado1,2);
    }
    
    @Override
    public double calcularAltura(){
        System.out.println("Altura:");
        return((float)Math.sqrt(3)*lado1)/2;
    }
}
