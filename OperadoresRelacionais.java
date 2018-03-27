package operadoresrelacionais;

import java.util.Scanner;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        
        System.out.print("Primeiro:"); //prompt
        number1 = input.nextInt(); //Lê o segundo inteiro fornecido pelo usuário
        
        System.out.print("Segundo:"); //prompt
        number2 = input.nextInt(); //Lê o segundo inteiro fornecido pelo usuário
        
        if ( number1 == number2 )
            System.out.printf("%d == %d\n", number1, number2);
        
        if ( number1 != number2 )
            System.out.printf("%d != %d\n", number1, number2);
        
        if ( number1 < number2 )
            System.out.printf("%d < %d\n", number1, number2);
        
        if ( number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        
        if ( number1 <= number2 )
            System.out.printf("%d <= %d\n", number1, number2);
        
        if ( number1 >= number2 )
                System.out.printf("%d >= %d\n", number1, number2);
    }//fim do método main
    
}//fim da classe OperadoresRelacionais
