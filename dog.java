public class dog {
    protected static int count = 0;
    public String name;
    public int age;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
        dog.count += 1;
        dog.display();
    }

    public static void display() {
        System.out.println("I am a dog!");
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int add2() {
        return this.age + 2;
    }
}
