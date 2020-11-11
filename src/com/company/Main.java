package com.company;

public class Main {

    public abstract static class Shape{
        public abstract double area();
        public abstract double perimetro();
    }
    static class Cuadrado extends Shape {
        protected double sideLength;

        public Cuadrado(double sideLength) {
            this.sideLength = sideLength;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }

        public double getSideLength() {
            return sideLength;
        }

        public double area() {
            return sideLength * sideLength;
        }

        public double perimetro() {
            return sideLength * 4;
        }
    }
    static class Circulo extends Shape{

        public static final double PI = 3.1416;

        protected double radio;
        public Circulo(double radio){
            this.radio = radio;
        }
        public void  setRadio(double radio){
            this.radio = radio;
        }

        public double getDiametro(){
            return radio*2;
        }

        public double area(){
            return PI * radio * radio;
        }

        public double perimetro(){
            return PI * getDiametro();
        }
    }



    public static void  main (String[] args){
        Shape shape = new Shape() {
            public double area() {
                return 0;
            }

            public double perimetro() {
                return 0;
            }
        };
        System.out.println(shape.area());
        System.out.println(shape.perimetro());

        Cuadrado cuadrado = new Cuadrado(10);
        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());

        Circulo ciruclo = new Circulo(5);
        System.out.println(ciruclo.area());
        System.out.println(ciruclo.perimetro());

    }
}


