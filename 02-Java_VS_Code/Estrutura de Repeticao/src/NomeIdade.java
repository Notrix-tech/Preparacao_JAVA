import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome  = entrada.next();
            if (nome.equals("sair")) {
                break;
                
            }
            System.out.println("Idade: ");
            idade = entrada.nextInt();

        
        }
        System.out.println("Fim do programa");

        entrada.close();
    }
    
}