import java.util.Scanner;

class piedraPapelTijera{
    public static void main(String[] args){

        final int eleccion;
        Scanner scanner = new Scanner(System.in);

        final int MAXIMO = 4;
        final int MINIMO = 1;


        eleccion = (int) (Math.random()*(MAXIMO-MINIMO)+MINIMO);


        Scanner entrada = new Scanner(System.in);
        int eleccionUsuario;

        System.out.println("Elija: piedra(1), papel(2), tijera(3).");
        eleccionUsuario = entrada.nextInt();

        scanner.close();

        final int EMPATE = "Habeis escogido " + eleccion + ", termina empate.";
        final int GANASTE = "Escogiste " + eleccionUsuario + " y yo escogi " + eleccion + ", tu ganas.";
        final int PERDISTE = "Escogiste " + eleccionUsuario + " y yo escogi " + eleccion + ", tu pierdes.";


        String descriptor;
        resultado = eleccion = eleccionUsuario ? EMPATE
        : eleccion = 1 && eleccionUsuario = 2 ? GANASTE
        : eleccion = 2 && eleccionUsuario = 3 ? GANASTE
        : eleccion = 3 && eleccionUsuario = 1 ? GANASTE
        : eleccion = 1 && eleccionUsuario = 3 ? PERDISTE
        : eleccion = 2 && eleccionUsuario = 1 ? PERDISTE
        : eleccion = 3 && eleccionUsuario = 2 ? PERDISTE
        :

        System.out.println(descriptor);
    }
}