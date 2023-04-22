import java.util.Scanner;

public class ClassificacaoDeNotas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        int nota = input.nextInt();
        char classificacao;
        
        switch (nota / 10) {
            case 10:
            case 9:
                classificacao = 'A';
                break;
            case 8:
                classificacao = 'B';
                break;
            case 7:
                classificacao = 'C';
                break;
            case 6:
                classificacao = 'D';
                break;
            default:
                classificacao = 'F';
        }

        System.out.println("Sua nota " + nota + " foi classificada como: " + classificacao);

    }
}
