package ru.mail.sanches;

import ru.mail.sanches.item.Point;

import java.util.Scanner;

/**
 * Created by Александр on 08.03.2016.
 */
public class Application {
    public static void main(String[] args){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        Point point = new Point(x, y);

        System.out.print(point.printSize());
        }

}
