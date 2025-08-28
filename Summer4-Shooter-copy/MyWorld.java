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
    int time = 0;
    Counter counter = new Counter();
    Healthbar healthbar = new Healthbar();
    boolean boss=false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,280,377);
        player.setLocation(287,521);
        addObject(counter,94,42);

        addObject(healthbar,508,39);
    }

    public void act(){
        time++;
        Boss();
        if(Greenfoot.getRandomNumber(60) == 1){
            addRobot();
        }
        if(Greenfoot.getRandomNumber(120) == 1){
            addBee();
        }
    }
    public void Boss(){
        if (counter.score == 25 && !boss){
            addObject(new Boss(), 300, 0);
            boss = true;
        }
    }
    public void addRobot(){
        addObject(new Robot(), Greenfoot.getRandomNumber(600), 0);
    }
    public void addBee(){
        addObject(new Bee(), Greenfoot.getRandomNumber(600), 0);
    }
    public Counter getCounter(){
        return counter;
    }
    public Healthbar getHealthbar(){
        return healthbar;
    }
}
