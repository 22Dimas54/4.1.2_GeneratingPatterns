package ru.netology.honeybadger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private Date date = new Date();

    public void log(String msg) {
        System.out.println("[" + new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()) + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
