import java.util.Scanner;

class MoleGame2  {
        public static void main(String[] args) {

                int turnos = 0;
                int puntos = 0;
                int topo1 = 0;
                int topo2 = 0;
                int topo3 = 0;
                int topo4 = 0;
                int topo5 = 0;
                int topo6 = 0;
                int topo7 = 0;
                int topo8 = 0;
                int topo9 = 0;

                Scanner input = new Scanner(System.in);

                while (turnos < 15) {

                    int[][] matriz = {
                        { topo1, topo2, topo3 },
                        { topo4, topo5, topo6 },
                        { topo7, topo8, topo9 }
                    };

                    for (int fila = 0; fila < matriz.length; fila++) {
                        for (int columna = 0; columna < matriz[fila].length; columna++){
                            System.out.print(parse(matriz[fila][columna]));
                        }
                        System.out.println("|");
                    }

                    System.out.println("puntos: " + puntos);

                    int probabilidad = (int) (Math.random()*(9-1)+1);

                    System.out.println("¿golpear? (1=si 0=no)");

                    int whack = input.nextInt();

                    if(whack == 1){

                        System.out.println("¿donde quieres golpear bebe? (topos del 1 al 9 empezando desde arriba a la izquierda)");

                        int posicion = input.nextInt();

                        if(posicion != probabilidad){

                            if(posicion == 1){
                                topo1 = 2;   
                            }
                            
                            if(posicion == 2){
                                topo2 = 2;  
                            }
                            
                            if(posicion == 3){
                                topo3 = 2;      
                            }
                            
                            if(posicion == 4){
                                topo4 = 2;       
                            }
                            
                            if(posicion == 5){
                                topo5 = 2;    
                            }
                            
                            if(posicion == 6){
                                topo6 = 2;      
                            }
                            
                            if(posicion == 7){
                                topo7 = 2;       
                            }
                            
                            if(posicion == 8){
                                topo8 = 2;       
                            }
                            
                            if(posicion == 9){
                                topo9 = 2;        
                            }

                        }

                        if(posicion == probabilidad){

                            if(probabilidad == 1){
                                topo1 = 3;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 0; 
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 2){
                                topo1 = 0;
                                topo2 = 3;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 0;  
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 3){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 3;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 0;  
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 4){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 3;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 0;  
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 5){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 3;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 0;      
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 6){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 3;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 0;   
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 7){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 3;
                                topo8 = 0;
                                topo9 = 0; 
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 8){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 3;
                                topo9 = 0;  
                                
                                puntos++;
                            }
                            
                            if(probabilidad == 9){
                                topo1 = 0;
                                topo2 = 0;
                                topo3 = 0;
                                topo4 = 0;
                                topo5 = 0;
                                topo6 = 0;
                                topo7 = 0;
                                topo8 = 0;
                                topo9 = 3;   
                                
                                puntos++;
                            }
                        
                        }

                    }

                    if (whack == 0){

                        if(probabilidad == 1){
                            topo1 = 1;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 2){
                            topo1 = 0;
                            topo2 = 1;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 3){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 1;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 4){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 1;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 5){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 1;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 6){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 1;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 7){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 1;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 8){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 1;
                            topo9 = 0;                               
                        }

                        if(probabilidad == 9){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 1;                               
                        }

                        if(probabilidad == 0){
                            topo1 = 0;
                            topo2 = 0;
                            topo3 = 0;
                            topo4 = 0;
                            topo5 = 0;
                            topo6 = 0;
                            topo7 = 0;
                            topo8 = 0;
                            topo9 = 0;                               
                        }

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