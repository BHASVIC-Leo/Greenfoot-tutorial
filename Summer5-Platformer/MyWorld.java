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
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,322,138);
        player.setLocation(254,175);
        Ground ground = new Ground();
        addObject(ground,196,280);
        ground.setLocation(352,228);
        player.setLocation(108,190);
        ground.setLocation(37,316);
        Ground ground2 = new Ground();
        addObject(ground2,243,231);
        Ground ground3 = new Ground();
        addObject(ground3,480,118);
        ground3.setLocation(540,186);
        ground2.setLocation(341,229);
        Ground ground4 = new Ground();
        addObject(ground4,133,146);
        player.setLocation(95,283);
        ground2.setLocation(278,271);
        ground2.setLocation(304,267);
        Ground ground5 = new Ground();
        addObject(ground5,572,406);
        Ground ground6 = new Ground();
        addObject(ground6,826,172);
        Ground ground7 = new Ground();
        addObject(ground7,170,509);
        ground2.setLocation(386,343);
        ground2.setLocation(354,328);
        Ground ground8 = new Ground();
        addObject(ground8,762,313);
        ground6.setLocation(809,72);
        Rock rock = new Rock();
        addObject(rock,446,508);
        Rock rock2 = new Rock();
        addObject(rock2,116,89);
        Rock rock3 = new Rock();
        addObject(rock3,468,116);
        Rock rock4 = new Rock();
        addObject(rock4,364,317);
        Rock rock5 = new Rock();
        addObject(rock5,123,413);
        Shroom shroom = new Shroom();
        addObject(shroom,318,440);
        Shroom shroom2 = new Shroom();
        addObject(shroom2,361,232);
        Shroom shroom3 = new Shroom();
        addObject(shroom3,544,299);
        Shroom shroom4 = new Shroom();
        addObject(shroom4,66,568);
        Shroom shroom5 = new Shroom();
        addObject(shroom5,28,77);
        Shroom shroom6 = new Shroom();
        addObject(shroom6,560,119);
        Shroom shroom7 = new Shroom();
        addObject(shroom7,785,499);
        Shroom shroom8 = new Shroom();
        addObject(shroom8,778,284);
        Rock rock6 = new Rock();
        addObject(rock6,834,387);
        Shroom shroom9 = new Shroom();
        addObject(shroom9,800,171);
        rock3.setLocation(652,98);
        rock.setLocation(564,530);
    }
}
