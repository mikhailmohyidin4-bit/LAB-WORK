public class ClothingDemo {

    public static void main(String[] args){

        Blouse blouse1 = new Blouse("BL3402", "Layla Muslimah Front Zippered", "Light blue", "Cotton Laici", 34.85, 30, true, "M", 'L', "Cotton", "Front Zippered" );
        Pants pants1 = new Pants("P3402", "Seluar Khas BayuWangi", "Light blue", "Cotton Laici", 34.85, 30, true, "M", "Cotton", 'F', "Baggy");
        blouse1.displayBlouse();
        System.out.println("------------------------------------");
        pants1.displayPants();


    }//main
}//class
