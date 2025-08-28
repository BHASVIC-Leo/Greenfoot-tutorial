import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends SpaceActors
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        Counter counter = myWorld.getCounter();
        move(8);
        Actor debris = getOneIntersectingObject(Debris.class);
        Actor rocks = getOneIntersectingObject(Rocks.class);
        if(rocks != null){
            getWorld().removeObject(rocks);
            getWorld().addObject(new Debris(), getX(), getY());
            getWorld().addObject(new Debris(), getX(), getY());
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(debris != null){
            getWorld().removeObject(debris);
            counter.addScore();
            getWorld().removeObject(this);
        }
        else{
           destroy(); 
        }
    }
}
