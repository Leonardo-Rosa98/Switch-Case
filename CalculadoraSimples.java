import java.util.Scanner;
public class CalculadoraSimples{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        System.out.println("Digite o 1ª numero: ");
        int num1 = input.nextInt();
        System.out.println("Digite o 2ª numero: ");
        int num2 = input.nextInt();
        int resultado;
        System.out.println("Digite o operador da conta: (soma), (subtrair), (multiplicar), (dividir).");
        input.nextLine();
        String operador = input.nextLine();
        
        switch (operador) { 
            case "somar":
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case "subtrair":
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case "multiplicar":
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case "dividir": 
                if (num2 !=0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else { 
                     System.out.println("Divisão por zero não é permitida");   
                }    
                break;
            default:
                System.out.println("Operador inválido");
                
        }

    }
}