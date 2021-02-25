package com.suboch.Overriding;

/*переопределение метода
с помощью одного метода собака и кошка издают разные звуки
*/

public class Main {

    public static void main(String[] args) {

        Animal.Cat cat = new Animal.Cat();
        Animal.Dog dog = new Animal.Dog();

        cat.voice();
        dog.voice();

    }
}
