
/**
 * Escreva a descrição da classe Trabalho01 aqui.
 * @matricula (17104157-7, 17104106-4)
 * @author (Luiz Henrique Borges M. e Enzo Russo) 
 * @version (03/09/2017)
 */
import java.util.Scanner;
public class Trabalho1 
{

    public static void main (String[] args) 
    { 
        Scanner in = new Scanner (System.in);
        
        System.out.println("Qual o formato desejado para o serviço? Temos as opções de: Cubo, Paralelepipedo, Cilindro, Esfera e Pirâmide.");
        String formato = in.next();
        
        switch (formato)
        {
            case "cubo": //opção 1
            System.out.println ("Qual serviço você quer contratar? Nós fazemos os serviços de Pintura e Telhado! ");
            String servico = in.next();
            if (servico.equalsIgnoreCase("pintura")) //Compara se o valor digitado pelo usuário na variável serviço é "pintura" e ignora se for maiúsculo
            {
                System.out.println ("Qual material você quer pintar? Nós temos tintas para Alvenaria e Madeira! ");
                String opcaoPintura = in.next();
                if (opcaoPintura.equalsIgnoreCase("alvenaria"))
                {
                    System.out.println("Qual a medida da sua Aresta? ");
                    double rendimentoP = (areaCubo(in.nextDouble()))/30; //rendimento Pintura
                    double orcamento = rendimentoP * 80;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
                if (opcaoPintura.equalsIgnoreCase("madeira"))
                { 
                    System.out.println("Qual a medida da sua Aresta? ");
                    double rendimentoP = (areaCubo(in.nextDouble()))/20; 
                    double orcamento = rendimentoP * 90;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
            }
            if (servico.equalsIgnoreCase("telhado"))
            {
                System.out.println ("Temos telhas dos tipos Esmaltada e simples, qual você deseja? ");
                String opcaoTelha = in.next();
                if (opcaoTelha.equalsIgnoreCase("simples"))
                {
                    System.out.println("Qual a medida da sua Aresta? ");
                    double rendimentoT = 100 * ((areaCubo(in.nextDouble()))/(22 * 39)); //rendimento Telhado
                    double orcamento = rendimentoT * 7;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoT);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoT) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
                if (opcaoTelha.equalsIgnoreCase("esmaltada"))
                {
                    System.out.println("Qual a medida da sua Aresta? ");
                    double rendimentoT = 100 * ((areaCubo(in.nextDouble()))/(22 * 39));
                    double orcamento = rendimentoT * 12;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoT);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoT) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
            }
            break; //Encerra o switch para não dar infinitos loops

            case "paralelepipedo": //opção 2
            System.out.println ("Qual serviço você quer contratar? Nós fazemos os serviços de pintura e telhado! ");
            String servico2 = in.next();
            if (servico2.equalsIgnoreCase("pintura"))
            {
                System.out.println ("Para qual material você quer a tinta? Nós temos para alvenaria e madeira! ");
                String opcaoPintura = in.next();
                if (opcaoPintura.equalsIgnoreCase("alvenaria"))
                {
                    System.out.println("Qual a medida da sua primeira Aresta? ");
                    double aresta1 = in.nextDouble();
                    System.out.println("Qual a medida da sua segunda Aresta? ");
                    double aresta2 = in.nextDouble();
                    System.out.println("Qual a medida da sua terceira Aresta? ");
                    double aresta3 = in.nextDouble();

                    double rendimentoP = (areaParalelepipedo(aresta1, aresta2, aresta3))/30; 
                    double orcamento = rendimentoP * 80;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
                if (opcaoPintura.equalsIgnoreCase("madeira"))
                { 
                    System.out.println("Qual a medida da sua primeira Aresta? ");
                    double aresta1 = in.nextDouble();
                    System.out.println("Qual a medida da sua segunda Aresta? ");
                    double aresta2 = in.nextDouble();
                    System.out.println("Qual a medida da sua terceira Aresta? ");
                    double aresta3 = in.nextDouble();

                    double rendimentoP = (areaParalelepipedo(aresta1, aresta2, aresta3))/20; 
                    double orcamento = rendimentoP * 90;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }  
            }
            if (servico2.equalsIgnoreCase("telhado"))
            {
                System.out.println ("Temos telhas dos tipos esmaltada e simples, qual você deseja? ");
                String opcaoTelha = in.next();
                if (opcaoTelha.equalsIgnoreCase("simples"))
                {   
                    System.out.println("Qual a medida da sua primeira Aresta? ");
                    double aresta1 = in.nextDouble();
                    System.out.println("Qual a medida da sua segunda Aresta? ");
                    double aresta2 = in.nextDouble();
                    System.out.println("Qual a medida da sua terceira Aresta? ");
                    double aresta3 = in.nextDouble();

                    double rendimentoT = 100 * ((areaParalelepipedo(aresta1, aresta2, aresta3))/(22 * 39));
                    double orcamento = rendimentoT * 7;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoT);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoT) + " latas. \nObrigado pela preferência e volte sempre!" );
                }  
                if (opcaoTelha.equalsIgnoreCase("esmaltada"))
                {
                    System.out.println("Qual a medida da sua primeira Aresta? ");
                    double aresta1 = in.nextDouble();
                    System.out.println("Qual a medida da sua segunda Aresta? ");
                    double aresta2 = in.nextDouble();
                    System.out.println("Qual a medida da sua terceira Aresta? ");
                    double aresta3 = in.nextDouble();

                    double rendimentoT = 100 * ((areaParalelepipedo(aresta1, aresta2, aresta3))/(22 * 39));
                    double orcamento = rendimentoT * 12;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoT);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoT) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
            }
            break;

            case "cilindro": //opção 3
            System.out.println ("Qual serviço você quer contratar? Nós fazemos os serviços de pintura e telhado! ");
            String servico3 = in.next();
            if (servico3.equalsIgnoreCase("pintura"))
            {
                System.out.println ("Para qual material você quer a tinta? Nós temos para alvenaria e madeira! ");
                String opcaoPintura = in.next();
                if (opcaoPintura.equalsIgnoreCase("alvenaria"))
                {
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    System.out.println("Qual a medida da sua Altura?? ");
                    double h = in.nextDouble();

                    double rendimentoP = (areaCilindro(raio, h))/30; 
                    double orcamento = rendimentoP * 80;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
                if (opcaoPintura.equalsIgnoreCase("madeira"))
                { 
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    System.out.println("Qual a medida da sua Altura? ");
                    double h = in.nextDouble();

                    double rendimentoP = (areaCilindro(raio, h))/20; 
                    double orcamento = rendimentoP * 90;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }  
            }
            if (servico3.equalsIgnoreCase("telhado"))
            {
                System.out.println ("Temos telhas dos tipos esmaltada e simples, qual você deseja? ");
                String opcaoTelha = in.next();
                if (opcaoTelha.equalsIgnoreCase("simples"))
                {   
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    System.out.println("Qual a medida da sua Alura? ");
                    double h = in.nextDouble();

                    double rendimentoT = 100 * ((areaCilindro(raio, h))/(22 * 39));
                    double orcamento = rendimentoT * 7;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoT);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoT) + " latas. \nObrigado pela preferência e volte sempre!" );
                }  
                if (opcaoTelha.equalsIgnoreCase("esmaltada"))
                {
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    System.out.println("Qual a medida da sua Altura ");
                    double h = in.nextDouble();

                    double rendimentoT = 100 * ((areaCilindro(raio, h))/(22 * 39));
                    double orcamento = rendimentoT * 12;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoT);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoT) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
            }
            break;

            case "esfera": //opção 4
            System.out.println ("Infelizmente, só realizamos pintura nessa figura. Deseja seguir com o orçamento? ");
            String servico4 = in.next();
            if (servico4.equalsIgnoreCase("sim"))
            {
                System.out.println ("Para qual material você quer a tinta? Nós temos para alvenaria e madeira! ");
                String opcaoPintura = in.next();
                if (opcaoPintura.equalsIgnoreCase("alvenaria"))
                {
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    
                    double rendimentoP = (areaEsfera(raio))/30;
                    double orcamento = rendimentoP * 80;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
                if (opcaoPintura.equalsIgnoreCase("madeira"))
                { 
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    
                    double rendimentoP = (areaEsfera(raio))/20; 
                    double orcamento = rendimentoP * 90;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }                          
            }
            else 
            {
                System.out.println("Desculpe, faremos o possível para o mais brevemente cubrirmos esse serviço também!");
            }
                
            break;

            case "piramide": //opção 5
            System.out.println ("Infelizmente, só realizamos pintura nessa figura. Deseja seguir com o orçamento? ");
            String servico5 = in.next();
            if (servico5.equalsIgnoreCase("sim"))
            {
                System.out.println ("Para qual material você quer a tinta? Nós temos para alvenaria e madeira! ");
                String opcaoPintura = in.next();
                if (opcaoPintura.equalsIgnoreCase("alvenaria"))
                {
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    System.out.println("Qual a medida da sua Altura? ");
                    double h = in.nextDouble();
                    
                    double rendimentoP = (areaPiramide(raio, h))/30; 
                    double orcamento = rendimentoP * 80;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }
                if (opcaoPintura.equalsIgnoreCase("madeira"))
                { 
                    System.out.println("Qual a medida do seu Raio? ");
                    double raio = in.nextDouble();
                    System.out.println("Qual a medida da sua Altura? ");
                    double h = in.nextDouble();
                    
                    double rendimentoP = (areaPiramide(raio, h))/20; 
                    double orcamento = rendimentoP * 90;
                    System.out.printf ("O valor do seu orçamento é de: %.2f", orcamento); 
                    System.out.print(" reais;"); 
                    System.out.printf ("\nVocê usará %.2f",  rendimentoP);
                    System.out.println (" latas de tinta; \nMas terá que comprar " + Math.ceil(rendimentoP) + " latas. \nObrigado pela preferência e volte sempre!" );
                }  
            }
            else 
            {
                System.out.println("Desculpe, faremos o possível para o mais brevemente cubrirmos esse serviço também!");
            }
            break;
            
            default: //É chamado quando nenhuma das opções acima é escolhida
            System.out.println("Desculpe, mas não fazemos o serviço para a formato desejado :( ");
            break;
            

        }

    } 

    public static double areaCubo (double aresta)
    {
        return (6 * (Math.pow(aresta, 2)));
    }

    public static double areaParalelepipedo (double aresta, double aresta2, double aresta3) 
    {
        return 2 * ((aresta * aresta2) + (aresta * aresta3) + (aresta2 * aresta3));
    }

    public static double areaCilindro (double r, double h) //h = altura
    {
        double areaBase = Math.PI * (Math.pow(r, 2));
        double areaLateral = 2 * (Math.PI * r * h);
        return (2 * areaBase) + areaLateral;
    }

    public static double areaEsfera (double r) //r = raio
    {
        return 4 * (Math.PI * (Math.pow(r, 2)));
    }

    public static double areaPiramide (double base, double h)
    {
        double areaLateral = ((base * h) / 2) * 4;
        double areaBase = base * base;
        return areaLateral + areaBase;
    }

}