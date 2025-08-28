import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    public Button(){
        getImage().setColor(new Color(0, 0,0,0));
        setImage(new GreenfootImage("Population: " + world.population, 30, Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        // Add your action code here.
    }
}
