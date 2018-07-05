package com.company;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args)
            throws Exception
    {
        System.out.println("'Moving' executed");

        Robot robot = new Robot();
        int curX = 0, curY = 0, prevX, prevY;
        for(;;)
        {
            prevX = curX;
            prevY = curY;
            curX = (int)MouseInfo.getPointerInfo().getLocation().getX();
            curY = (int)MouseInfo.getPointerInfo().getLocation().getY();
//            System.out.print("prevX: ");
//            System.out.println(prevX);
//            System.out.print("prevY: ");
//            System.out.println(prevY);
//            System.out.print("curX: ");
//            System.out.println(curX);
//            System.out.print("curY: ");
//            System.out.println(curY);
//            System.out.println("--------------------");
            robot.delay(15000);
            if(curX == prevX && curY == prevY) {
                robot.mouseMove(ThreadLocalRandom.current().nextInt(0, 641), ThreadLocalRandom.current().nextInt(0, 481));
            }
        }
    }
}
