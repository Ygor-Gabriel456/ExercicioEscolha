package ExerciciosEscolha;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int num;
        
        System.out.println("Escolha um numero entre 1 a 12");
        num = leia.nextInt();
        
        switch(num){
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("mes não existe");
        }
    }
}
