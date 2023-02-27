package ru.yandex.practikum;

public class Main {
    public static void main(String[] args) throws Exception {

//    FelineInterface felineInterface = new Feline();
    Feline feline= new Feline();
    Lion lion = new Lion("Самец",feline);

    System.out.println(lion.getKittens(2));
    System.out.println(lion.getFood());



    }
}