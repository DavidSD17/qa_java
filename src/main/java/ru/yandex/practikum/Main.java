package ru.yandex.practikum;

public class Main {
    public static void main(String[] args) throws Exception {

    FelineInterface felineInterface = new Feline();
    Lion lion = new Lion(felineInterface);
    System.out.println(lion.getKittens(1));



    }
}