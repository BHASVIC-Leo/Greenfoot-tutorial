import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Person(){
        getImage().scale(40,40);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
        movement();
    }
    public void movement(){
        move(4);
        turn(Greenfoot.getRandomNumber(19)-9);
        if(isAtEdge()){
            turn(100);
        }
    }
}
