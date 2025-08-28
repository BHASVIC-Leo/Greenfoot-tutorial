import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallTall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallTall extends Walls
{
    /**
     * Act - do whatever the WallTall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallTall(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()*3);
    }
    public void act()
    {
        // Add your action code here.
    }
}
