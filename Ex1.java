
package ExerciciosEscolha;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
      
        int opc;
        int atualSalario;
        double aumento=0.0;
        double novoSalario;
        double atualSalario2=0;
        
        System.out.println("Digite seu salario atual");
        atualSalario = leia.nextInt();
        System.out.println("Seu aumento sera de acordo com seu novo cargo");
        System.out.println("Qual seu novo cargo:");
        System.out.println("n1-Escriturario\n2-Secretario\n3-Caixa\n4-Gerente\n5-diretor");
        opc = leia.nextInt();
        
       switch(opc){
       
           case 1:
               aumento = atualSalario  * 0.50;
               novoSalario = aumento + atualSalario;
               System.out.println("seu cargo é  escriturario");
               System.out.println("Seu novo salario é RS: " + novoSalario);
               System.out.println("Seu aumento foi de RS " + aumento);
               break;
           case 2:
             double  novo = atualSalario * 0.35;
             double  novoSalario2 = novo + atualSalario;
               System.out.println("Seu cargo é secretario");
               System.out.println("Seu novo salario é RS: " + novoSalario2);
               System.out.println("Seu aumento foi de RS " + novo);
               break; 
           case 3:
              double n2 = atualSalario * 0.20;
              double novoSalario3 = n2 + atualSalario;
               System.out.println("Seu cargo é caixa");
               System.out.println("seu novo salario é " + novoSalario3);
               System.out.println("Seu aumento é " + n2);
               break;
           case 4:
               double n3 = atualSalario * 0.10;
               double novoSalario4 = n3 + atualSalario;
               System.out.println("Seu cargo é gerente");
               System.out.println("seu novo salarioe é " + novoSalario4);
               System.out.println("seu aumento é " + n3);
               break;
           case 5:
               System.out.println("Voce nao tem aumento!");
               break;
           default:
               System.out.println("Nulo");
       }
    }
        
}
