public class Cat extends Pet {
    private boolean declawed;

    public Cat(){}

    public Cat(String name, String color){
        super(name, color);
    }

    public void setDeclawed(boolean n){
        this.declawed = n;
    }

    public boolean getDeclawed(){
        return this.declawed;
    }

    public void scratch(){
        System.out.println("I'm scratching");
    };

    public void sound(){
        System.out.println("Meow Meow! Un Grr! ");


    }

}
