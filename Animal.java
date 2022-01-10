public abstract class Animal {
    protected String name;
    protected int age;
    protected static int count;

    public Animal(){
        name = "Unknown";
        age = 1;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age < 0){
            System.out.println("Incorrect age");
        }
        else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public abstract void swim(int distance);
    public abstract void run(int distance);
}
