package ru.learnUp.feb.learnupjava21;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private final int number;

    public MyEvent(int number) {
        super(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
