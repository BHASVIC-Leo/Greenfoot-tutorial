import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rock(){
        getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("left")){
            move(1);
        }
        if(getX()==0){
            setLocation(getWorld().getWidth()-11, Greenfoot.getRandomNumber(600));
        }
        if(getX()==890){
            setLocation(getWorld().getWidth()-899, Greenfoot.getRandomNumber(600));
        }
    }
}
