package javaGame;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Player extends JComponent{
    private int health;
    private int score;
    private Color color;
    private int winCordX;
    private int winCordY;
    private int cordX;
    private int cordY;
    private boolean isMoving = false;
    private Graphics2D g2;
    BufferedImage image;

    public Player(int winCordX, int winCordY) {
        this.winCordX = winCordX;
        this.winCordY = winCordY;

        this.cordX = 10;
        this.cordY = 0;

        this.health = 100;
        this.score = 0;

        setOpaque(false);
        this.color = Color.red;

        setBackground(Color.white);
        setSize(450, 400);
        addMouseMotionListener(new MouseMotionHandler());

        Image img = getToolkit().getImage("C:\\Users\\admin\\IdeaProjects\\javaGame\\src\\javaGame\\маленькая иванка.png");


        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 1);
        try {
            mt.waitForAll();
        } catch (Exception e) {
            System.out.println("Image not found.");
        }
        image = new BufferedImage(img.getWidth(this), img.getHeight(this),
                BufferedImage.TYPE_INT_ARGB);
        g2 = image.createGraphics();
        g2.drawImage(img, cordX, cordY, this);


    }


    public void start() {
        javax.swing.Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nextStep();
            }
        } );
        timer.start();
    }

    public void jump() {
        cordY += 100;
        cordX += 100;
        repaint();
    }


    private void nextStep() {
        cordY = 300;
        cordX += 5;
        score += 5;
        if (cordX > 950) cordX -= 950;
        repaint();
    }

    public int getScore() {
        return this.score;
    }

    public void setX(int posX) {
        this.cordX = posX;
    }

    public void setY(int posY) {
        this.cordY = posY;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.drawImage(image, cordX, cordY, this);
    }


    class MouseMotionHandler extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            cordX = e.getX();
            cordY = e.getY();
            repaint();
        }

        public void mouseMoved(MouseEvent e) {
        }
    }

}


