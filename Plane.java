import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-15);
        if(getX()<= 0)
        {
            resetPlane();
        }
        if(isTouching(TwinTower.class))
        {
            GameOver dead = new GameOver();
            getWorld().addObject(dead, 850, 500);
            getWorld().removeObject(this);
        }
    }
    public void resetPlane()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(1500,100);
        }
        else
        {
            setLocation(1500,800);
        }
    }
}
