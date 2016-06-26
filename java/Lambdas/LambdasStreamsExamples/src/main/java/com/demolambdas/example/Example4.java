package com.demolambdas.example;

import com.demolambdas.example.beans.Console;
import com.demolambdas.utils.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Example4 {
    public static void main(String[] args){
        List<Console> consoleList = Util.createConsoleList();
        
        /*
        List<Console> nintendoConsoles = new ArrayList();
        for(Console c : consoleList){
            if(c.getCompanyName().equals("Nintendo")){
                nintendoConsoles.add(c);
            }
        }
        */
        
        List<Console> nintendoConsoles = consoleList
                                            .stream()
                                            .filter((c) -> c.getCompanyName().equals("Nintendo"))
                                            .collect(Collectors.toList());
        
        Util.printConsoleList(nintendoConsoles);
    }
}
