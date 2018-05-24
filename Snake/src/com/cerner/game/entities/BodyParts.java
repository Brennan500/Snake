package com.cerner.game.entities;

import java.awt.Color;
import java.awt.Graphics;

public class BodyParts
{
    private int Xcoor, Ycoor, width, height; 
    
    //constructor that takes three int parameters 
    public BodyParts(int Xcoor, int Ycoor, int tile_size)
    {
        this.Xcoor = Xcoor; 
        this.Ycoor = Ycoor; 
        this.width = tile_size; 
        this.height = tile_size;
    }
    //method to update the body parts 
    public void tick()
    {
        
    }
    //method to draw body parts on screen and fills in inside of snake 
    public void draw(Graphics g)
    {
        //set the color to fill rect
        g.setColor(Color.BLACK);
        //create a snake rectangle and fill it with black 
        g.fillRect(Xcoor*width, Ycoor*height, width, height);
        g.setColor(Color.GREEN); 
        g.fillRect(Xcoor*width+2, Ycoor*height+2, width, height);
        
    }
}
