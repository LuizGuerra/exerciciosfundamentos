import java.util.Scanner;
public class exercicio13{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("\fUm robô quer andar por um pequeno tabuleiro");
      System.out.println("Quando ele pisar no piso branco, ele dirá '0'");
      System.out.println("Quando ele pisar em piso preto, ele dirá '1'");
      System.out.println("Mas você tem que informar qual casa ele irá, assim ele dirá onde ele pisa.");
      System.out.println("As coordenadas serão dadas por linha e coluna.");
      System.out.println("Tenha em mente, que os números não podem ser maiores que 4, uma vez que ele está limitado pelo tamanho do tabuleiro.");
      System.out.println("Informe a coluna");
      int col = input.nextInt();
      System.out.println("Informe a linha");
      int lin = input.nextInt();
      if(col>4 || col<1 || lin>4 || lin<1) System.out.println("Valor(es) inválidos. Execute o programa novamente.");
      if(lin == col)System.out.println("Ele está no piso escuro!");
      if(col==1 && lin==3)System.out.println("Ele está no piso escuro!");
      if(col==3 && lin==1)System.out.println("Ele está no piso escuro!");
      if(col==2 && lin==4)System.out.println("Ele está no piso escuro!");
      if(col==4 && lin==2)System.out.println("Ele está no piso escuro!");
      
      if(col==1 && lin==2)System.out.println("Ele está no piso claro!");
      if(col==1 && lin==4)System.out.println("Ele está no piso claro!");
      if(col==2 && lin==1)System.out.println("Ele está no piso claro!");
      if(col==2 && lin==3)System.out.println("Ele está no piso claro!");
      if(col==3 && lin==2)System.out.println("Ele está no piso claro!");
      if(col==3 && lin==4)System.out.println("Ele está no piso claro!");
      if(col==4 && lin==1)System.out.println("Ele está no piso claro!");
      if(col==4 && lin==2)System.out.println("Ele está no piso claro!");
    }
}