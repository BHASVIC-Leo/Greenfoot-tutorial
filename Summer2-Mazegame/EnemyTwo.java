import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTwo extends Actor
{
    /**
     * Act - do whatever the EnemyTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=1;
    public EnemyTwo(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        move();
    }
    public void move(){
        setLocation(getX(), getY()+speed);
        if(isTouching(Walls.class)){
            speed = -speed;
        }
    }
}
