package com.company;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args)
            throws Exception
    {
        System.out.println("Main executed");

        Robot robot = new Robot();
        Random random = new Random();
        int x = 0;
        int y = 0;
        Point curPosition = MouseInfo.getPointerInfo().getLocation();
        for(;;)
        {
            robot.delay(60000);
            if((int)curPosition.getX() != x || (int)curPosition.getY() != y) {
                x = random.nextInt() % 640;
                y = random.nextInt() % 480;
                robot.mouseMove(x, y);
            }
        }
    }
}
