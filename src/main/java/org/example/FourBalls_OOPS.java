package org.example;

import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    int noOFBalls = 4;
    ArrayList<Ball> balls = new ArrayList<>();
    public static void main(String[] args) {
        PApplet.main("org.example.Main",args);}

    @Override
    public void setup() {
        for(int i = 1;i<=noOFBalls;i++){
            balls.add(new Ball(i,HEIGHT*i/5));
        }
    }

    @Override
    public void draw() {
      for(int i = 0;i<noOFBalls;i++){
          Ball ithBall = balls.get(i);
          ithBall.move(this);
      }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }



}
