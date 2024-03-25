package main.java.animals;

import java.util.Random;

public class Kotik {

    // Объявляем переменные экземпляра
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count = 0;
    private static final int METHODS = 5;


    // Создаем два конструктора класса
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }


    public Kotik() {
        count++;
    }

    // Добавляем методы поведения животного
    public boolean play() {
        if (satiety > 0) {
            satiety--;
            System.out.println(name + " is playing.");
            return true;
        } else {
            System.out.println(name + " wants to eat.");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            System.out.println(name + " is sleeping.");
            return true;
        } else {
            System.out.println(name + " wants to eat.");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            System.out.println(name + " is washing.");
            return true;
        } else {
            System.out.println(name + " wants to eat.");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            System.out.println(name + " is walking.");
            return true;
        } else {
            System.out.println(name + " wants to eat.");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety--;
            System.out.println(name + " is hunting.");
            return true;
        } else {
            System.out.println(name + " wants to eat.");
            return false;
        }
    }

    // Создаем методы для кормления котика
    public boolean eat(int units) {
        satiety += units;
        System.out.println(name + " is eating.");
        return true;
    }

    public boolean eat(int units, String food) {
        satiety += units;
        System.out.println(name + " is eating " + food + ".");
        return true;
    }

    public boolean eat() {
        return eat(1, "something");
    }

    // Создаем метод liveAnotherDay()
    public String[] liveAnotherDay() {
        String[] actions = new String[24];
        for (int i = 0; i < 24; i++) {
            Random random = new Random();
            int actionIndex = random.nextInt(METHODS) + 1;
            switch (actionIndex) {
                case 1:
                    actions[i] = i + " - " + (play() ? "played" : "wanted to eat");
                    break;
                case 2:
                    actions[i] = i + " - " + (sleep() ? "slept" : "wanted to eat");
                    break;
                case 3:
                    actions[i] = i + " - " + (wash() ? "washed" : "wanted to eat");
                    break;
                case 4:
                    actions[i] = i + " - " + (walk() ? "walked" : "wanted to eat");
                    break;
                case 5:
                    actions[i] = i + " - " + (hunt() ? "hunted" : "wanted to eat");
                    break;
            }
        }
        return actions;
    }

    // Создаем геттеры и сеттеры для доступа к переменным
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static int getMETHODS() {
        return METHODS;
    }
}

