import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallSmal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallSmal extends Walls
{
    /**
     * Act - do whatever the WallSmal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallSmal(){
        getImage().scale(getImage().getWidth()*4, getImage().getHeight());
    }
    public void act()
    {
        // Add your action code here.
    }
}
