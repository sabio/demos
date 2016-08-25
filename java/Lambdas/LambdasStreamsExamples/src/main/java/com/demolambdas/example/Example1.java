package com.demolambdas.example;

import com.demolambdas.example.interfaces.Operation;
import com.demolambdas.example.interfaces.OperationImpl;

public class Example1 {
    
    public static void main(String[] args){
        
        Operation suma = new OperationImpl();
        
        Operation resta = new Operation(){
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        
        Operation multiplicacion = (int a, int b) -> { return a * b; };
        
        Operation division = (a,b) ->  a/b;
        
        
        System.out.println("suma = "+suma.operate(2, 2));
        System.out.println("resta = "+resta.operate(2, 2));
        System.out.println("multiplicacion = "+multiplicacion.operate(2, 2));
        System.out.println("division = "+division.operate(2, 2));
    }
}
