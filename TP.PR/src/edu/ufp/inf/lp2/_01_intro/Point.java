package edu.ufp.inf.lp2._01_intro;
import java.util.*;


public class Point {
    private float x;
    private float y;
    public Point(){}
    public Point(float x, float y){
        this.x = x;     //porque utilizamos o mesmo nome para variavel x
        this.y = y;
    }
    public float distX(Point p){
        return this.x - p.x;
    }
    public float distY(Point p){
        return this.y - p.y;
    }

    public float dist(Point p){
        float dx = distX(p);
        float dy = distY(p);
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public void moveX(float dx){
        this.x += dx;
    }
    public void moveY(float dy){
        this.y += dy;
    }
    public void move(Point p){
        moveX(p.x);
        moveY(p.y);
    }
    public boolean betweenPointsX(Point leftpt, Point rightpt){
        return this.x > leftpt.x && this.x < rightpt.x;
    }
    public boolean betweenPointsY(Point uppt, Point downpt){
        return this.y > uppt.y && this.y < downpt.y;
    }
    public static void main(String[] args){
        Point p1 = new Point(1.0F,1.1F);
        Point p2 = new Point(1.0F,1.0F);

        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Float.compare(point.x, x) == 0 && Float.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
