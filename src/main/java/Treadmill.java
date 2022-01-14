public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Dummy dummy) {
        if(dummy.run(length)){
            System.out.println(dummy.toString() + " successfully passed the obstacle.");
            return true;
        }
        else {
            System.out.println(dummy.toString() + " couldn't pass the obstacle");
            return false;
        }
    }
}
