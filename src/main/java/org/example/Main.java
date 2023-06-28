package org.example;

import processing.core.PApplet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    int start = 0;
    public static void main(String[] args) {
        PApplet.main("org.example.Main",args);}

    @Override
    public void draw() {
        ellipse(start,HEIGHT/5,10,10);
        ellipse(start*2,HEIGHT*2/5,10,10);
        ellipse(start*3,HEIGHT*3/5,10,10);
        ellipse(start*4,HEIGHT*4/5,10,10);
        start++;
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }



}
