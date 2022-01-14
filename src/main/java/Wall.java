public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(Dummy dummy) {
        if(dummy.jump(height)){
            System.out.println(dummy.toString() + " successfully passed the obstacle.");
            return true;
        }
        else {
            System.out.println(dummy.toString() + " couldn't pass the obstacle");
            return false;
        }
    }
}

