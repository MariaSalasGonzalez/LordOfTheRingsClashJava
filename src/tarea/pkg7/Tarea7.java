/*
 Universidad Estatal a Distancia Palmares
 Centro Comunitario Inteligente
 Programacion en Java
 Tarea 7
 Instructor: Dereck Jimenez
 Estudiante: Maria Salas
 Grupo 2
*/

package tarea.pkg7;
import java.util.ArrayList;

public class Tarea7 {
    public static void main(String[] args) {
    
    System.out.println("| LORD                |");
    System.out.println("|     OF              |");
    System.out.println("|       THE           |");
    System.out.println("|          RINGS      |");
    System.out.println("|               CLASH |");
    System.out.println("");
        
    Arquero arque1 = new Arquero("Legolas", 100, 50);
    Personaje arque2 = new Arquero("Faramir", 150, 100);
    Mago mago1 = new Mago("Gandalf", 50, 200);
    Guerrero guerre1 = new Guerrero("Aragorn", 100, 100, 100);
    
        ArrayList<Personaje> batallon = new ArrayList<>();
        batallon.add(arque1);
        batallon.add(arque2);
        batallon.add(mago1);
        batallon.add(guerre1);

        for(Personaje personaje : batallon){
            personaje.atacar();
            personaje.recuperar();
            System.out.println("");
        }         
    }//fin main
}//fin clase

