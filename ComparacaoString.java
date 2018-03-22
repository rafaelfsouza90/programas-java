/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author 2014200413
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Rafael";
        String nome2 = "Rafael";
        String nome3 = new String("Rafael");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
        // .equals - É um método verifica se o conteúdo de um OBJETO é igual ao conteúdo do outro.
        
        /*
        === OPERADORES LÓGICOS ===
        && - .E. 
        || - .OU.
        ^  - .XOU.
        !  - .NAO. 
        
        */
    }
    
}
