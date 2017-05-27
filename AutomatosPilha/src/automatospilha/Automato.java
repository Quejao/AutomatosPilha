/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatospilha;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 *
 * @author leotr
 */
public class Automato {
    private String[] alfabeto;
    private String[] alfabetoPilha;
    private String episilon;
    private String estadoInicial;
    private String simboloTopo;
    private String[] estadosFinais;
    private String[] conjuntoEstados;
    private ArrayList<Transicao> transicoes;
    private Deque<String> stack = new ArrayDeque<>();

    public String getSimboloTopo() {
        return simboloTopo;
    }

    public void setSimboloTopo(String simboloTopo) {
        this.simboloTopo = simboloTopo;
    }

    public void imprimePilha(){
        for(String s:stack){
            System.out.print(s+"->");
        }
        System.out.println("\n");
    }
    
    public Deque<String> getStack() {
        return stack;
    }

    public void imprimeAutomato(Automato automato){
        System.out.println("\n->Alfabeto: ");
        for (int i = 0;  i < alfabeto.length; i++) {
            System.out.print(" "+alfabeto[i]+" ");
            
        }
        
        System.out.println("\n->Alfabeto pilha: ");
        for (int i = 0;  i < alfabetoPilha.length; i++) {
            System.out.print(" "+alfabetoPilha[i]+ " ");
            
        }
        
        System.out.print("\n->Epsilon : "+ episilon);
        System.out.println("\n->Conjunto de estados: ");
        for (int i = 0;  i < conjuntoEstados.length; i++) {
            System.out.print(" "+conjuntoEstados[i]+ " ");
            
        }
        System.out.print("\n->Estado inicial : \n"+ estadoInicial);
        
        System.out.println("\n->Estados finais: ");
        for (int i = 0;  i < estadosFinais.length; i++) {
            System.out.print(" "+estadosFinais[i]+" ");
            
        }
        System.out.println();
        Transicao.ImprimeTransicao(automato.getTransicoes());
        
         
        
    }
    
    public ArrayList<Transicao> getTransicoes() {
        return transicoes;
    }

    public void setTransicoes(ArrayList<Transicao> transicoes) {
        this.transicoes = transicoes;
    }

    public String[] getConjuntoEstados() {
        return conjuntoEstados;
    }

    public void setConjuntoEstados(String[] conjuntoEstados) {
        this.conjuntoEstados = conjuntoEstados;
    }

    public String getEpisilon() {
        return episilon;
    }

    public void setEpisilon(String episilon) {
        this.episilon = episilon;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public String[] getEstadosFinais() {
        return estadosFinais;
    }

    public void setEstadosFinais(String[] estadosFinais) {
        this.estadosFinais = estadosFinais;
    }

    public String[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String[] alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String[] getAlfabetoPilha() {
        return alfabetoPilha;
    }

    public void setAlfabetoPilha(String[] alfabetoPilha) {
        this.alfabetoPilha = alfabetoPilha;
    }
}
