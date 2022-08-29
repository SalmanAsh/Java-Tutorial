public class Cat extends dog {
    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food = 50;
    }

    public Cat(String name) {
        super(name, 0);
        this.food = 50;
    }

    public void speak() {
        System.out.println("I am " + this.name + ", I am " + this.age + " years old" + " and I eat " + this.food
                + "g of food a day.");
    }

    public void eat(int x) {
        this.food -= x;
    }

}
