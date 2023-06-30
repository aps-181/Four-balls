package org.example;

import processing.core.PApplet;

public class FourBalls_Procedural extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int start = 0;
    int noOfBalls = 4;

    public static void main(String[] args) {
        PApplet.main("org.example.FourBalls_Procedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ballGenerator();
        incrementer();
    }

    private void ballGenerator() {
        for(int i = 1;i<=noOfBalls;i++){
            ellipse(start*i,HEIGHT*i/5, DIAMETER,DIAMETER);
        }
    }

    private void incrementer() {
        start+=1;
    }
}
