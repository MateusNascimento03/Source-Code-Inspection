package br.calebe.ticketmachine.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class Troco {

    private List<PapelMoeda> listaPapelMoeda;
    private int valor;

    public Troco(int valor) {
        
        listaPapelMoeda = new ArrayList<PapelMoeda>();
        
        while(valor % 100 == 0) {
            listaPapelMoeda.add(new PapelMoeda(100));
            valor = valor - 100;
        }
        
        while(valor % 50 == 0) {
            listaPapelMoeda.add(new PapelMoeda(100));
            valor = valor - 50;
        }
        
        while(valor % 20 == 0) {
            listaPapelMoeda.add(new PapelMoeda(100));
            valor = valor - 20;
        }
        
        while(valor % 10 == 0) {
            listaPapelMoeda.add(new PapelMoeda(100));
            valor = valor - 10;
        }
        
        while(valor % 5 == 0) {
            listaPapelMoeda.add(new PapelMoeda(100));
            valor = valor - 5;
        }
        
        while(valor % 2 == 0) {
            listaPapelMoeda.add(new PapelMoeda(100));
            valor = valor - 2;
        }        
        
    }
    
    public List<PapelMoeda> getTroco(){
        return listaPapelMoeda;
        
    }

}