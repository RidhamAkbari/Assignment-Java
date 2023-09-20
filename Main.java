package com.mycompany.app;
import com.mycompany.math.Calculator;

public class Main{
    public static void main(){
        Calculator obj1 = new Calculator();
        int sum;
        sum = obj1.add(2,67);
        System.out.println(sum);
    }
}