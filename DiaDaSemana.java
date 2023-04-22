import java.util.Scanner;
public interface DiaDaSemana {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        int dia = input.nextInt();
        switch (dia) {
            case 1: 
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça_Feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");   
                break; 
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opão inválida!");  
                break;     
        }
    }
}
