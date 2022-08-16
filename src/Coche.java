/**
 * @author Yovani Royero Mena
 */
public class Coche {

    private int numeroPuertas = 0;

    public void incrementarPuerta(){
        numeroPuertas += 1;
    }


    public int getNumeroPuertas(){
        return this.numeroPuertas;
    }

    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();

        System.out.println("Cantidad de puertas: " + miCoche.getNumeroPuertas());
    }


}
