package ru.netology.honeybadger;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int cout = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : source) {
            if (integer > treshold) {
                result.add(integer);
                logger.log("Элемент " + integer + " проходит");
                cout++;
            } else {
                logger.log("Элемент " + integer + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + cout + " элемента из " + source.size());
        return result;
    }
}
