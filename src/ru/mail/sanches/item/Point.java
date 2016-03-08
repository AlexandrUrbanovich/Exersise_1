package ru.mail.sanches.item;

/**
 * Created by Александр on 08.03.2016.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double printSize(){
        int X = x;
        int Y = y;
        if (X > 0 && Y > 0){
            System.out.println("Точка расположена в первой четверти");
        }if(X > 0 && Y < 0){
            System.out.println("Точка расположена в четвертой четверти");
        }if(X < 0 && Y > 0){
            System.out.println("Точка расположена во второй четверти");
        }if(X < 0 && Y < 0){
            System.out.println("Точка расположена в третьей четверти");
        }
        return 0;
    }
}
