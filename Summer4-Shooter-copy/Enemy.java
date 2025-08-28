import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health;
    public void act()
    {
        
    }
    public void move(){
        setLocation(getX(),getY()+2);
    }
    public void hit(){
        Actor projectile = getOneIntersectingObject(Ball.class);
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        Counter counter = myWorld.getCounter();
        Healthbar healthbar = myWorld.getHealthbar();
        if (projectile != null){
            getWorld().removeObject(projectile);
            health--;
        }
        if (getY()==599){
            getWorld().removeObject(this);
            healthbar.loseHealth();
        }
        else if(health==0){
            counter.addScore();
            getWorld().removeObject(this);
        }
    }
}
