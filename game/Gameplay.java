import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.Timer;
public class Gameplay extends JPanel implements KeyListener, ActionListener{
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private Timer timer;
    private int delay = 8;
    private int playerX = 310;
    private int ballPosX=120;
    private int ballPosY=350;
    private int ballXdir=-1;
    private int ballYdir=-2;
    public Gameplay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }
    public void paint(Graphics g){
        //background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592); 
        //borders
        g.setColor(Color.green);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);
        //the paddle
        g.setColor(Color.red);
        g.fillRect(playerX, 550, 100, 8);
        //the ball
        g.setColor(Color.yellow);
        g.fillOval(ballPosX, ballPosY, 20, 20);
        
        g.dispose();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        timer.start();
        if(play){
            if(new Rectangle(ballPosX, ballPosY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 9))){
                ballYdir = -ballYdir;
            }
            ballPosX+=ballXdir;
            ballPosY+=ballYdir;
            if(ballPosX<0){
                ballXdir= -ballXdir;
            }
            if(ballPosY<0){
                ballYdir= -ballYdir;
            }
            if(ballPosX>670){
                ballXdir= -ballXdir;
            }
        }
        repaint();
    }
    /*
    @Override
    public void keyTiped(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e){}
    */
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(playerX>=600){
                playerX=600;
            }
            else{
                moveRight();
            }
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            if(playerX>=600){
                playerX=10;
            }
            else{
                moveLeft();
            }
        }
    }
    public void moveRight(){
        play=true;
        playerX+=20;
    }
    public void moveLeft(){
        play=true;
        playerX-=20;
    }
}
//https://www.youtube.com/watch?v=K9qMm3JbOH0
//https://www.youtube.com/watch?v=e9jRfgjV4FQ