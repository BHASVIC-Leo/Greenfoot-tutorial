import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed=5;
    int cooldown=0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player (){
        setRotation(270);
    }
    public void act()
    {
        move();
        fire();
        cooldown--;
    }
    public void move(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed, getY());
        }
    }
    public void fire(){
        if(Greenfoot.isKeyDown("space")&&cooldown<1){
            getWorld().addObject(new Ball(), getX(), getY()-30);
            cooldown=10;
        }
    }
}
