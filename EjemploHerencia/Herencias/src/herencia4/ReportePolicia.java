/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String cod, ArrayList<Policia> policias) {
        super(cod);
        setLista(policias);
    }

    public void setPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades += lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }

    public void setLista(ArrayList<Policia> lis) {
        lista = lis;
    }

    public double getPromedioMatriculas() {
        return promedioEdades;
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Policia\n\n";

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }

        cadena = String.format("%s\nPromedio de Edades: %.2f\n",
                cadena,
                promedioEdades);

        return cadena;
    }
    
}
