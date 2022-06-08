package ru.netology.honeybadger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log(" Создаём и наполняем список");
        logger.log("Просим пользователя ввести входные данные для списка");
        List<Integer> list = createList();
        System.out.println(list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int thresholForTheFilter = 0;
        try {
            System.out.println("Введите порог для фильтра:");
            thresholForTheFilter = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Filter filter = new Filter(thresholForTheFilter);
        logger.log("Запускаем фильтрацию");
        list = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println(list);
        logger.log("Завершаем программу");
    }

    public static List<Integer> createList() {
        List<Integer> list = null;
        try {
            int listSize;
            int maxValue;
            System.out.println("Введите размер списка:");
            listSize = scanner.nextInt();
            System.out.println("Введите верхнюю границу для значений:");
            maxValue = scanner.nextInt();
            Logger logger = Logger.getInstance();
            logger.log(" Создаём и наполняем список");
            list = new ArrayList<>(listSize);
            Random random = new Random();
            for (int i = 0; i < listSize; i++) {
                list.add(random.nextInt(maxValue));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
