package com.demolambdas.example;


public class Example3 {
    public static void main(String[] args){
        Runnable thread1 = new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<1000;i++) 
                    System.out.println("Hello");
            }
            
        };
        Runnable thread2 = () -> { for(int i=0;i<1000;i++) System.out.println("World"); };
        
        (new Thread(thread1)).start();
        (new Thread(thread2)).start();
        (new Thread(() -> { for(int i=0;i<1000;i++) System.out.println("!!"); })).start();
        
        	
    }
}

