import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vSpeed = 0;
    private int acceleration =1;
    private int jumpH= -24;
    public Player(){
        getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
    public void act()
    {
        move();
        checkFalling();
    }
    private void fall(){
        setLocation(getX(),getY()+vSpeed);
        vSpeed=vSpeed + acceleration;
    }
    public void move(){
        if(Greenfoot.isKeyDown("right")){
            move(8);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-8);
        }
        if(Greenfoot.isKeyDown("space") && onGround()){
            vSpeed = jumpH;
            fall();
        }
    }
    boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    public void checkFalling(){
        if(onGround()==false){
            fall();
        }
        else{
            vSpeed = 0;
        }
    }
}
