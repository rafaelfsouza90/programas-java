package programaidade;
import java.util.Scanner;
public class ProgramaIdade {

   
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     System.out.print("Digite o ano de nascimento: ");
     int nasc = teclado.nextInt();
     int idade = 2018 - nasc;
     System.out.println("Você tem: " + idade );
          if (idade>18){
         System.out.println("MAIOR DE IDADE");
     } else {
         System.out.println("MENOR DE IDADE");
     }
    }
    
}
