public class upercase{
    public static void main(String []args){
        String palavra = "abcde";
        palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
        System.out.println(palavra);
    }
}