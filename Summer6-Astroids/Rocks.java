import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocks extends SpaceActors
{
    /**
     * Act - do whatever the Rocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hVel=Greenfoot.getRandomNumber(5)+1;
    int vVel=Greenfoot.getRandomNumber(5)+1;
    public Rocks(){
        if(Greenfoot.getRandomNumber(2)==1){
            hVel=-hVel;
        }
        if(Greenfoot.getRandomNumber(2)==1){
            vVel=-vVel;
        }
    }
    public void act()
    {
        setLocation(getX()+hVel,getY()+vVel);
        wrap();
    }
}
