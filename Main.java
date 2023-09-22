public class Main {

    public static void main(String[] args) {

        Inventory item1 = new Inventory();//object initialization
        item1.Inventory(1, 2, 5);//inputted data into object "item1"

        System.out.println("Item Number: "+item1.getItemNumber()); //displayed the data from the object with my returning methods
        System.out.println("Quantity: "+item1.getQuantity());
        System.out.println("Cost: $"+item1.getCost());
        System.out.println("Total Cost: $"+item1.getTotalCost()+"\n");

        Inventory item2 = new Inventory();//initialized another object "item2"
        item2.setItemNumber(2);//simply another way to input data, either directly into the Inventory data type or manual set methods
        item2.setQuantity(5);
        item2.setCost(15);
        item2.setTotalCost();

        item2.displayAll();//made my own display all method to make it a little simpler to display everything

    }
}