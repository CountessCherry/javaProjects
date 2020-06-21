package javaGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.Thread;
import java.security.Key;


public class Canva extends JFrame implements KeyListener {

    private int width;
    private int height;
    Player player = new Player(this.width, this.height); // створили нового гравця
    int playerPosX = player.getX();
    int playerPosY = player.getY();
    private Graphics2D g2;

    public Canva(int width, int height) {

        super("Game! You did it.");
        this.width = width;
        this.height = height;

        setBackground(Color.white);
        Container container = getContentPane();
        addPlayerToCanva();
        container.add(player);

        setPreferredSize(new Dimension(width, height));          // встановили розмір вікна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // встановили вихід по червоному хрестику

        setFocusable(true);
        addKeyListener(this);
        pack();                                   // спакували (видаляти нізя)
        setVisible(true);                         // зробити все вікно видимим
        JFrame.setDefaultLookAndFeelDecorated(true); // хз, по ідеї має робити красиво, но нічо не міняється
        player.start();

    }

    public int endGame() {
        //WindowConstants.EXIT_ON_CLOSE;
        JOptionPane.showMessageDialog(null, "Your score is " + player.getScore());
        return 0;
    }

    public void setFocusable(boolean b) {
        super.setFocusable(b);
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_F5)
            System.out.println("F5 pressed");
    }

    public void keyTyped(KeyEvent e) {

    }
    public void keyReleased(KeyEvent e) {

    }


    public void addPlayerToCanva() {
        this.player.setX(this.playerPosX);
        this.player.setY(this.playerPosY);
        JLayeredPane lp = getLayeredPane(); // створили багатошарову панель
        this.player.setBounds(0, 0, this.width, this.height); // видаляти короче нізя, но хз зачем воно
        lp.add(this.player, JLayeredPane.POPUP_LAYER); // додали гравця у верхній(?) шар
    }


}
