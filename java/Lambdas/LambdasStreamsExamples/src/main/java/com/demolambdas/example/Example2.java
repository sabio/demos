package com.demolambdas.example;


public class Example2 {
    public static void main(String[] args){
        
        int number = 100;
        
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<number;i++) 
                    System.out.println("Hello");
            }
            
        };
        //Runnable r2 = () -> { for(int i=0;i<number;i++) System.out.println("World"); };
        
        new Thread(r1).start();
        //new Thread(r2).start();
        
        	
    }
}

