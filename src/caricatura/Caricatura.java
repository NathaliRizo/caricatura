package caricatura;

import java.util.Date;

public class Caricatura {

    private String nombre;
    private int numeroDeManos;
    private int numeroDePies;
    private Date fechaDeCreacion;
    private String especie;
    private boolean tieneRopa;
    private int altura;
    private int numeroDeVidas;
    

public void herir(){
        this.numeroDeVidas =0;
    }
    
public void herir(int Vidas){
        if(Vidas<=this.numeroDeVidas){
            System.out.println("Lastimaron a tu personaje!");
        }else{
            this.numeroDeVidas = Vidas;
            System.out.println("Vidas restantes: " + String.valueOf(Vidas));            
        }
        
    }


public void cambiarEspecie(){
        this.especie;
    }

public void cambiarEspecie (String nuevaEspecie){
        if(nuevaEspecie<=this.especie){
            System.out.println("El carro no acelerará");
        }else{
            this. = nuevaVelocidad;
            System.out.println("Nueva velocidad: " + String.valueOf(nuevaVelocidad) + " Km/h");            
        }
        
    }


}
