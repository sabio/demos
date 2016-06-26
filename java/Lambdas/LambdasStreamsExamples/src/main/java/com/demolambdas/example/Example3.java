package com.demolambdas.example;

import com.demolambdas.example.beans.Console;
import com.demolambdas.utils.Util;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;


public class Example3 {
    public static void main(String[] args){
        
        List<Console> consoleList = Util.createConsoleList();
        
        
        //Predicate
        consoleList.removeIf(c -> c.getCompanyName().equals("Sony"));
        
        //Consumer
        consoleList.forEach(c -> System.out.println(c.getName()));
        
        //Supplier
        Supplier<Integer> integerGenerator = () -> {return (int) (Math.random() * 100); };
        System.out.println("generated number = "+integerGenerator.get());
        
        
        //Function
        Function<String, Integer> asciiSum = s -> {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i); 
            }
            return sum;
        };
        
        System.out.println("ascii sum = "+asciiSum.apply("hello"));
        
        
    }
    
    
    
}
