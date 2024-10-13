
package ExerciciosEscolha;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        String placa = scanner.nextLine();
        
        if(placa.length() !=4 || !placa.matches("\\d{4}")){
            System.out.println("Placa invalida");
        }else{
            char ultimoDigito = placa.charAt(placa.length()-1);
            
            switch(ultimoDigito){
            case '1':
                System.out.println("Seu carro nao pode transitar de segunda-feira");
                break; 
            case '2':
                System.out.println("Seu carro nao pode transitar de terça-feira");
                break;
                
             case '3':
                System.out.println("Seu carro nao transita de quarta-feira");
                break;
                
             case '4':
                 System.out.println("Seu carro nao transita de quinta");
                 break;
                 
             case '5':
                 System.out.println("Seu carro nao transita de sexta");
                 break;
            
             default:
                 System.out.println("Nullo");
             }
           
        }
       scanner.close();
    }
}
