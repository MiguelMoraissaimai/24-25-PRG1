import java.util.Scanner;

class JuegosFor{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        if(text.equals("sigma")){

            for(int i=0;i<10;i++){
                for(int a=0;a<20;a++){
                    System.out.println("x".repeat(i));
                }
                System.out.println(i);
            }

    }

    }
}