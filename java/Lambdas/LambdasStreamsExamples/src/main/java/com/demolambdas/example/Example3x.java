package com.demolambdas.example;

import java.util.Date;
import java.util.Random;
import java.util.function.*;

public class Example3x {
    
    public static void main(String[] args){
//        Function<String, Integer> aEntero = s -> Integer.valueOf(s);
//        System.out.println(aEntero.apply("33"));
//        
//        BiFunction<String, String, Integer> aEnteroConcat = (s1,s2) -> Integer.valueOf(s1+s2);
//        System.out.println(aEnteroConcat.apply("3","5"));
//        
//        
        UnaryOperator<Integer> alCuadrado = n -> n*n;
        System.out.println(alCuadrado.apply(10));
        
        BinaryOperator<Integer> potencia = (n1, n2) -> (int)Math.pow(n1, 2);
        System.out.println(potencia.apply(4,2));

//        
//        
//        Predicate<Integer> esPar = n -> n % 2 == 0;
//        System.out.println(esPar.test(2));
//        System.out.println(esPar.test(3));
//        
//        BiPredicate<Integer, Integer> esParSumatoria = (n1,n2) -> (n1+n2) % 2 == 0;
//        System.out.println(esParSumatoria.test(10,1));
//        System.out.println(esParSumatoria.test(11,1));
//        
//        
        
        
//        Consumer<String> mayusculas = (s) -> System.out.println(s.toUpperCase());
//        mayusculas.accept("hola mundo");
//        
//        BiConsumer<String,String> mayusculasConcat = (s1,s2) -> System.out.println(s1.concat(s2).toUpperCase());
//        mayusculasConcat.accept("hola"," mundo");
        

//        Supplier<String> random = () -> "Hoy es: "+new Date();
//        System.out.println(random.get());
        
        
        
    }
}
