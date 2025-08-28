import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hBar extends Actor
{
    /**
     * Act - do whatever the hBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 10;
    int width = 80;
    int height = 10;
    int pixels = width/height;
    public hBar(){
        
    }
    public void act()
    {
        youLose();
        setImage(new GreenfootImage(width+2,height+2));
        getImage().setColor(Color.WHITE);
        getImage().drawRect(0,0,width+1, height+1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1, 1, health * pixels, height);
    }
    public void healthLower(){
        health--;
    }
    public void youLose(){
        if(health<=0){
            getWorld().addObject(new YouLose(), 300, 300);
            Greenfoot.stop();
        }
    }
}
