import java.util.Scanner;
public class e5{
    public static void main(String batman[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDigite um ponto x e y de um plano cartesiano: ");
        double x1=in.nextInt();double y1=in.nextInt();
        System.out.println("Digite outro ponto x e y do plano cartesiano: ");
        double x2=in.nextInt();double y2=in.nextInt();
        System.out.println("A distância euclidiana desses pontos é: "+dEuclid(x1,y1,x2,y2));
        System.out.println("A distância de Manhattan desses pontos é: "+dManha(x1,y1,x2,y2));
        System.out.println("");
    }
    public static double dEuclid(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }
    public static double dManha(double x1, double y1, double x2, double y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}
