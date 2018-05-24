package com.cerner.game.graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

//class inherits from JPanel and implements interface runnable 
public class Screen extends JPanel implements Runnable 
{
    //constants for the width and height of screen 
    public static final int WIDTH = 800, HEIGHT = 800;
    //creation of thread
    private Thread thread; 
    //bool to detect if running
    private boolean running = false; 

    //constructor that sets the dimensions of the screen 
    public Screen()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        //game is started on boot up 
        start(); 
    }
    //clock that runs to update the game 
    public void tick()
    {
        
    }
    public void paint(Graphics g)
    {
        for(int i = 0; i < WIDTH/10; i++)
        {
            g.drawLine(i*10, );
        }
    }
    //starts the game on screen 
    public void start()
    {
        running = true; 
        thread = new Thread(this, "Game Loop"); 
        thread.start(); 
        
    }
    //stops the game on screen 
    public void stop()
    {
        
    }
    
    public void run() 
    {
        while(running)
        {
           tick(); 
           repaint(); 
        }
        
    }
}
