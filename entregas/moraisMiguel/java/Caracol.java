import java.util.Scanner;
class Caracol{
    public static void main(String[]args){

        final int MAXIMO = 21;
        final int MINIMO = 1;
        final int DEPTH = 20;
        final String BASE = "|_____________________|";
        final String TOP = "|_____           _____|";
        final String WALL = "|_:.:.:.:.:.:.:.:.:.:_|";
        final String WATER = "|_###################_|";
        final String SNAIL = "|        _@)_/        |";
        final String CAR = "|_____  ô======ô  _____|";

        int waterDepth = 5;
        int snailDepth = (int) (Math.random()*(MAXIMO-MINIMO)+MINIMO);
        boolean carChance = (Math.random()<=0.35);


        System.out.println("el caracol cae " + snailDepth + " metros al inicio");
        System.out.println(carChance?CAR:TOP);

        for(int i=0; i<=DEPTH; i++){

            if(snailDepth==i){
                System.out.println(SNAIL + i);
                i=i+1;
            }

            if(i>DEPTH-waterDepth){
                System.out.println(WATER + i);
            } else {
                System.out.println(WALL + i);
            }     

        }
        System.out.println(BASE);
    }
}