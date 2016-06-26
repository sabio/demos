package com.demolambdas.example;

import com.demolambdas.example.beans.Console;
import com.demolambdas.utils.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Example5 {
    public static void main(String[] args){
        List<Console> consoleList = Util.createConsoleList();
        
        /*
        List<String> nintendoConsoleNames = new ArrayList();
        for(Console c : consoleList){
            if(c.getCompanyName().equals("Nintendo")){
                nintendoConsoleNames.add(c.getName());
            }
        }
*/
        
        List<String> nintendoConsoleNames = consoleList
                                            .stream()
                                            .filter((c) -> c.getCompanyName().equals("Nintendo"))
                                            .map((c) -> c.getName())
                                            .collect(Collectors.toList());
        
        nintendoConsoleNames.forEach(System.out::println);
    }
}
