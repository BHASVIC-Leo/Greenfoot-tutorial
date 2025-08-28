import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wallbase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wallbase extends Walls
{
    /**
     * Act - do whatever the Wallbase wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wallbase(){
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }
    public void act()
    {

    }
}
