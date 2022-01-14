public class Robot implements  Dummy {
    private String name;
    private static final int RUN_POTENTIAL = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getRunPotential() {
        return RUN_POTENTIAL;
    }

    public Robot(String name) {
        this.name = name;
    }
    @Override
    public boolean jump(double obstacleSize) {
        System.out.println("Robot " + name + " can't jump.");
        return false;
    }
    @Override
    public boolean run(int obstacleSize) {
        if(obstacleSize > RUN_POTENTIAL){
            System.out.println(name + " couln't run " + obstacleSize + " meters.");
            return false;
        }
        else if (obstacleSize < RUN_POTENTIAL && obstacleSize > 0){
            System.out.println(name + " successfully ran " + obstacleSize + " meters.");
            return true;
        }
        else{
            System.out.println("Incorrect size");
            return false;
        }
    }
    @Override
    public String toString() {
        return this.name;
    }
}