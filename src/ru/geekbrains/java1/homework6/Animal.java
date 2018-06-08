package ru.geekbrains.java1.homework6;

public class Animal {
    protected int maxDistanceRun;
    protected int maxDistanceSwim;
    protected double maxHeight;
    private String name;
    private String color;
    private int weight;

//Конструктор суперкласса:
    public Animal(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //Бег
    public boolean run(int distance) {
//        if (distance >= 0 && distance <= maxDistanceRun) return true; // мой первоначальный вариант
//        return false;
        return (distance >= 0 && distance <= maxDistanceRun);// мой лаконичный вариант
    }
    //Прыжки
    public boolean jump(double height){
//        if (height >= 0 && height <= maxHeight) return true;
//        return false;
        return (height >= 0 && height <= maxHeight);
    }
    //Плавание
    public boolean swim(int distance) {
//        if (distance >= 0 && distance <= maxDistanceSwim) return true;
//        return false;
        return (distance >= 0 && distance <= maxDistanceSwim);
    }

    public String getName () {
        return name;
    }

    public void info(){
        System.out.println(name + ", цвет: " + color + ", вес: " + weight + " кг");
    }

}
