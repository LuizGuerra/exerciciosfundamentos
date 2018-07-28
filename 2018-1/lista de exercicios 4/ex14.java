import java.util.Scanner;
public class ex14{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int horaJ, minJ;
        System.out.println("\fDiga a hora e minutos em que o jogo começou.");
        System.out.println("Hora: ");
        int hora1 = in.nextInt();
        if(hora1<0 || hora1>24){System.out.println("Hora impossível. Talvez em Marte?");}
        else{
            System.out.println("Minuto: ");
            int min1 = in.nextInt();
            if(min1<0||min1>60){System.out.println("Minuto impossível.");}
            else{
                System.out.println("");
                System.out.println("Diga a hora e minutos em que o jogo terminou.");
                System.out.println("Hora: ");
                int hora2 = in.nextInt();
                if(hora2<0 || hora2>24){System.out.println("Hora impossível. Talvez em Marte?");}
                else{
                    System.out.println("Minuto: ");
                    int min2 = in.nextInt();
                    if(min2<0||min2>60){System.out.println("Minuto impossível.");}
                    else{
                        System.out.println("O jogo durou "+hora(hora1, hora2)+ " horas e "+min(min1, min2)+" minutos.");
                    }
                }
            }
        }
    }
    public static int hora(int hora1, int hora2){
        if(hora1>hora2){return 24-hora1+hora2;}
        return hora2-hora1;
    }
    public static int min(int min1, int min2){
        if(min1>min2){return 60-min1+min2;}
        return min2-min1;
    }   
}