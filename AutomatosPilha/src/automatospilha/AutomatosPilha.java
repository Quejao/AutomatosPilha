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
        Automato a = Leitor.load(str);
        int x = runInput(a, "aabb");
    }

    public static int runInput(Automato a, String word) {
        String estadoAtual = a.getEstadoInicial();
        String[] letters = word.split("");
        
        for (int i = 0; i < letters.length; i++) {
            for (Transicao t : a.getTransicoes()) {
                if (estadoAtual.equals(t.getEstadoAtual())) {
                    if (a.getStack().peek().equals(t.getTopoPilha())) {
                        if(t.getAtualPalavra().equals(a.getEpisilon())){
                            if (t.getSimboloEmpilha().equals(a.getEpisilon())) {
                                a.getStack().pop();
                            } else {
                                String[] s = t.getSimboloEmpilha().split("");
                                a.getStack().pop();
                                a.getStack().push(s[1]);
                                a.getStack().push(s[0]);
                            }
                            estadoAtual = t.getEstadoNovo();
                            i-=1;
                        }
                        else if (letters[i].equals(t.getAtualPalavra())) {
                            if (t.getSimboloEmpilha().equals(a.getEpisilon())) {
                                a.getStack().pop();
                            } else {
                                String[] s = t.getSimboloEmpilha().split("");
                                a.getStack().pop();
                                a.getStack().push(s[1]);
                                a.getStack().push(s[0]);
                            }
                            estadoAtual = t.getEstadoNovo();
                        }
                    }
                }
            }
        }
        a.imprimePilha();
        if(a.getStack().isEmpty()){
            System.out.println("\nAceita!\n");
        }else{
            System.out.println("\nRegeita!\n");
        }
        return 0;
    }

}
