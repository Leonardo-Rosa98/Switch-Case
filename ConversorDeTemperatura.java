import java.util.Scanner;

public class ConversorDeTemperatura{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura atual: ");
        int temperatura  = input.nextInt();
        System.out.println("Digite (C) para Celsius ou (F) para Fahrenheit: ");
        input.nextLine();    
        String tipo = input.nextLine();
        int resultado;

        switch (tipo.toLowerCase()) {
            case "c":
                resultado = (temperatura * (9 / 5)) + 32;
                System.out.println("Temperatura em Fahrenheit: " + resultado);
                break;
            
            case "f":
                resultado = (temperatura - 32) * 5 / 9;
                System.out.println("Temperatura em Celsius: " + resultado);
                break;
            default:
                System.out.println("Opereção inválida!");    
        }

    }

}