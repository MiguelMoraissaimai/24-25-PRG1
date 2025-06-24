import java.util.Scanner;

class MoleGame {
        public static void main(String[] args) {

                int turnos = 0;
                int puntos = 0;
                int topo = 0;

                Scanner input = new Scanner(System.in);

                while (turnos < 30) {

                        System.out.println(topo);

                        int[][] matriz = {
                                        { 4, 4, 4 },
                                        { 4, topo, 4 },
                                        { 4, 4, 4 }
                        };

                        for (int fila = 0; fila < matriz.length; fila++) {

                                for (int columna = 0; columna < matriz[fila].length; columna++)
                                        System.out.print(parse(matriz[fila][columna]));

                                System.out.println("|");
                        }

                        System.out.println("puntos: " + puntos);

                        int whack = input.nextInt();

                        if (topo == 1 && whack == 1) {

                                puntos++;
                                topo = 3;
                        }

                        if (topo == 0 && whack == 1){

                                topo = 2;

                        }

                        if (whack == 0){

                                topo = (int) (Math.random() * (2));

                                turnos++;

                        }
                }

                input.close();
        }

        static String parse(int valor) {
                final String[] TILES = { "(  )", "(‘’)", "[[]]", "[**]", "###" };
                return TILES[valor];
        }
}