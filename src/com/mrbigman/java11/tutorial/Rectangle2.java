package com.mrbigman.java11.tutorial;


// this keyword in the constructor

public class Rectangle2 {

    private int x, y;
    private int width, height;

    public Rectangle2() {
        this(0, 0, 1, 1);
    }
    public Rectangle2(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle2(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
