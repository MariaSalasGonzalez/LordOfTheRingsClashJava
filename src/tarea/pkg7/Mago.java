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

public class Mago extends Personaje {

    private int magia;
    
    //Constructor
    public Mago(String nombre, int puntosVida, int magia) {
        super(nombre, puntosVida, "Vara");
        this.magia = magia;
    }

    //Get
    public int getMagia() {
        return magia;
    }

    //Set
    public void setMagia(int magia) {
        this.magia = magia;
    }
    
    //Metodos Calculo
    @Override
    public void atacar(){
        System.out.println(getNombre() + " conjura un hechizo");
        magia -= 25;
        System.out.println("Pierde 25 de magia: " + magia);
    }//fin metodo
    
    @Override
    public void recuperar(){ 
	magia = magia + 10;
        System.out.println("Recupera 10 de magia: " + magia);
    }//fin metodo

}//fin clase