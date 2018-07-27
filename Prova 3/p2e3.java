import java.util.Scanner;
public class p2e3{
   public static void main (String args[]){
       Scanner in = new Scanner(System.in);
       System.out.print("\fInforme a quantidade de turmas: ");
       int nTurmas= in.nextInt();
       System.out.print("Informe a quantidade de alunos: ");
       int nAlunos = in.nextInt();
       int qA [][] = new int [nTurmas][nAlunos];
       for(int x=0;x<nTurmas;x++){
           for(int y=0; y<nAlunos;y++){
               System.out.print("Informe o nº de acessos do aluno nº "+(y+1)+": ");
               qA[nTurmas][nAlunos] = in.nextInt();
            }
       }
       System.out.println("A maior quantidade de acessos foi: ");
   }
   public static String maiorA(int [][] qA, int nTurmas, int nAlunos){
       double mAcessos [] = new double [nTurmas];
       for(int x=0;x<nTurmas;){
           for(int y=0; y<nAlunos;y++){
              mAcessos[x]=mAcessos[x]+qA[x][y];
           }
           mAcessos[x]=mAcessos[x]/30;
       }
       double batata=0;
       double turma = 0;
       for(int x=0; x<nTurmas; x++){
           if(batata<mAcessos[x]){
               batata=mAcessos[x];
               turma=x+1;
           }
       }
       return "A turma com maior acessos foi a turma nº "+turma+", com "+batata+" acessos em média";
   }
}