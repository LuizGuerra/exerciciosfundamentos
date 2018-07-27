import java.util.Scanner;
public class t3_g{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\fInforme o número total de elementos no primeiro conjunto: ");
        int conjAtotal = in.nextInt();
        while(conjAtotal<0){
            System.out.println();
            System.out.println("Valor impossível, por favor, tente novamente: ");
            conjAtotal = in.nextInt();
        }
        System.out.println();
        
        System.out.println("Informe os elementos do primeiro conjunto, um por um: ");
        double [] elementosA = new double[conjAtotal];
        for(int x=1; x<=conjAtotal; x++){
            System.out.print(x+"º elemento: ");
            elementosA[x-1] = in.nextDouble();
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
        
        double [] elementosB = new double[conjBtotal];
        for(int x=1; x<=conjBtotal; x++){
            System.out.print(x+"º elemento: ");
            elementosB[x-1] = in.nextDouble();
        }
        System.out.println();
        
        System.out.println("União dos dois conjuntos:");
        for(int x=0; x<cont1(elementosA, elementosB, conjAtotal, conjBtotal) ;x++){
            System.out.print(uniao(elementosA, elementosB, conjAtotal, conjBtotal) + ", ");
        }
        System.out.println("Intercessão dos dois conjuntos:");
        // (eleA, eleB, conjAtotal, conjBtotal)
        for(int x=0; x<cont2(elementosA, elementosB, conjAtotal, conjBtotal);x++){
            System.out.print(inter(elementosA, elementosB, conjAtotal, conjBtotal) + ", ");
        }
    }
    public static double [] uniao(double[] eleA, double[] eleB, int conjAtotal, int conjBtotal){
        double uni [] = new double[conjAtotal+conjBtotal];
        int cont=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=x;y<conjBtotal;y++){
                if(eleA[x]==eleB[y]){
                    uni[cont]=eleA[x];
                    cont++;
                }
                if(eleA[x]>eleB[y]){
                    uni[cont]=eleA[x];
                    cont++;
                    uni[cont]=eleB[x];
                    cont++;
                }
                if(eleA[x]<eleB[y]){
                    uni[cont]=eleB[x];
                    cont++;
                    uni[cont]=eleA[x];
                    cont++;
                }
            }
        }
        return uni;
    }
    public static double [] inter(double[] elementosA, double[] elementosB, int conjAtotal, int conjBtotal){
        double uni [] = new double[conjAtotal+conjBtotal];
        int cont=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=0;y<conjBtotal;y++){
                if(elementosA[x]==elementosB[y]){
                    uni[cont]=elementosA[x];
                    cont++;
                }
            }
        }
        return uni;
    }
    public static int cont1(double[] eleA, double[] eleB, int conjAtotal, int conjBtotal){
        double uni [] = new double[conjAtotal+conjBtotal];
        int cont=0;
        if(conjAtotal>=conjBtotal){
            for(int x=0;x<conjAtotal;x++){
                for(int y=x;y<conjBtotal;y++){
                    if(eleA[x]==eleB[y]){
                        uni[cont]=eleA[x];
                        cont++;
                    }
                    if(eleA[x]>eleB[y]){
                        uni[cont]=eleA[x];
                        cont++;
                        uni[cont]=eleB[x];
                        cont++;
                    }
                    if(eleA[x]<eleB[y]){
                        uni[cont]=eleB[x];
                        cont++;
                        uni[cont]=eleA[x];
                        cont++;
                    }
                }
            }
        }
        else{
            for(int x=0;x<conjBtotal;x++){
                for(int y=x;y<conjAtotal;y++){
                    if(eleA[x]==eleB[y]){
                        uni[cont]=eleA[x];
                        cont++;
                    }
                    if(eleA[x]>eleB[y]){
                        uni[cont]=eleA[x];
                        cont++;
                        uni[cont]=eleB[x];
                        cont++;
                    }
                    if(eleA[x]<eleB[y]){
                        uni[cont]=eleB[x];
                        cont++;
                        uni[cont]=eleA[x];
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    public static int cont2(double[] elementosA, double[] elementosB, int conjAtotal, int conjBtotal){
        double uni [] = new double[conjAtotal+conjBtotal];
        int cont=0;
        for(int x=0;x<conjAtotal;x++){
            for(int y=0;y<conjBtotal;y++){
                if(elementosA[x]==elementosB[y]){
                    uni[cont]=elementosA[x];
                    cont++;
                }
            }
        }
        return cont;
    }
}