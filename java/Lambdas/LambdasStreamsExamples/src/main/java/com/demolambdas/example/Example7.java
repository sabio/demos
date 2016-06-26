package com.demolambdas.example;


public class Example7 {
    public static void main(String[] args){
        Operation addition = (i,j) -> i+j;
        
        System.out.println("result = "+addition.operate(2, 2));
        
    }
    
    
}

interface Operation{
    public int operate(int a, int b); 
    default int operatex(int a, int b){
        return a-b;
    }
    
    static void staticMethod(){
        
    }
   
    public String toString();

}