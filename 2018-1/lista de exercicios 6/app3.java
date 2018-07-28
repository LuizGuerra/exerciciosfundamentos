public class app3{
    double cont;
    public app3(){
        cont=0;
    }
    public String area(){
        cont++;
        if(cont==1){
            return "O sinal está vermelho";
        }
        if(cont==2){
            return "O sinal está verde";
        }
        cont=0;
        return "O sinal está amarelo";
    }
}