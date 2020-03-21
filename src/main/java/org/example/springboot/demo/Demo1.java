package org.example.springboot.demo;

public class Demo1 {
    public static void main(String[] args) {
        String str = "ss=ddd";
        String s = str.replace("=", ":");
        System.out.println(s);
    }
}
