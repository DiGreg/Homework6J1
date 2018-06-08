package ru.geekbrains.java1.homework6;

public class Dog extends Animal {
    //Конструктор подкласса:
    public Dog (String name, String color, int weight){
        super (name, color, weight);//вызываю конструктор суперкласса Animal в 1-ю очередь
        //задаю ограничения для собак:
        maxDistanceRun = 500;
        maxDistanceSwim = 10;
        maxHeight = 0.5;
    }

    //Переопределяю метод из Суперкласса:
    @Override
    public void info () {
        System.out.print("Пёс ");
        super.info();//использую функционал из такого же метода суперкласса
    }

    public void voice () {
        System.out.println(getName() + " загавкал.");
    }
}
