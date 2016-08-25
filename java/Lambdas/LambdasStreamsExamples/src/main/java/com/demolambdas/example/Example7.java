package com.demolambdas.example;

import com.demolambdas.example.beans.Console;
import com.demolambdas.utils.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Example7 {
    public static void main(String[] args){
        List<Console> consoleList = Util.createConsoleList();
        
        /*
        double unitsSold = 0;
        for(Console c : consoleList){
            if(c.getCompanyName().equals("Microsoft")){
                unitsSold += c.getUnitsSold();
            }
        }
        */
        
        double unitsSold = consoleList
                            .stream()
                            .filter(c -> c.getCompanyName().equals("Microsoft"))
                            .mapToDouble( c -> c.getUnitsSold())
                            .sum();
        
        System.out.println("Units sold = "+unitsSold);
        
        
    }
    
    
}
