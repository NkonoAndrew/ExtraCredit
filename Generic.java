package com.sjsu;

import java.util.ArrayList;

public class Generic<T> {
    public static void main(String[] args) {


    }

    private ArrayList<T> list = new ArrayList<>();

    Generic(){

    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public T peek(){
        return list.get(getSize() - 1);
    }

    public T pop(){
        T top = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return top;
    }

    public void push(T obj){
        list.add(obj);
    }

    public static <T> void print(T[] list){
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i] + " ");
        }
    }

    public static <T> void print(ArrayList<T> stack){
        while (!stack.isEmpty()){
            System.out.println(stack + " ");
        }
    }

    public static <T> void append(ArrayList<T> a, ArrayList<T> b){
        while (!a.isEmpty()){
            a.add((T) b);

        }

    }
}
