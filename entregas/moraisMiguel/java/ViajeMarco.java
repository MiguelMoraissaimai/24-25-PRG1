import java.util.Scanner;

class ViajeMarco{

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

            final double VELOCIDAD_MAXIMA = 15;
            final double VELOCIDAD_MINIMA = 10;
            final double TIEMPO_MAXIMO = 10;
            final double TIEMPO_MINIMO = 8;
            final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
            final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;
            final double PROBABILIDAD_MONO_ESCAPA = 0.15;
            final double PROBABILIDAD_MONO_CANSA = 0.25;
            final double DISTANCIA_MADRE_INICIAL =  350;
            final double TIEMPO_MAXIMO_MADRE = 9;
            final double TIEMPO_MINIMO_MADRE = 6;
            final double VELOCIDAD_MAXIMA_MADRE = 9;
            final double VELOCIDAD_MINIMA_MADRE = 6;

            double distanciaMadre;
            double distanciaMarco;
            double distanciaEncuentro;
            double velocidadMarco;
            double velocidadMadre;
            double tiempoMarco;
            double tiempoMadre;
            double avanceMarco;
            double avanceMadre;
            double probabilidadLluvia;
            double probabilidadMonoEscapa;
            double probabilidadMonoCansa;
            int dia;

            distanciaMadre = DISTANCIA_MADRE_INICIAL;
            distanciaMarco = 0;
            distanciaEncuentro = 80;
            dia = 0;

            while(distanciaMadre>0){
            dia = dia+1;      
            probabilidadMonoCansa = Math.random();
            probabilidadMonoEscapa = Math.random();
            probabilidadLluvia = Math.random();

            velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA+1)+VELOCIDAD_MINIMA;
            velocidadMadre = Math.random()*(VELOCIDAD_MAXIMA_MADRE-VELOCIDAD_MINIMA_MADRE+1)+VELOCIDAD_MINIMA_MADRE;

            System.out.println("Marco Vi " + velocidadMarco);
            System.out.println("Madre Vi " + velocidadMadre);

            System.out.println("Dia: " + dia);

            if(probabilidadLluvia<=PROBABILIDAD_LLUVIA_FUERTE){
                System.out.println("Lluvia fuerte");
                velocidadMarco = velocidadMarco * 0.25;
                velocidadMadre = velocidadMadre * 0.5;
            }else if(probabilidadLluvia<=PROBABILIDAD_LLUVIA_NORMAL){
                System.out.println("Lluvia fina");
                velocidadMarco = velocidadMarco * 0.75;
                velocidadMadre = velocidadMadre * 0.75;
            }else{
                System.out.println("Buen tiempo");
            }

            System.out.println("Madre V " + velocidadMadre);

            tiempoMarco = Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO+1)+TIEMPO_MINIMO;
            tiempoMadre = Math.random()*(TIEMPO_MAXIMO_MADRE-TIEMPO_MINIMO_MADRE+1)+TIEMPO_MINIMO_MADRE;

            System.out.println("Marco Ti " + tiempoMarco);
            System.out.println("Madre Ti " + tiempoMadre);

            if(probabilidadMonoEscapa<PROBABILIDAD_MONO_ESCAPA){
                System.out.println("El mono se escapa!!!");
                tiempoMarco = tiempoMarco-2;
            }

            System.out.println("Marco T " + tiempoMarco);

            if(probabilidadMonoCansa<PROBABILIDAD_MONO_CANSA){
                System.out.println("El mono se cansa. :(");
                velocidadMarco = velocidadMarco * 0.9;
            }

            System.out.println("Marco V " + velocidadMarco);
    
            avanceMarco = velocidadMarco*tiempoMarco;
            avanceMadre = velocidadMadre*tiempoMadre;
            distanciaMadre = (distanciaMadre + avanceMadre) - avanceMarco;
            distanciaMarco = distanciaMadre - avanceMarco;
            distanciaEncuentro = distanciaMadre - distanciaMarco;

            System.out.println("Marco avanza: " + avanceMarco);
            System.out.println("Madre esta a:" + distanciaMadre);
            entrada.nextLine();
        }
        
        entrada.close();
    }
}