package com.company;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args)
            throws Exception
    {
        System.out.println("Main executed");

        Robot robot = new Robot();
        int curX = 0, curY = 0, prevX, prevY;
        for(;;)
        {
            prevX = curX;
            prevY = curY;
            curX = (int)MouseInfo.getPointerInfo().getLocation().getX();
            curY = (int)MouseInfo.getPointerInfo().getLocation().getY();
            robot.delay(15000);
            if(curX == prevX && curY == prevY) {
                robot.mouseMove(ThreadLocalRandom.current().nextInt(0, 641), ThreadLocalRandom.current().nextInt(0, 481));
            }
        }
    }
}
