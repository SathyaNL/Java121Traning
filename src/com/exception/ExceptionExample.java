package com.exception;

public class ExceptionExample {
    public static void main(String[] args) {
        try{
            int x = 100/0;
            System.out.println("In try block fraefWA");
        }
        catch (ArithmeticException a){
            System.out.println("Arithmetic excepiton" + a);
        }
        catch(Exception e){
            System.out.println("Error in catch");
       //     System.exit(0);
        }

        finally {
            System.out.println("In finally block");
        }
        System.out.println("In try block");
    }
}
