public class Cat implements Dummy {
    private String name;
    private static final int JUMP_POTENTIAL = 3;
    private static final int RUN_POTENTIAL = 500;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getJumpPotential() {
        return JUMP_POTENTIAL;
    }

    public static int getRunPotential() {
        return RUN_POTENTIAL;
    }

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public boolean jump(double obstacleSize) {
        if(obstacleSize > JUMP_POTENTIAL){
            System.out.println(name + " couln't jump over the " + obstacleSize + " meters obstacle.");
            return false;
        }
        else if (obstacleSize < JUMP_POTENTIAL && obstacleSize > 0){
            System.out.println(name + " successfully jumped over the " + obstacleSize + " meters obstacle.");
            return true;
        }
        else{
            System.out.println("Incorrect size");
            return false;
        }
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