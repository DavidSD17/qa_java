package ru.yandex.practikum;

import java.util.List;

public class Cat extends Animal implements Predator{

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }
    public Cat(){

    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

    @Override
    public List<String> eatMeat() throws Exception {
            return getFood("Хищник");
    }
}
