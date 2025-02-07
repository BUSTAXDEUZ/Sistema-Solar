/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemasolar;

/**
 *
 * @author Fabia
 */

class PlanetaRocoso extends CuerpoCeleste implements Planeta {
    private double periodoOrbital; 

    public PlanetaRocoso(String nombre, double tamano, double distanciaAlSol, int numeroDeLunas, double periodoOrbital) {
        super(nombre, tamano, distanciaAlSol, numeroDeLunas);
        this.periodoOrbital = periodoOrbital;
    }

    @Override
    public double calcularAño() {
        return periodoOrbital; 
    }
}
