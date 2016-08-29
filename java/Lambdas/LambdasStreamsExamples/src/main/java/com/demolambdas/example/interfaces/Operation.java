package com.demolambdas.example.interfaces;

@FunctionalInterface
public interface Operation{
    
    int operate(int a, int b); 
    
    default int operatex(int a, int b){ return 0; } 
    
    @Override
    String toString();
}