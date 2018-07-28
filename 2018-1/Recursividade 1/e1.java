/**
 * Faça um programa que leia um valor inteiro e não negativo (garanta isso), 
 * calcula e escreve o fatorial desse valor. 
 * Para calcular o fatorial use um método recursivo.
 */

import java.util.Scanner;
public class e1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor inteiro e positivo: ");
        int num = in.nextInt();
        while (num<=0){
            System.out.println("");
            System.out.println("Valor incorreto. Por favor, digite um valor inteiro e positivo: ");
            num = in.nextInt();
        }
        System.out.println();
        System.out.println("O fatorial de "+num+ " é: " +fat(num));
    }
    public static int fat(int num){
        if (num<=1) return 1;
        return num * fat(num-1);
    }
}