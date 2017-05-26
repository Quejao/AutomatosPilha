/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatospilha;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leotr
 */
public class AutomatosPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in);
//        System.out.println("Digite nome do arquivo: ");
//        String str = scanner.nextLine();
        String str = "pda.txt";
        Automato automato = Leitor.load(str);
        automato.imprimeAutomato(automato);
    }
    
}
