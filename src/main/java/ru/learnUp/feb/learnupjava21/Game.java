package ru.learnUp.feb.learnupjava21;

import org.springframework.context.ApplicationContext;

import java.util.Locale;
import java.util.Scanner;

public class Game {

    public static int x = (int) (Math.random() * 1000);

    public static void gameProcess(ApplicationContext context) {

        MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
        Locale locale = Locale.getDefault();
        System.out.println(context.getMessage("hello", null, locale));
        System.out.println(context.getMessage("attempts", null, locale));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int inputNumber = scanner.nextInt();
            publisher.publishEvent(inputNumber);
            if (inputNumber == x) {
                break;
            }
        }
    }

}
