import java.util.Scanner;

class alchemy{
    public static void main(String[]args){

        // use booleans for unlocks
        // use two ints with switch for selection
        // run the selection process as a separate static
        // run the fusing system on a separate static with a quintillion if checks (I wanna kill myself)

        Scanner input = new Scanner(System.in);

        int seleccion;
        int estado = 0;
        int contador = 0;

        boolean jugando = true;

        while(jugando){

            while(estado == 0){

                System.out.println("1.elegir elementos");
                System.out.println("2.combinar");
                System.out.println("3.fin");

                seleccion = input.nextInt();
                estado = seleccion;
            }

            while(estado == 1){

                System.out.println("lista de elementos: ");

                for(int listado = 0; listado < 29; listado++){
                    System.out.println(listaElementos(listado));
                    contador++;
                }

                if(contador == 29){
                    estado = 0;
                }

            }

            while(estado == 2){

                System.out.println("elemento 1:");
                int seleccion1 = input.nextInt();
                
                System.out.println("elemento 2:");
                int seleccion2 = input.nextInt();

            }

            while(estado == 3){

                System.out.println("seguro? (si=1 no=2)");
                seleccion = input.nextInt();

                if(seleccion == 1){
                    jugando = false;
                    estado = 0;
                }

                if(seleccion == 2){
                    estado = 0;
                }
            }
        }
    }

    static String listaElementos(int listado){

        return switch (listado){

            case 1 -> "aire";
                
            case 2 -> "agua";
                
            case 3 -> "tierra";
                
            case 4 -> "fuego";

            case 5 -> "vapor";
                
            default -> "fin";
                
        };

    }
}