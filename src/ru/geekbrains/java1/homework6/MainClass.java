package ru.geekbrains.java1.homework6;

public class MainClass {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", "серый", 4);
        Dog dog1 = new Dog("Шарик", "коричневый", 10);
        SubDog dog2 = new SubDog("Рекс", "светло-русый", 12, 2000, 100, 2.5);
        SubDog dog3 = new SubDog("Тузик", "каштановый", 3, 400, 20, 0.7);
        //Задаю массивы параметров для проверки:
        int[] distancesRun = {50, 400, 1000};
        int[] distancesSwim = {1, 10, 75};
        double[] heights = {0.2, 2, 3.5};

        cat1.voice();
        checkParameters(cat1, distancesRun, distancesSwim, heights);

        dog1.voice();
        checkParameters(dog1, distancesRun, distancesSwim, heights);

        dog2.voice();
        checkParameters(dog2, distancesRun, distancesSwim, heights);

        dog3.voice();
        checkParameters(dog3, distancesRun, distancesSwim, heights);
    }

    // Метод проверки параметров, заданных массивом:
    public static void checkParameters (Animal object, int parametersRun[], int parametersSwim[], double parametersHeight[]) {
        object.info();
        System.out.print("Может ли пробежать: ");
        //Прохожу по массиву длин дистанций Бега:
        for (int i = 0; i < parametersRun.length; i++) {
            System.out.print(parametersRun[i] + " м? Ответ: " + object.run(parametersRun[i]) + "/  ");//вывод результата проверки
        }
        System.out.println();

        System.out.print("Может ли проплыть: ");
        for (int i = 0; i < parametersSwim.length; i++) {
            System.out.print(parametersSwim[i] + " м? Ответ: " + object.swim(parametersSwim[i]) + "/  ");
        }
        System.out.println();

        System.out.print("Может ли перепрыгнуть препятствие высотой: ");
        for (int i = 0; i < parametersHeight.length; i++) {
            System.out.print(parametersHeight[i] + " м? Ответ: " + object.jump(parametersHeight[i]) + "/  ");
        }
        System.out.println("\n");
    }
}
