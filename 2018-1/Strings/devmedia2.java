import java.util.Scanner;
public class devmedia2{
    public static void main(String args[]){
        System.out.println("\f");
        char c;
        int n;
        for (c='0'; c<='9'; c++) {
            n = c - 48;
            System.out.printf("%d X 10 = %d\n", n, (n * 10));
        }
    }
}