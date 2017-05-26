/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatospilha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leotr
 */
public class Leitor {
    public static ArrayList<String> openArchive(String url){
        ArrayList<String> text = new ArrayList<>();
        
        try {
            FileReader arc = new FileReader(url);
            BufferedReader bf = new BufferedReader(arc);
            String line = bf.readLine();
            while(line!=null){
                text.add(line);
                line = bf.readLine();
            }
        
        } catch (Exception e) {
            System.out.println("Erro na leitura " + e.getMessage());
        }
        return text;
    }
    
    public static Automato load(String arquivo){
        ArrayList<String> text = Leitor.openArchive(arquivo);
        Automato a = new Automato();
        a.setAlfabeto(text.get(0).split(" "));
        a.setAlfabetoPilha(text.get(1).replaceFirst(" ", "").split(" "));
        a.setEpisilon(text.get(2));
        a.setConjuntoEstados(text.get(4).split(" "));
        a.setEstadoInicial(text.get(5));
        a.setEstadoFinal(text.get(6).split(" "));
        ArrayList<Transicao> transicoes = new ArrayList<>();
        for(int i=7; i<text.size(); i++){
            String[] line = text.get(i).split(" ");
            Transicao t = new Transicao(line[0], line[1], line[2], line[3], line[4]);
            transicoes.add(t);
        }
        a.setTransicoes(transicoes);
        return a;
    }
}
