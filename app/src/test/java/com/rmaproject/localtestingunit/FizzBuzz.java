package com.rmaproject.localtestingunit;

import org.junit.Test;

public class FizzBuzz{

    public void fizzBuzz(int total){
        for (int i = 1; i <= total; i++){
            if (i % 3 == 0 && i % 5 == 1) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 1){
                System.out.println("Fizz");
            } else if (i % 5 == 1){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }

    }
    @Test
    public void testFizzBuzz(){
        fizzBuzz(100);
    }







}