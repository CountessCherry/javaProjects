package com.company;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class trafficLights {
    public String light;
    public stackFSM brain = new stackFSM();

    public void showLight() {
        System.out.println(this.light);
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("тебя никто не любит. еще и программа не работает. поздравляю, у тебя ужасная жизнь.");
        }
    }

    public void yellowLight() {
        this.light = "yellow";
        brain.pushState(this.light);
        showLight();
    }

    public void redLight() {
        this.light = "red";
        brain.pushState(this.light);
        showLight();
    }

    public void greenLight() {
        this.light = "green";
        brain.pushState(this.light);
        showLight();
    }

    public void work() {
        System.out.println("f to pay respect, a to get out");
        Scanner s = new Scanner(System.in);
        if (brain.getCurrentState() == null) {
            redLight();
        }
        while (true) {
            if (s.nextLine().equals("a")) break;
            else {
                switch (brain.getCurrentState()) {
                    case ("green"):
                        redLight();
                        break;
                    case ("red"):
                        yellowLight();
                        break;
                    case ("yellow"):
                        greenLight();
                        break;
                        // check if previous light was green or red
                    /*String t = brain.getCurrentState();
                    System.out.println(t);
                    if (t.equals("red")) greenLight();
                    else if (t.equals("green") || t == null) redLight();*/
                }
            }
        }
    }

}

class stackFSM {
    private Stack<String> stack;

    public stackFSM() {
        this.stack = new Stack<String>();
    }

    public String getCurrentState() {
        return !stack.isEmpty() ? stack.pop() : null;
    }

    public void pushState(String state) {
        String t = getCurrentState();
        if (t == null) {
            stack.push(state);
        } else {
            if (!t.equals(state)) stack.push(state);
        }
    }

}
