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

public class Arquero extends Personaje {

    private int flechas;

    //Constructor
    public Arquero(String nombre, int puntosVida, int flechas) {
        super(nombre, puntosVida, "Arco");
        this.flechas = flechas;
    }
    
    //Get
    public int getFlechas() {
        return flechas;
    }

    //Set
    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }
    
    //Metodos Calculo
    @Override
    public void atacar(){
        System.out.println(getNombre() + " lanza una flecha");
        flechas--;
    }//fin metodo
    
    @Override
    public void recuperar(){
	flechas = flechas + 5;
        System.out.println("Recarga 5 flechas: " + flechas);
    }//fin metodo
}//fin clase


