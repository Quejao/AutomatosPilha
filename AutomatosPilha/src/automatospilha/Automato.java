/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatospilha;

import java.util.ArrayList;

/**
 *
 * @author leotr
 */
public class Automato {
    private String[] alfabeto;
    private String[] alfabetoPilha;
    private String episilon;
    private String estadoInicial;
    private String[] estadoFinal;
    private String[] conjuntoEstados;
    private ArrayList<Transicao> transicoes;

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
        for (int i = 0;  i < estadoFinal.length; i++) {
            System.out.print(" "+estadoFinal[i]+" ");
            
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

    public String[] getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(String[] estadoFinal) {
        this.estadoFinal = estadoFinal;
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
