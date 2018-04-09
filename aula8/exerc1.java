public class exerc1{
    public static void main(String args[]){
        boolean expr1, expr2;
        System.out.println("\fTabela verdade do Operador &&");
        System.out.println("Expr1\tExpr2+\tExpr1 && Expr2");
        expr1 = false; expr2 = false;
        System.out.println(expr1+"\t"+expr2+"\t"+(expr1 && expr2));
        expr1 = false; expr2 = true;
        System.out.println(expr1+"\t"+expr2+"\t"+(expr1 && expr2));
        expr1 = true; expr2 = false;
        System.out.println(expr1+"\t"+expr2+"\t"+(expr1 && expr2));
        expr1 = true; expr2 = true;
        System.out.println(expr1+"\t"+expr2+"\t"+(expr1 && expr2));
        
        }
    }