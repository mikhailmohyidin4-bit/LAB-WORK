public class Dog extends Pet {
    private boolean neutered;

    public Dog(){}

    public Dog(String name, String color){
        super(name, color);
    }

    public void setNeutered(boolean n){
        this.neutered = n;
    }

    public boolean getNeutered(){
        return this.neutered;
    }

    public void rollover(){
        System.out.println("I'm rollin dawg");
    };

    public void sound(){
        System.out.println("Gong Gong! Wuff Wuff! ");


    }


}
