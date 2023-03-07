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

public abstract class Personaje {

    private String nombre;
    private int puntosVida;
    private String arma;
    
    //Constructor
    public Personaje(String nombre, int puntosVida, String arma) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.arma = arma;
    }

    //Get
    public String getNombre() {
        return nombre;
    }
    
    public int getPuntosVida() {
        return puntosVida;
    }
    
    public String getArma() {
        return arma;
    }

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    //Metodos Calculo
    public abstract void atacar();
    public abstract void recuperar();
}//fin clase

