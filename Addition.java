//Addition.java
//Programa de adição que exibe a soma de dois inteiros.
import java.util.Scanner;
public class Addition {
    
    //Método principal inicia a execução do aplicativo Java
    public static void main(String[] args) {
        //Cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner (System.in);
        
        int     number1;//primeiro número a adicionar
        int number2;//segundo número a adicionar
        int sum;// soma de number1 e number2
        
        System.out.print("Digite o primeiro inteiro: ");
        number1 = input.nextInt();//Lê o primeiro número fornecido pelo usuário
        
        System.out.print("Digite o segundo inteiro: ");
        number2 = input.nextInt();//Lê o segundo número fornecido pelo usuário
        
        sum = number1 + number2;//soma os números, depois arnazena o total em sum
        
        System.out.printf("A soma é: %d\n ", sum); //Exibe a soma
    
    }//Fim do método main
    
}//Fim da Classe Addition
