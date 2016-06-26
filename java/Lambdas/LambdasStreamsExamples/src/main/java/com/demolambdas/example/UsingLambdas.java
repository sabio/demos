package com.demolambdas.example;

import com.demolambdas.example.beans.Console;
import com.demolambdas.utils.Util;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingLambdas {
    public static void main(String[] args){
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
    }
    
    
    private static void ejemplox() {
        Function<Integer,Integer> f = (i) -> i*i;
        System.out.println(f.apply(10));
    }
    
    
    
    private static void ejemplo1() {
        List<Console> consoleList = Util.createConsoleList();
        Collections.sort(consoleList, new Comparator<Console>(){
            
            @Override
            public int compare(Console c1, Console c2) {
                return c1.getUnitsSold().compareTo(c2.getUnitsSold());
            }
        });
        
        Collections.sort(consoleList, (c1, c2) -> c1.getUnitsSold().compareTo(c2.getUnitsSold()) );
        
        Util.printConsoleList(consoleList);
    }

    private static void ejemplo2() {
//        Runnable thread = new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("This is a new thread");
//            }
//        };
        
        Runnable thread = () -> System.out.println("This is a new thread");
        
        thread.run();
    }

    private static void ejemplo3() {
        List<Console> consoleList = Util.createConsoleList();
        List<Console> nintendoConsoles = consoleList
                                            .stream()
                                            .filter((c) -> c.getCompanyName().equals("Nintendo"))
                                            .collect(Collectors.toList());
        
        Util.printConsoleList(nintendoConsoles);
        
    }
    
    
    private static void ejemplo4() {
        List<Console> consoleList = Util.createConsoleList();
        List<String> nintendoConsoles = consoleList
                                            .stream()
                                            .filter((c) -> c.getCompanyName().equals("Nintendo"))
                                            .map((c) -> c.getName())
                                            .collect(Collectors.toList());
        
        nintendoConsoles.forEach(System.out::println);
        
    }
}
