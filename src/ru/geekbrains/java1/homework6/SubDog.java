package ru.geekbrains.java1.homework6;

public class SubDog extends Dog {
    //Конструктор подкласса с ручным вводом предельных ограничений - так можно разделить собак по породам например:
    public SubDog(String name, String color, int weight, int maxDistanceRun, int maxDistanceSwim, double maxHeight) {
        super (name, color, weight);//вызываю конструктор суперкласса Animal в 1-ю очередь
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        this.maxHeight = maxHeight;
    }
    //Для этого подкласса доступны все методы Супперклассов Dog и Animal
}
