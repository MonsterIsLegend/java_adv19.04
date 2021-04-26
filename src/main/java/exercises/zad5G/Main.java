package exercises.zad5G;

import java.util.Arrays;

//Zaproponuj rozwiązanie w oparciu o typy generyczne.
// W celu przechowywaniadanych skorzystaj z tablic, bądź dowolnego API służącego do przechowywaniadanych.
public class Main {
    public static void main(String[] args) {
    Animal [ ] animals = {
            new Cat("PERS"),
            new Dog("Rocky"),
            new Dog("BRUTUS")
    };
    AnimalHouse<Animal> animalHouse = new AnimalHouse<>(animals);
    Arrays.stream(animalHouse.getAnimals()).forEach(System.out::println);
    animalHouse.setAnimals(new Animal[5]);
    Arrays.stream((animalHouse.getAnimals())).forEach(System.out::println);
    }

}
