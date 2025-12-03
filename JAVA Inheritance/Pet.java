public abstract class Pet{
    private String name;
    private String color;

    public Pet(){}

    public Pet(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public void eat(){};

    public void display(){
        System.out.println("Pet Name: " + this.name);
        System.out.println("Pet Color: " + this.color);
    }

    public abstract void sound();
}