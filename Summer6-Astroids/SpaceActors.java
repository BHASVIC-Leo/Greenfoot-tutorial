import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceActors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceActors extends Actor
{
    /**
     * Act - do whatever the SpaceActors wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void wrap(){
        if(getX()==0){
            setLocation(598, getY());
        }
        if(getY()==0){
            setLocation(getX(), 648);
        }
        if(getX()==599){
            setLocation(1, getY());
        }
        if(getY()==649){
            setLocation(getX(), 1);
        }
    }
    public void destroy(){
        if(getX()==0){
            getWorld().removeObject(this);
        }
        else if(getY()==0){
            getWorld().removeObject(this);
        }
        else if(getX()==599){
            getWorld().removeObject(this);
        }
        else if(getY()==649){
            getWorld().removeObject(this);
        }
    }
}
