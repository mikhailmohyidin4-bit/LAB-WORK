public class Pants extends Clothing {
    private String size;
    private String fabric;
    private char gender;
    private String cutting;

    public Pants(){}

    public Pants(String itemCode, String description, String color, String material, double unitPrice, int quantityInStock, boolean replenishStock,
                 String size, String fabric, char gender, String cutting){
        super(itemCode, description,  color, material, unitPrice, quantityInStock, replenishStock);
        this.size = size;
        this.fabric = fabric;
        this.gender = gender;
        this.cutting = cutting;
    }

    public void displayPants(){
        super.displayDetails();
        System.out.println("Size        : " + this.size);
        System.out.println("Fabric      : " + this.fabric);
        System.out.println("Gender      : " + this.gender);
        System.out.println("Cutting     : " + this.cutting);

    }

    

    
}
