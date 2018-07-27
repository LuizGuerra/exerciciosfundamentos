import java.util.Scanner;
public class t3_g_easymode{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("\fInforme o número total de elementos no primeiro conjunto: ");
        int conjAtotal = in.nextInt();
        while(conjAtotal<0){
            System.out.println();
            System.out.println("Valor impossível, por favor, tente novamente: ");
            conjAtotal = in.nextInt();
        }
        System.out.println();
        
        System.out.println("Informe os elementos do primeiro conjunto, um por um: ");
        int [] elementosA = new int[conjAtotal];
        for(int x=1; x<=conjAtotal; x++){
            System.out.print(x+"º elemento: ");
            elementosA[x-1] = in.nextInt();
        }
        System.out.println();
        
        System.out.println("Informe o número total de elementos no segundo conjunto: ");
        int conjBtotal = in.nextInt();
        while(conjBtotal<0){
            System.out.println();
            System.out.println("Valor impossível, por favor, tente novamente: ");
            conjBtotal = in.nextInt();
        }
        System.out.println();
        
        System.out.println("Informe os elementos do segundo conjunto, um por um: ");
        int [] elementosB = new int[conjBtotal];
        for(int x=1; x<=conjBtotal; x++){
            System.out.print(x+"º elemento: ");
            elementosB[x-1] = in.nextInt();
        }
        System.out.println();
        
        // aqui acaba a parte do usuário
        
        int contInt=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=x;y<conjBtotal;y++){
                if(elementosA[x]==elementosB[y]){
                    contInt++;
                }
            }
        }
        int contUni=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=x;y<conjBtotal;y++){
                if(elementosA[x]==elementosB[y]){
                    contUni++;
                }
                if(elementosA[x]>elementosB[y]){
                    contUni++;
                    contUni++;
                }
                if(elementosA[x]<elementosB[y]){
                    contUni++;
                    contUni++;
                }
            }
        }
        // aqui acaba os contadores
        int uni [] = new int[contUni];
        int cont=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=x;y<conjBtotal;y++){
                if(elementosA[x]==elementosB[y]){
                    uni[cont]=elementosA[x];
                    cont++;
                }
                if(elementosA[x]>elementosB[y]){
                    uni[cont]=elementosA[x];
                    cont++;
                    uni[cont]=elementosB[x];
                    cont++;
                }
                if(elementosA[x]<elementosB[y]){
                    uni[cont]=elementosB[x];
                    cont++;
                    uni[cont]=elementosA[x];
                    cont++;
                }
            }
        }
        int inte [] = new int[contInt];
        cont=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=x;y<conjBtotal;y++){
                if(elementosA[x]==elementosB[y]){
                    for(int z=0; z<cont; z++){
                        if(inte[z]==elementosA[x]){
                            break;
                        }
                        inte[cont]=elementosB[y];
                        cont++;
                    }
                }
            }
        }
        
        System.out.println("União dos dois conjuntos:");
        for(int x=0; x<contUni ;x++){
            System.out.print(uni[x] + ", ");
        }
        System.out.println();
        System.out.println("Intercessão dos dois conjuntos:");
        for(int x=0; x<contInt;x++){
            System.out.print(inte[x] + ", ");
        }
    }
}