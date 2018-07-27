public class app1{
    String l [][];
    int lista;
    public app1(int lista, String [][] l){
        this.l = l;
        this.lista=lista;
    }
    public String [] getLivroCod(String cod){
        String batata [] = new String [4];
        for(int x=0; x<lista; x++){
            if(l[x][1]==cod){
                for(int y=0; y<4; y++){
                    batata[y]=l[x][y];
                }
            }
        }
        return batata;
    }
    public String [] getLivroAutor(String autor){
        String batata [] = new String [4];
        int cont=0;
        for(int x=0; x<lista; x++){
            if(l[x][3]==autor){
                for(int y=0; y<4; y++){
                    batata[y]=l[x][y];
                    cont++;
                }
            }
            if(cont==1){
                break;
            }
        }
        return batata;
    }
    public void apagaLivroCod(String cod){
        int cont=0;
        for(int x=0; x<lista; x++){
            if(l[x][1]==cod){
                for(int y=0; y<4; y++){
                    l[x][y]=null;
                    cont++;
                }
            }
            if(cont==1){
                break;
            }
        }
    }
    public void apagaLivroAut(String autor){
        int cont=0;
        for(int x=0; x<lista; x++){
            if(l[x][3]==autor){
                for(int y=0; y<4; y++){
                    l[x][y]=null;
                    cont++;
                }
            }
            if(cont==1){
                break;
            }
        }
    }
    // public String getLivro(){
        
    //}
}