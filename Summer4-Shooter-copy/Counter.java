import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public Counter(){
        setImage(new GreenfootImage("Score: ", 50, Color.GREEN, Color.BLACK));
    }
    public void act()
    {
        youWin();
        setImage(new GreenfootImage("Score: " + score, 50, Color.GREEN, Color.BLACK));
    }
    public void addScore(){
        score++;
    }
    public void youWin(){
        if(score >= 50){
            getWorld().addObject(new YouWin(), 300, 300);
            Greenfoot.stop();
        }
    }
}
