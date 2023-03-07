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

public class Guerrero extends Personaje {
 
    private int hacha;
    private int durabilidad;
    
    //Metodos Calculo
    public Guerrero(String nombre, int puntosVida, int hacha, int durabilidad) {
        super(nombre, puntosVida, "Hacha");
        this.hacha = hacha;
        this.durabilidad = durabilidad;
    }
    
    //Get
    public int getHacha() {
        return hacha;
    }
    
    public int getDurabilidad(){
        return durabilidad;
    }
    
    //Set
    public void setFlechas(int hacha) {
        this.hacha = hacha;
    }
    
    public void setDurabilidad(int durab){
        this.durabilidad = durab;
    }
    
    //Metodos Calculo
    @Override
    public void atacar(){
        System.out.println(getNombre() + " embiste con su hacha.");
        hacha--;
        System.out.println("Pierde 15 de durabilidad: " + (durabilidad = durabilidad - 15)); 
    }
    
    @Override
    public void recuperar(){ 
	durabilidad = durabilidad + 10;
        System.out.println("Recarga 10 de durabilidad: " + durabilidad);
    }//fin metodo
}//fin clase
    
 
