import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Button popButton = new Button();
    public static int population = 70;
    String input;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(popButton, 100, 50);
    }
    public void act(){
        if(Greenfoot.mouseClicked(popButton)){
            populate(population);
            //Code crashed and would not run again after following the 
        }
    }
    public void populate(int population){
        this.population = population;
        for (int i=0; i< population; i++){
            addObject(new Person(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
}
