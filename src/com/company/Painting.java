package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painting extends Canvas {
    public static final int FRAME_SIZE = 800;

    @Override
    public void paint(Graphics graphics) {
        final Line[] lines = new Line[7];
        Random random = new Random();
        for (int i = 0; i < lines.length; i++){
            lines[i] = new Line(random.nextInt(50), random.nextInt(50));
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(lines[i].getX(), lines[i].getY(), 1,1);
            System.out.printf("X: %.2f, Y1: %.2f, Y2: %.2fn", lines[i].getX(), lines[i].getY(), lines[i].getY2());
        }
    }

    public static void main(String[] args) {
        Painting canvas = new Painting();
        JFrame jframe = new JFrame();
        jframe.setSize(FRAME_SIZE,FRAME_SIZE);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().add(canvas);
        jframe.setVisible(true);
    }
}
