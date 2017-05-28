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
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Digite nome do arquivo: ");
        String str = scanner.nextLine();
        Automato a = Leitor.load(str);

        System.out.println("\n> Digite o caso de teste: ");
        String teste = scanner.nextLine();
        int x = runInput(a, teste);
    }

    public static int runInput(Automato a, String word) {
        String estadoAtual = a.getEstadoInicial();
        String[] letters = word.split("");
        boolean f;
        for (int i = 0; i < letters.length; i++) {
            f = true;
            for (Transicao t : a.getTransicoes()) {
                if (estadoAtual.equals(t.getEstadoAtual())) {
                    if (t.getAtualPalavra().equals(a.getEpisilon())) {
                        if (a.getStack().peek().equals(t.getTopoPilha())) {
                            if (t.getSimboloEmpilha().equals(a.getEpisilon())) {
                                a.getStack().pop();
                            } else {
                                String[] s = t.getSimboloEmpilha().split("");
                                a.getStack().pop();
                                a.getStack().push(s[1]);
                                a.getStack().push(s[0]);
                            }
                            estadoAtual = t.getEstadoNovo();
                            i -= 1;
                            f = false;
                        }
                    } else if (letters[i].equals(t.getAtualPalavra())) {
                        if (a.getStack().peek().equals(t.getTopoPilha())) {
                            if (t.getSimboloEmpilha().equals(a.getEpisilon())) {
                                a.getStack().pop();
                            } else {
                                String[] s = t.getSimboloEmpilha().split("");
                                a.getStack().pop();
                                a.getStack().push(s[1]);
                                a.getStack().push(s[0]);
                            }
                            estadoAtual = t.getEstadoNovo();
                            f = false;
                        }
                    }
                }
            }
            if (f) {
                System.out.println("\nRegeita!\n");
                return -1;
            }
        }
        for (Transicao t : a.getTransicoes()) {
            if (t.getEstadoAtual().equals(estadoAtual)) {
                if (t.getAtualPalavra().equals(a.getEpisilon())) {
                    if (a.getStack().peek().equals(t.getTopoPilha())) {
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
        
        boolean eFinal = false;
        for(String ef: a.getEstadosFinais()){
            if(estadoAtual.equals(ef)){
                eFinal = true;
            }
        }
        
        if (a.getStack().isEmpty()|| eFinal) {
            System.out.println("\nAceita!\n");
        } else {
            System.out.println("\nRegeita!\n");
        }
        
        a.imprimeAutomato(a);
        return 0;
    }

}
