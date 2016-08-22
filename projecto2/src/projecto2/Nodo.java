/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

/**
 *
 * @author alex
 */
public class Nodo {
    Nodo padre;
    Object label;
    VSArrayList hijos= new VSArrayList(0, 10);

    public Nodo(Nodo padre, Object label) {
        this.padre = padre;
        this.label = label;
    }
    
    void agregar_nodo(Object nodo){
        int pos=0;
        if (hijos.size()==0) {
            pos=0;
        }else{
            pos = pos + 1;      
        }
        hijos.insert2(nodo,pos);
    }
}
