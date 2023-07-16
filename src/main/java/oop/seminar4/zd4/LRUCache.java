package oop.seminar4.zd4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LRUCache<E> {
    ArrayList<E> listE;
    int size;

    public LRUCache(int size) {
        listE = new ArrayList<>();
        this.size = size;
    }

    public LRUCache() {
    }

    public ArrayList<E> getListE() {
        return listE;
    }

    public void setListE(ArrayList<E> listE) {
        this.listE = listE;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addElement(E employee) {
        if(listE.size()>size){
            listE.remove(0);
        }
        this.listE.add(employee);
    }
    public E getElement(int ind){
        if(ind >= listE.size()){
            return null;
        }
        return this.listE.get(ind);
    }
    public List<E> getAllElement(){
    return this.listE;
    }
}
