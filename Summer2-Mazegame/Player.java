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
    int speed = 3;
    public Player()
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void act()
    {
        move();
        hitFood();
        hitTelepoter();
        youWin();
        youLose();
    }
    public void move(){
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed, getY());
            if(hitWall()){
                setLocation(getX()-speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed, getY());
            if(hitWall()){
                setLocation(getX()+speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-speed);
            if(hitWall()){
                setLocation(getX(), getY()+speed);
            }
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+speed);
            if(hitWall()){
                setLocation(getX(), getY()-speed);
            }
        }
    }
    public boolean hitWall(){
        if (isTouching(Walls.class)){
            return(true);
        }
        return(false);
    }
    public void hitFood(){
        if(getOneIntersectingObject(Food.class)!=null){
            speed++;
            getWorld().removeObject(getOneIntersectingObject(Food.class));
        }
    }
    public void hitTelepoter(){
        if(isTouching(Teleporter.class)){
            setLocation(28,219);
        }
    }
    public boolean hitEnemy(){
        if(isTouching(Enemy.class) || isTouching(EnemyTwo.class)){
            return(true);
        }
        return(false);
    }
    public void youLose(){
        if(hitEnemy()){
            getWorld().addObject(new YouLose(), 200, 200);
            Greenfoot.stop();
        }
    }
    public void youWin(){
        if(isTouching(Goal.class) && speed>= 5){
            getWorld().addObject(new YouWin(), 200, 200);
            Greenfoot.stop();
        }
    }
        
}
