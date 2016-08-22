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
public class VSArrayList extends fsarraylist{
    double delta;

    public VSArrayList(double delta, int capacity) {
        super(capacity);
        if (delta<=0) {
            this.delta = 0.2;
        }else{
            this.delta = delta;
        }
    }
    
    boolean insert2(Object e,int p){
        if(p<0||p>size){
            return false;
        }
        if (isFull()) {
            resize();
        }
        return insert(e, p);
    }
    void resize(){
        int newsize=(int)(size+size*delta);
        Object[] temp=new Object[newsize];
        for (int i = 0; i < size; i++) {
            temp[i]=arr[i];
        }
        for (int i = size; i < newsize; i++) {
            temp[i]=null;
        }
        arr=temp;
        size=newsize;
    }
}
