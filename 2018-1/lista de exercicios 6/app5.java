public class app5{
    String nome;
    int matri;
    double fre;
    double [] nota;
    public app5(String nome, int matri, double fre, double [] nota){
        this.nome=nome;
        this.matri=matri;
        this.fre=fre;
        this.nota=nota;
    }
    public String getNome(){
        return nome;
    }
    public int getMatri(){
        return matri;
    }
    public double [] nota(){
        return nota;
    }
    public String apro(){
        double soma = 0;
        for(int x = 0; x<6; x++){
            soma=soma+nota[x];
        }
        soma=soma/6;
        if(soma>=7){
            return "aprovado, com média de "+soma;
        }
        return "reprovado, com média de "+soma;
    }
}