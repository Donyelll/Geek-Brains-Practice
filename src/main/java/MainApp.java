public class MainApp {
    public static void main(String[] args) {
        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(200);
        Human human = new Human("Steve");
        Cat cat = new Cat("Bibi");
        Robot robot = new Robot("Hoover-9000");
        Obstacle[] obstacles = new Obstacle[]{wall,treadmill};
        Dummy[] dummies = new Dummy[]{human,cat,robot};
        for(Dummy d: dummies){
            for(Obstacle o: obstacles){
                if(!o.contest(d)) break;
            }
        }

    }
}
