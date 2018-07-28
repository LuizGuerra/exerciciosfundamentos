import java.util.Scanner;
public class e1{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme quantos livros serão listados: ");
        int lista = in.nextInt();
        String l [][] = new String [lista][4];
        app1 e1 = new app1(livro(lista, l));
        System.out.println("\fDeseja encontrar um livro na biblioteca informada? Escreva sim ou nao");
        String deseja = in.next();
        while(deseja.equals("sim")){
            System.out.print("Digite 1 para informar o código do livro, 2 pra informar o autor do livro: ");
            int ha = in.nextInt();
            while(ha!=1 || ha!=2){
                System.out.print("Valor inválido. tente novamente: ");
                ha = in.nextInt();
            }
            switch(ha){
                case 1: {
                    for(int x=0; x<4; x++){
                        System.out.println(e1.getLivroCod()[x]);
                    }
                }
                case 2: {
                    for(int x=0; x<4; x++){
                        System.out.println(e1.getLivroAutor()[x]);
                    }
                }
            }
        }
        System.out.println();
    }
    public static String [] livro(int lista, String l [][]){
        Scanner in = new Scanner(System.in);
        for(int x=0; x<lista; x++){
            System.out.println("\nInforme os dados do livro:\n");
            //
            System.out.print("Nome: ");
            l[x][0]= in.nextLine();
            //
            System.out.print("Código: ");
            l[x][1]=in.next();
            //
            int cont=0;
            int sla=0;
            //
            while(sla==0){
                for(int y=0; y<x; y++){
                    if(l[x]==l[y]){
                        cont++;
                    }
                    if(cont==1){
                        System.out.print("Código já em uso, tente outro código: ");
                        l[x][1]=in.next();
                        break;
                    }
                }
                if(cont==0){
                    sla=1;
                }
            }
            //
            System.out.print("Ano de publicação: ");
            l[x][2]=in.next();
            //
            System.out.print("Autores: ");
            String autores;
            autores = in.nextLine();
            autores = in.nextLine(); // prof, não me pergunte o porque, mas só funciona fazendo assim :'(
            l[x][3]=autores;
        }
        return l;
    }
}