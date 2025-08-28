import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends SpaceActors
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hVel = 0;
    int vVel = 0;
    int cooldown = 0;
    int immunity = 0;
    public Ship(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        immunity--;
        cooldown--;
        hitRock();
        turnCmnd();
        accCmnd();
        setLocation(getX()+hVel/3,getY()+vVel/3);
        wrap();
        fire();
    }
    public void turnCmnd(){
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
        }
    }    
    public void accCmnd(){
        if(Greenfoot.isKeyDown("space")){
              if(getRotation() ==0){
                  hVel++;
              }
              if(getRotation() ==180){
                  hVel--;
              }
              if(getRotation() ==90){
                  vVel++;
              }
              if(getRotation() ==270){
                  vVel--;
              }
        }
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
    public void fire(){
        if(Greenfoot.isKeyDown("f") && cooldown<1){
            Ball ball = new Ball();
            getWorld().addObject(ball, getX(), getY());
            ball.setRotation(getRotation());
            cooldown = 20;
        }
    }
    public void hitRock(){
        MyWorld myWorld = (MyWorld)getWorld();
        hBar health = myWorld.getHBar();
        Actor debris = getOneIntersectingObject(Debris.class);
        Actor rocks = getOneIntersectingObject(Rocks.class);
        if(rocks != null && immunity <0){
            health.healthLower();
            immunity = 15;
        }
        if(debris != null &&immunity<0){
            health.healthLower();
            immunity = 15;
        }
    }
}
