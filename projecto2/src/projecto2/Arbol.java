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
public class Arbol {
    Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }
    
    Nodo Father(Nodo nodo){
        return nodo.padre;
    }
    
    Nodo Lefttestson(Nodo nodo){
        return ((Nodo)nodo.hijos.get(0));
    }
    
    Nodo RightBrother(Nodo nodo){
        Nodo temp=nodo.padre;
        Nodo temp2=null;
        for (int i = 0; i < temp.hijos.size(); i++) {
            if(((String)Label(nodo))==((String)Label(((Nodo)temp.hijos.get(i))))){
                temp2=((Nodo)temp.hijos.get(i));
            }
        }
        return temp2;
    }
    
    Object Label(Nodo nodo){
        return nodo.label;
    }
    
    Nodo getRoot(){
        return raiz;
    }
    void clear(){
        
    }
}
