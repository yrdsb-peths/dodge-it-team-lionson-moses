import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 600, 1);
        
        Character man = new Character();
        addObject(man , 100, 100);
    }
}
