package Question5;

import java.lang.Math;

public class Triangulo {

    private double a, b, c;

    public Triangulo(double a, double b, double c) throws DimensoesInvalidasException {
        if (this.condicaoDeExistenciaDoTriangulo()) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new DimensoesInvalidasException("Números Invalidos");
        }

    }

    public boolean condicaoDeExistenciaDoTriangulo() {
        return (a < b + c && a > Math.abs(b - c) && b < a + c && b > Math.abs(a - c) && c < b + a
                && c > Math.abs(b - a));
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) throws DimensoesInvalidasException {
        if (this.condicaoDeExistenciaDoTriangulo()) {
            this.a = a;
        } else {
            throw new DimensoesInvalidasException("Número Inválido");
        }

    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) throws DimensoesInvalidasException {
        if (this.condicaoDeExistenciaDoTriangulo()) {
            this.b = b;
        } else {
            throw new DimensoesInvalidasException("Número Inválido");
        }

    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) throws DimensoesInvalidasException {
        if (this.condicaoDeExistenciaDoTriangulo()) {
            this.c = c;
        } else {
            throw new DimensoesInvalidasException("Número Inválido");
        }

    }

}
