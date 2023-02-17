package com.example;

public class forDI {
    public static void main(String[] args) throws Exception {

        FelineInterface felineInterface = new Feline();
        Lion lion = new Lion(felineInterface);
        lion.getFood();
        lion.getKittens();


    }
}