package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();
//        rwOnly.s="AbcD";
//        System.out.println(rwOnly.s);

        rwOnly.setS("Saksham");
        System.out.println(rwOnly.getS());
    }
}