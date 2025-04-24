import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1800, 1000, 1);
        

        TwinTower object1 = new TwinTower();
        addObject(object1 , 100, 100);
        
        Plane plane = new Plane();
        addObject(plane, 1600, 100);

    }
}
