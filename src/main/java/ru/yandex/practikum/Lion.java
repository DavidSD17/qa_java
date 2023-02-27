package ru.yandex.practikum;

import java.util.List;

public class Lion extends Feline{
    boolean hasMane;
    protected String sex;

    public Lion(String sex, Feline feline){
        this.sex = sex;
        this.feline = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {  // Не знаю почему он не покрыт, тест на него написан
        return feline.getFood("Хищник");
    }
}
