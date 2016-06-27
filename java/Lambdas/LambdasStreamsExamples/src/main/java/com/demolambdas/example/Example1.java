package com.demolambdas.example;

import com.demolambdas.example.beans.Console;
import com.demolambdas.utils.Util;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Example1 {
    public static void main(String[] args){
        
        List<Console> consoleList = Util.createConsoleList();
        Collections.sort(consoleList, new Comparator<Console>(){
            
            @Override
            public int compare(Console c1, Console c2) {
                return (int) (c2.getUnitsSold() - c1.getUnitsSold());
            }
        });
        
        Collections.sort(consoleList, (c1, c2) -> (int)(c2.getUnitsSold() - c1.getUnitsSold()) );
        
        Util.printConsoleList(consoleList);
    }
    
}
