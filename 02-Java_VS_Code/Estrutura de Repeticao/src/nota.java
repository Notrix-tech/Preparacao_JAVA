import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota;

        System.out.println("Informa uma nota: ");
        nota = entrada.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Invalida. Digite novamente ");
            nota = entrada.nextInt();
            
        }
        if (nota >= 0 && nota <= 5 ) {
            System.out.println("Aluno de Recuperação");
            
        } if( nota >=6 && nota <= 10){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Fim do programa.");
        }


        entrada.close();
    }
}
