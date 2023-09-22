public class Inventory {

    private int itemNumber;
    private int quantity;
    private double cost;
    private double totalCost;

    public void Inventory()
    {
        itemNumber = 0;
        quantity = 0;
        cost = 0;
        totalCost = 0;
    }

    public void Inventory(int itN, int q, double c)
    {
        setItemNumber(itN);
        setQuantity(q);
        setCost(c);
        setTotalCost();
    }

    public void setItemNumber(int itN)
    {
         if (itN >= 0)
             itemNumber = itN;
         else
             System.out.println("Item Number: Invalid Input");
    }

    public void setQuantity(int q)
    {
        if (q >= 1)
            quantity = q;
        else
            System.out.println("Quantity: Invalid Input");
    }

    public void setCost(double c)
    {
        if (c >= 1)
            this.cost = c;
        else
            System.out.println("Cost: Invalid Input");
    }

    public void setTotalCost()
    {
        totalCost = this.cost * this.quantity;
    }

    public int getItemNumber()
    {
        return this.itemNumber;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double getCost()
    {
        return this.cost;
    }

    public double getTotalCost()
    {
        return this.totalCost;
    }

    public void displayAll()
    {
        int itn = this.itemNumber;
        int q = this.quantity;
        double c = this.cost;
        double tC = this.totalCost;

        System.out.println("Item Number: "+itn);
        System.out.println("Quantity: "+q);
        System.out.println("Cost: $"+c);
        System.out.println("Total Cost: $"+tC);
    }

}
