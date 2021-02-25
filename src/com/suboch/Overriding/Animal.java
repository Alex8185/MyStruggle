package com.suboch.Overriding;

public class Animal {
    public void voice() {
        System.out.println("Голос");
    }

    public static class Cat extends Animal {

        public void voice() {
            System.out.println("Мяу");
        }
    }

    public static class Dog extends Animal {

        public void voice() {
            System.out.println("Гав");
        }
    }
}