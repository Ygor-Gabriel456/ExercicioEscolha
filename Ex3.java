
package ExerciciosEscolha;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
    int num1, num2;
    String operacao;
    
        System.out.println("Digite o primeiro numero");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo numero");
        num2 = leia.nextInt();
        
        System.out.println("Qual operacao irá usar");
        operacao = leia.next();
        
        switch(operacao){
            case "+":
                System.out.println("sua operacao foi ADICAO");
                int soma = num1 + num2;
                System.out.println("O resultado é: " +  soma);
                break;
            case "-":
                System.out.println("Sua operacao foi SUBTRACAO");
                int sub = num1 - num2;
                System.out.println("O resultado é: " + sub);
                break;
            case "*":
                System.out.println("Sua operacao foi multplicacao");
                int mult = num1 * num2;
                System.out.println("O resultado é: " + mult);
                break;
            case "/":
                System.out.println("Sua operacao foi divisao");
                int divisao = num1 / num2;
                System.out.println("O resultado é: " + divisao);
                break;
            default:
                System.out.println("Valor invalido");
               
        }
    }
    
}
