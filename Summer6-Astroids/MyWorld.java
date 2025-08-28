import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    hBar healthBar = new hBar();
    Counter counter = new Counter();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 650, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ship ship = new Ship();
        addObject(ship,300,387);
        Rocks rocks = new Rocks();
        addObject(rocks, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(650));
        Rocks rocks1 = new Rocks();
        addObject(rocks1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(650));

        Rocks rocks2 = new Rocks();
        addObject(rocks2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(650));

        Rocks rocks3 = new Rocks();
        addObject(rocks3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(650));

        Rocks rocks4 = new Rocks();
        addObject(rocks4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(650));

        addObject(counter,63,24);
        addObject(healthBar,183,24);
    }

    public Counter getCounter(){
        return counter;
    }
    public hBar getHBar(){
        return healthBar;
    }
}
