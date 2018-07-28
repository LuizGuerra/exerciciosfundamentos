import java.util.Scanner;
public class e4{
    public static void main(String batman[]){
        Scanner in = new Scanner(System.in);
        
        int hora, minuto, segundo;
        
        do{
            System.out.println("Informe uma hora válida [0;23]: ");
            hora=in.nextInt();
        }while(hora<0 || hora>23);
        do{
            System.out.println("Informe um minuto válido [0;59]: ");
            minuto=in.nextInt();
        }while(minuto<0 || minuto>59);
        do{
            System.out.println("Informe um segundo válido [0;59]: ");
            segundo=in.nextInt();
        }while(segundo<0 || segundo>59);
        
        System.out.println("Tempo que passou desde que o dia começou(em segundos): " + 
                            tempoQuePassou(hora,minuto,segundo));
    }
    public static int tempoQuePassou(int h, int m, int s){
        return h*360+m*60+s;
    }
}
