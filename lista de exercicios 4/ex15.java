import java.util.Scanner;
public class ex15{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme sua matrícula: ");
        int matricula = in.nextInt();
        System.out.println("Informe a nota de sua primeira prova: ");
        double p1 = in.nextDouble();
        if(p1<0||p1>10){System.out.println("Nota impossível. Tente novamente.");}
        else{
            System.out.println("Informe a nota de sua segunda prova: ");
            double p2 = in.nextDouble();
            if(p2<0||p2>10){System.out.println("Nota impossível. Tente novamente.");}
            else{
                System.out.println("Informe a nota de sua terceira prova: ");
                double p3 = in.nextDouble();
                if(p3<0||p3>10){System.out.println("Nota impossível. Tente novamente.");}
                else{
                    System.out.println("Informe a nota media de seus exercícios: ");
                    double mE = in.nextDouble();
                    double mA=0;
                    if(mE<0||mE>10){System.out.println("Nota impossível. Tente novamente.");}
                    else{
                        switch (aprovacao(p1, p2, p3, mE, mA)){
                            case ("A"): System.out.println("Conceito A. Média de aproveitamento: "+mA(p1, p2, p3, mE)+ ". Aluno aprovado."); break;
                            case ("B"): System.out.println("Conceito B. Média de aproveitamento: "+mA(p1, p2, p3, mE)+ ". Aluno aprovado."); break;
                            case ("C"): System.out.println("Conceito C. Média de aproveitamento: "+mA(p1, p2, p3, mE)+ ". Aluno aprovado."); break;
                            case ("D"): System.out.println("Conceito D. Média de aproveitamento: "+mA(p1, p2, p3, mE)+ ". Aluno reprovado."); break;
                            case ("E"): System.out.println("Conceito E. Média de aproveitamento: "+mA(p1, p2, p3, mE)+ ". Aluno reprovado."); break;
                        }
                    }
                }
            }
        }
        System.out.println("");
    }
    public static String aprovacao(double p1, double p2, double p3, double mE, double mA){
        mA = ((p1)+(p2*2)+(p3*3)+(mE))/7;
        if(mA>=9) return "A" +mA;
        else if(mA>=7.5) return "B"+" Média de aproveitamento: " + mA;
        else if(mA>=6) return "C";
        else if(mA>=4) return "D";
        return "E";
    }
    public static double mA(double p1, double p2, double p3, double mE){
        return ((p1)+(p2*2)+(p3*3)+(mE))/7;
    }
}