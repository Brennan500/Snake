//package for organizing game class files 
package com.cerner.game;

//import grid class
import java.awt.GridLayout;

//import frame class to utilize for game app
import javax.swing.JFrame;

//import the screen class I created 
import com.cerner.game.graphics.Screen; 

//Frame class I made inherits from JFrame class 
//that was imported
public class Frame extends JFrame
{
    //constructor for Frame class
    public Frame()
    {
        //pressing x on window shuts down operation 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //sets title of window pane
        setTitle("Snake"); 
        //window is not resizable 
        setResizable(false); 
        //initializes the game
        init(); 
    }
    
    //method to start up the game 
    public void init()
    {
        setLayout(new GridLayout(1,1,0,0));
        //create new screen variable
        Screen s = new Screen(); 
        //add screen to grid 
        add(s);
        pack(); 
        //sets screen up in center
        setLocationRelativeTo(null); 
        //allow the screen to be seen 
        setVisible(true);
        
    }
    
    //main method
    public static void main(String[] args)
    {
        //create new frame and call constructor 
        new Frame();   
        
    }

}
