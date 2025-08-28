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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,265,147);
        Enemy bear = new Enemy();
        Enemy bear1 = new Enemy();
        Enemy bear2 = new Enemy();
        addObject(bear, 40, 60);
        addObject(bear1, 140, 160);
        addObject(bear2, 240, 260);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,445,336);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,392,209);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,86,331);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,472,85);
    }
}
