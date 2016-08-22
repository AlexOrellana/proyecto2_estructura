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
public class fsarraylist extends adtlist{

    private int capacity;
    protected Object[] arr;

    public fsarraylist(int capacity) {
        this.capacity = capacity;
        arr = new Object [capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i]=null;
        }
    }
    
    @Override
    boolean insert(Object e, int p) {
        if (p<0 || p>size) {
            return false;
        }
        if (size==capacity) {
            return false;
        }
        if (p==size) {
            arr[p]=e;
        }else{
            for (int i = size; i > p; i--) {
                arr[i]=arr[i-1];
            }
            arr[p]=e;
        }
        size++;
        return true;
    }

    @Override
    Object first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Object last() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int capacity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Object remove(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean isFull() {
        if (size==capacity) {
          return true;  
        }else{
          return false;
        }
    }

    @Override
    int indexOF(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Object get(int p) {
        return arr[p];
    }

    @Override
    void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
