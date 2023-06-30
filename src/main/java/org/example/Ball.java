package org.example;

import processing.core.PApplet;

public class Ball extends PApplet {

    public static final int DIAMETER = 10;
    private int start = 0;
    private int height;
    private int factor;
    public Ball(int factor,int height) {

        this.factor = factor;
        this.height = height;

    }

    public void move(PApplet Board){
        Board.ellipse(start,height, DIAMETER,DIAMETER);
        startIncrementer();
    }

    private void startIncrementer() {
        start=start+factor;
    }
}
