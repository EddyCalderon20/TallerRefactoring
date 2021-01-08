package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ayudante extends Estudiante{
    protected List<Paralelo> paralelos ;
   
    Ayudante(){
    	super();
        paralelos = new ArrayList<>();
        Collections.addAll(paralelos);  
        paralelos = Collections.unmodifiableList(paralelos);  
    }
       
    public List<Paralelo> getParalelos() {
        return paralelos;
    }
    
    public void añadiParalelos(Paralelo paralelo){
        //añade nuevos paralelos donde debe dar sus ayudantías.
    }
    
    public void eliminarParalelos(Paralelo paralelo){
        //elimina paralelos donde debe dar sus ayudantías.
    }

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
