/**
 * @author Yovani Royero Mena
 */
public class Condicionales {


    public static void main(String[] args) {
        esPositivo(5);
        esPositivo(-15);
        esPositivo(0);
        System.out.println("----while----");
        bucleWhile();
        System.out.println("----do while---");
        bucleDoWhile();
        System.out.println("----for---");
        bucleFor();
        System.out.println("----switch---");
        String estacion = "primavera";
        switchEstacion(estacion);
        estacion = "invierno";
        switchEstacion(estacion);
        estacion = "Prueba";
        switchEstacion(estacion);
    }

    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    static void esPositivo(int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero " + numeroIf + " es igual a 0");
        }
    }

    /**
     * Crea un bucle While, este bucle tendrá que tener como condición
     * que la variable numeroWhile sea inferior a 3,
     * el bloque de código que tendrá el bucle deberá:
     * Incrementar el valor de la variable en uno cada vez que se ejecute.
     * Mostrarlo por pantalla cada vez que se ejecute.
     */
    static void bucleWhile() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de numeroWhile: " + numeroWhile);
        }
    }


    /**
     * Para el bucle Do While, deberás crear la misma estructura que en el While,
     * pero solo se debe ejecutar una vez.
     */
    static void bucleDoWhile() {
        int numeroWhile = 0;
        do {
            numeroWhile += 3;
            System.out.println("Valor de numeroWhile: " + numeroWhile);
        }
        while (numeroWhile < 3);
    }

    /**
     * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
     * y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1
     * su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */
    static void bucleFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de numeroFor: " + numeroFor);
        }
    }

    /**
     * Por último, para el Switch, deberás crear la variable estacion, y distintos case
     * para las cuatro estaciones del año. Dependiendo del valor de la variable estacion
     * se deberá mandar un mensaje por consola informando de la estación en la que está.
     * También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */
    static void switchEstacion(String estacion) {
        switch (estacion) {
            case "invierno":
                System.out.println("La estacion es " + estacion);
                break;
            case "otonno":
                System.out.println("La estacion es " + estacion);
                break;
            case "primavera":
                System.out.println("La estacion es " + estacion);
                break;
            case "verano":
                System.out.println("La estacion es " + estacion);
                break;
            default:
                System.out.println(estacion + ", no es una estacion del anno");
                break;
        }
    }
}
