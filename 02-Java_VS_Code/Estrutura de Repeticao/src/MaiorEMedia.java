import java.util.Scanner;
// Faça um programa que leia 5 numeros
// informe o maior numero
// qual a media desses numeros 

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        
        int count = 0;
        do{
            System.out.println("Digite um numero ");
        numero = entrada.nextInt();
        count = count + 1;

            soma = soma + numero;
            
            if(numero > maior) maior = numero;

        }while (count < 5);

        System.out.println("Maior : " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Média dos numeros: " + (soma/5));



        entrada.close();
    } 
}
