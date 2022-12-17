
import java.util.Scanner;
public class NomeVerttical {
   

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        String palavra2;
        
        for(int i = 0; i <= palavra.length(); i++){
          System.out.println(palavra.substring(0,i));
        }
    }
}
