/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String cod, ArrayList<Estudiante> estudiantes) {
        super(cod);
        setLista(estudiantes);
    }

    public void setPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas += lista.get(i).getMatricula();    
        }
        promedioMatriculas = promedioMatriculas/lista.size();
    }

    public void setLista(ArrayList<Estudiante> lis) {
        lista = lis;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }
    
    @Override   
    public String toString(){
        String cadena = "Reporte Estudiante\n\n";
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        
        cadena = String.format("%s\nPromedio de Matriculas: %.2f\n",
                cadena,
                promedioMatriculas);
               
        
        return cadena;
    }
}
