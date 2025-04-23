import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character extends Actor
{
    public void act()
    {
        boolean atTop = true ;
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        if(atTop)
        {
            setLocation(100,300);
        }
        else
        {
            setLocation(100,100);
        }
    }
}
