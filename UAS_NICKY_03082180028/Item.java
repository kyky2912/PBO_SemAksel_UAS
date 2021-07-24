/*
Nama: Nicky
Kelas: 18TI2
NIM: 03082180028

Penambahan =
*Tranlasi Inggris -> Bahasa Indonesia
*init data 
*exception

*/

abstract class Item {
    public String name;
    public double price;
    public int quantity;


    public Item() {
    }

    public Item(String name, int qty, double Prc) {
        this.name = name;
        this.quantity = qty;
        this.price = Prc;
    }
    public String Info() {
        return " Name: " + this.name + ", Price: " + this.price + ", Quantity: ";
    }



    public void setQuantity(int qty) {
        this.quantity = qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double prc) {
        this.price = prc;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Type: "+ getType() + " Name: " + name + " Quantity: " + quantity + " Price:" + price+ "\n";
    }

    public String writetoCSV() {
        return getType() + "," + name + ","  + quantity + "," + price + "\n";

    }

    public abstract String getType();
}
