public class Cat extends Animal {
    private String color;
    private static int catCount;

    public Cat(){
        super();
        count++;
        catCount++;
    }

    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
        count++;
        catCount++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static int getCount() {
        return catCount;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat " + this.name + " can't swim");
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Incorrect distance");
        }
        else if (distance <= 200){
            System.out.println("Cat " + this.name + " ran " + distance + " meters");
        }
        else if (distance > 200){
            System.out.println("Cat " + this.name + " couldn't run " + distance + " meters");
        }
    }
}



