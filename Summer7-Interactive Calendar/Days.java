import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Days here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Days extends Actor
{
    /**
     * Act - do whatever the Days wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    public Days(MyWorld world){
        this.world = world;
        getImage().scale(100, 100);
        getImage().clear();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)&& world.color != null){
            getImage().setColor(world.color);
            getImage().fillRect(0,0, 99, 99);
        }
    }
}
