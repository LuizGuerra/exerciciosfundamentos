import java.util.Scanner;
public class e10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme as horas: ");
        int hora = in.nextInt();
        System.out.print("Informe os minutos: ");
        int min = in.nextInt();
        System.out.print("Informe os segundos: ");
        int seg = in.nextInt();
        
        app10 e1 = new app10(hora, min, seg);
        System.out.println();
        
        System.out.println("O horário passado informa que são: ");
        System.out.println("Dia: "+e1.getDia());
        System.out.println("Hora: "+e1.getHora());
        System.out.println("Minuto: "+e1.getMin());
        System.out.println("Segundo: "+e1.getSeg());
        System.out.println();
        
        System.out.print("A hora dada em segundos é: "+e1.seg());
        System.out.println();System.out.println();
        
        System.out.print("A hora dada em minutos é: "+e1.min());
        System.out.println();System.out.println();
        
        System.out.print("Faltam  "+e1.falta()+" segundos pra acabar o dia");
        System.out.println();System.out.println();
        
        System.out.println("Informe quantas horas se passaram (atualizando horário)");
        System.out.print("Hora: "); hora = in.nextInt();
        System.out.print("Minutos: "); min = in.nextInt();
        System.out.print("Segundos: "); seg = in.nextInt();
        e1.puclic(hora, min, seg);
        System.out.println();
        
        System.out.println("O horário passado informa que são: ");
        System.out.println("Dia: "+e1.getDia());
        System.out.println("Hora: "+e1.getHora());
        System.out.println("Minuto: "+e1.getMin());
        System.out.println("Segundo: "+e1.getSeg());
        System.out.println();
        
        System.out.println("Informe um novo horário:");
        System.out.print("Informe as horas: ");
        hora = in.nextInt();
        System.out.print("Informe os minutos: ");
        min = in.nextInt();
        System.out.print("Informe os segundos: ");
        seg = in.nextInt();
        app10 e2 = new app10(hora, min, seg);
        System.out.println();
        
        System.out.println("A diferença de horários é de: ");
        System.out.println((e1.getHora()-e2.getHora())+" horas.");
        System.out.println((e1.getMin()-e2.getMin())+" minutos.");
        System.out.println((e1.getSeg()-e2.getSeg())+" segundos.");
    }
}