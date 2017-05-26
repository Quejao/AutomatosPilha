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
public class Transicao {
    private String estadoAtual; 
    private String atualPalavra; 
    private String topoPilha; 
    private String estadoNovo; 
    private String simboloEmpilha; 

    public Transicao(String estadoAtual, String atualPalavra, String topoPilha, String estadoNovo, String simboloEmpilha) {
        this.estadoAtual = estadoAtual;
        this.atualPalavra = atualPalavra;
        this.topoPilha = topoPilha;
        this.estadoNovo = estadoNovo;
        this.simboloEmpilha = simboloEmpilha;
    }
    public static void ImprimeTransicao(ArrayList<Transicao> transicao){
        System.out.println("->Transicoes: ");
        for(Transicao t: transicao){
            System.out.println(" Estado atual: " + t.getEstadoAtual()+
                    "\n atual palavra: "+ t.getAtualPalavra()+
                    "\n topo pilha : "+ t.getTopoPilha()+ 
                    "\n estado novo: "+ t.getEstadoNovo()+
                    "\n simbolo empilha: "+ t.getSimboloEmpilha()+"\n");
        }
        
    }
    
    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public String getAtualPalavra() {
        return atualPalavra;
    }

    public void setAtualPalavra(String atualPalavra) {
        this.atualPalavra = atualPalavra;
    }

    public String getTopoPilha() {
        return topoPilha;
    }

    public void setTopoPilha(String topoPilha) {
        this.topoPilha = topoPilha;
    }

    public String getEstadoNovo() {
        return estadoNovo;
    }

    public void setEstadoNovo(String estadoNovo) {
        this.estadoNovo = estadoNovo;
    }

    public String getSimboloEmpilha() {
        return simboloEmpilha;
    }

    public void setSimboloEmpilha(String simboloEmpilha) {
        this.simboloEmpilha = simboloEmpilha;
    }
}
