package ru.geekbrains.java1.homework6;

public class Cat extends Animal {
    //Конструктор подкласса:
    public Cat(String name, String color, int weight) {
        super(name, color, weight);//вызываю конструктор суперкласса Animal в 1-ю очередь
        //задаю ограничения для котов:
        maxDistanceRun = 200;
        maxDistanceSwim = 0;
        maxHeight = 2;
    }

    //Переопределяю методы из Суперкласса:
    @Override
    public void info() {
        System.out.print("Кот ");
        super.info();//использую функционал из этого метода суперкласса
    }

    public void voice() {
        System.out.println(getName() + " замяукал.");
    }
}
