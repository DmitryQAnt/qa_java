package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private String sex;
    private Feline feline;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    // Алеся, привет!  Я убрал создание объекта и добавил конструктор, как ты указала.
    // Правда, на мой неофитский взгляд, передавать в него параметр sex - лишнее. Тесты сразу его затребовали (их тоже изменил),
    // а тестовой нагрузки он, опять же на мой взгляд, не несет.
    public Lion(String sex, Feline feline) {
        this.feline = feline;
        this.sex = sex;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}

