public class Cat extends Animal {

    public Cat(String name, String type) {
        super(name, type);
    }

    @Override

    public String getName(){
        return name;
    }

    public String getType() {
        return "Cat";
    }

    public void start(){
        System.out.println("Cat starts!");
    }
    public void stop(){
        System.out.println("Cat stopped!");
    }

}
