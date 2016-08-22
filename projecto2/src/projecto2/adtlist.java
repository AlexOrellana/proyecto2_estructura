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
public abstract class adtlist{
    int size=0;

    public adtlist() {
    }
 
    abstract boolean insert(Object e,int p);
    abstract Object first();
    abstract Object last();
    int size(){
        return size;
    }
    abstract int capacity();
    abstract Object remove(int p);
    boolean isEmpty(){
        if (size==0) {
            return true;
        }else{
            return false;
        }
    }
    abstract boolean isFull();
    abstract int indexOF(Object e);
    abstract Object get(int p);
    abstract void clear();
}
