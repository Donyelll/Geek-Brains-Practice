public class Dog extends Animal {
    private String color;
    private static int dogCount;


    public Dog(){
        super();
        count++;
        dogCount++;
    }

    public Dog(String name, int age, String color){
        super(name, age);
        this.color = color;
        count++;
        dogCount++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

//    public int getCount() {
//        return this.count;
//    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Incorrect distance");
        }
        else if (distance <= 10){
            System.out.println("Dog " + this.name + " swam " + distance + " meters");
        }
        else if (distance > 10){
            System.out.println("Dog " + this.name + " couldn't swim " + distance + " meters");
        }
    }

    public static int getCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Incorrect distance");
        }
        else if (distance <= 500){
            System.out.println("Dog " + this.name + " ran " + distance + " meters");
        }
        else if (distance > 500){
            System.out.println("Do " + this.name + " couldn't run " + distance + " meters");
        }
    }
}


