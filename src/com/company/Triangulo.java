package com.company;


import java.util.HashMap;

public class Triangulo extends Figura {

    public Triangulo(double A,double B,double C,double H,double Ba){
        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;
        this.altura = H;
        this.base = Ba;
    }

    private double ladoA;
    private double ladoB;
    private double ladoC;

    private double altura;
    private double base;


    public String tipoDeTriangulo(){
      if (ladoA == ladoB && ladoA == ladoC ){
        return "Equilatero";
      }else if(ladoA != ladoB && ladoA != ladoC){
          return "Escaleno";
      }else{
          return "Isosceles";
      }

    }

    public String mostrarDatos(){
        return "Es un triangulo " + tipoDeTriangulo()+" sus lados son A:"+ladoA+", B:"+ladoB+", C:"+ladoC;
    }

    @Override
    public double calcularArea() {
        return (this.altura*this.base)/2;
    }

    //All setters and getters down
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
