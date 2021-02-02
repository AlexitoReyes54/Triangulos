package com.company;

public class Main {

    public static void main(String[] args) {
	Triangulo t = new Triangulo(3,4,5,5,5);
	Triangulo z = new Triangulo(3,3,3,5,5);
	Triangulo x = new Triangulo(3,3,5,5,5);
	System.out.println(t.mostrarDatos());
	System.out.println(x.mostrarDatos());
	System.out.println(z.mostrarDatos());

    }
}
