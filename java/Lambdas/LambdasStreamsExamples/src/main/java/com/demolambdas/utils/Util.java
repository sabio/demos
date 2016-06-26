package com.demolambdas.utils;

import com.demolambdas.example.beans.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Util {
    public static void printConsoleList(List<Console> list){
        /*for(Console c : list){
            System.out.println(c);
        }*/
        
        list.forEach(System.out::println);
    }
    
    public static List<Console> createConsoleList(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        List<Console> list = new ArrayList<>();
        try{
            list.add(new Console("SuperNintendo",   "Nintendo",  df.parse("21/11/1990"),  49.10, 4));
            list.add(new Console("Nintendo 64",     "Nintendo",  df.parse("23/06/1996"),  32.93, 5));
            list.add(new Console("GameCube",        "Nintendo",  df.parse("14/09/2001"),  21.74, 6));
            list.add(new Console("Wii",             "Nintendo",  df.parse("19/11/2006"), 101.18, 7));
            list.add(new Console("Wii U",           "Nintendo",  df.parse("18/11/2012"),  13.11, 8));
            list.add(new Console("PlayStation",     "Sony",      df.parse("03/12/1994"), 104.25, 5));
            list.add(new Console("PlayStation 2",   "Sony",      df.parse("04/03/2000"), 158.85, 6));
            list.add(new Console("PlayStation 3",   "Sony",      df.parse("11/11/2006"),  85.44, 7));
            list.add(new Console("PlayStation 4",   "Sony",      df.parse("15/11/2013"),  40.12, 8));
            list.add(new Console("Xbox",            "Microsoft", df.parse("15/11/2001"),  24.65, 6));
            list.add(new Console("Xbox 360",        "Microsoft", df.parse("22/11/2005"),  86.71, 7));
            list.add(new Console("Xbox One",        "Microsoft", df.parse("22/11/2013"),  22.50, 8));
        }catch(ParseException e){
            System.out.println("I hope it never happens");
        }
        return list;
    }
}
