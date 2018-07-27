public class ex4{
    public static void main (String args[]){
        int n;
        int resultado;
        for(int x = 999; x>=100; x--){
            for(int y = 999; x>=100; x--){
                int mult = x*y;
                palindrome(mult) ? resultado=mult : null ;
            }
        }
    }
    public static boleean palidrome(int n){
        String m = ""+n;
        String backword = "";
        for(int i=m.length()-1; i>=0; i--){
            backword = backword + m.substring(i, i+1);
        }
        if(m.equals(backword)){return true;}
        return false;
    }
}