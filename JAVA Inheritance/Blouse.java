public class Blouse extends Clothing{

    // variables
    private String size;
    private char sleeveType;
    private String fabric;
    private String pattern;

    // constructors
    public Blouse(){}
    public Blouse (String itemCode, String description, String color, String material, double unitPrice, int quantityInStock, boolean replenishStock,
                    String size, char sleeveType, String fabric, String pattern){
        super(itemCode, description,  color, material, unitPrice, quantityInStock, replenishStock);
        this.size = size;
        this.sleeveType = sleeveType;
        this.fabric = fabric;
        this.pattern = pattern;
    } 

    // displayBlouse()
    public void displayBlouse(){
        super.displayDetails();
        System.out.println("Size        : " + this.size);
        System.out.println("Sleeve Type : " + this.sleeveType);
        System.out.println("Fabric      : " + this.fabric);
        System.out.println("Pattern     : " + this.pattern);
    } 

}//class
