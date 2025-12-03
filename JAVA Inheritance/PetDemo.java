public class PetDemo {
    public static void main(String[] args) {
        Dog anjing = new Dog();
        Dog scooby = new Dog("Scooby Doo", "Brown");
        
        Cat doraemon = new Cat();

        anjing.display();
        scooby.display();
        doraemon.display();
        scooby.setNeutered(false);
        System.out.println("Scooby doo neutered status " + scooby.getNeutered());
    }
    
}
