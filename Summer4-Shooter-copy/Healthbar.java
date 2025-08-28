import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healthbar extends Actor
{
    /**
     * Act - do whatever the Healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int pHealth = 20;
    int barWidth=80;
    int barHeight=20;
    int pixelsPerPoint= (int)barWidth/pHealth;
    public Healthbar(){
        
    }
    public void act()
    {
        update();
    }
    public void update(){
        setImage(new GreenfootImage(barWidth+2, barHeight+2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, barWidth + 1, barHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, pHealth*pixelsPerPoint, barWidth);
        if(pHealth <= 0){
            getWorld().addObject(new YouLose(), 300, 300);
            Greenfoot.stop();
        }
    }
    public void loseHealth(){
        pHealth--;
    }
}
