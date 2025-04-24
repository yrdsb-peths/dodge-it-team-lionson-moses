import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1800, 1000, 1);
        

        Flower object1 = new Flower();
        addObject(object1 , 100, 100);
        
        Bullet hit = new Bullet();
        addObject(hit, 1600, 100);
        
    }
}
