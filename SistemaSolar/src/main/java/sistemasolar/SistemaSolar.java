/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemasolar;

/**
 *
 * @author Fabia
 */

import javax.swing.JOptionPane;

public class SistemaSolar {
    public static void main(String[] args) {
        Planeta[] planetas = new Planeta[100]; // Arreglo para almacenar planetas
        int contador = 0;
        String menu = "1. Agregar Planeta Rocoso\n2. Agregar Planeta Gaseoso\n3. Mostrar Planetas\n4. Salir";
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    if (contador < planetas.length) {
                        agregarPlanetaRocoso(planetas, contador);
                        contador++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar más planetas.");
                    }
                    break;
                case 2:
                    if (contador < planetas.length) {
                        agregarPlanetaGaseoso(planetas, contador);
                        contador++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar más planetas.");
                    }
                    break;
                case 3:
                    mostrarPlanetas(planetas, contador);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void agregarPlanetaRocoso(Planeta[] planetas, int contador) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del planeta rocoso:");
        double tamano = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño (km):"));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia al sol (millones de km):"));
        int lunas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de lunas:"));
        double periodoOrbital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo orbital (días):"));

        planetas[contador] = new PlanetaRocoso(nombre, tamano, distancia, lunas, periodoOrbital);
        JOptionPane.showMessageDialog(null, "Planeta rocoso agregado: " + nombre);
    }

    private static void agregarPlanetaGaseoso(Planeta[] planetas, int contador) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del planeta gaseoso:");
        double tamano = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño (km):"));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia al sol (millones de km):"));
        int lunas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de lunas:"));
        double periodoOrbital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo orbital (días):"));

        planetas[contador] = new PlanetaGaseoso(nombre, tamano, distancia, lunas, periodoOrbital);
        JOptionPane.showMessageDialog(null, "Planeta gaseoso agregado: " + nombre);
    }

    private static void mostrarPlanetas(Planeta[] planetas, int contador) {
        StringBuilder sb = new StringBuilder("Planetas:\n");
        for (int i = 0; i < contador; i++) {
            sb.append("Nombre: ").append(planetas[i].getNombre())
              .append(", Tamaño: ").append(planetas[i].getTamano())
              .append(" km, Distancia al Sol: ").append(planetas[i].getDistanciaAlSol())
              .append(" millones de km, Lunas: ").append(planetas[i].getNumeroDeLunas())
              .append(", Año: ").append(planetas[i].calcularAño()).append(" días\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
