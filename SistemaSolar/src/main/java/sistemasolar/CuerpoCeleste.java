/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemasolar;

/**
 *
 * @author Fabia
 */

abstract class CuerpoCeleste {
    protected String nombre;
    protected double tamano; 
    protected double distanciaAlSol; 
    protected int numeroDeLunas;

    public CuerpoCeleste(String nombre, double tamano, double distanciaAlSol, int numeroDeLunas) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.distanciaAlSol = distanciaAlSol;
        this.numeroDeLunas = numeroDeLunas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public int getNumeroDeLunas() {
        return numeroDeLunas;
    }
}
