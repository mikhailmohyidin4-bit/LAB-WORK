public class Clothing {

    // variables
    private String itemCode;
    private String description;
    private String color;
    private String material;
    private double unitPrice;
    private int quantityInStock;
    private boolean replenishStock;

    // constructors
    public Clothing(){
        System.out.println("inside Clothing no-arg constructor");
    }
    public Clothing(String itemCode, String description, String color, String material, double unitPrice, int quantityInStock, boolean replenishStock){
        this.itemCode=itemCode;
        this.description=description;
        this.color=color;
        this.material=material;
        this.unitPrice=unitPrice;
        this.quantityInStock=quantityInStock;
        this.replenishStock=replenishStock;
    }

    // getters
    public String getItemCode(){
        return itemCode;
    }

    public String getDescription(){
        return description;
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public double getUnitPrice(){
        return  unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public boolean isReplenishStock() {
        return replenishStock;
    }

    // setters
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setReplenishStock(boolean replenishStock) {
        this.replenishStock = replenishStock;
    }

    // displayDetails()
    public void displayDetails(){
        System.out.println("Item code   : " + getItemCode());
        System.out.println("Description : " + getDescription());
        System.out.println("Color       : " + getColor());
        System.out.println("Unit price  : " + getUnitPrice());
        System.out.println("Quantity in stock : " + getQuantityInStock());
        System.out.println("Replenish stock   : " + isReplenishStock());
    }//displayDetails()

}//class