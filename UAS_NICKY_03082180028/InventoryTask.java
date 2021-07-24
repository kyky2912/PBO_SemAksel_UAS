import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Nama: Nicky
Kelas: 18TI2
NIM: 03082180028

Penambahan 1=
*Tranlasi Inggris -> Bahasa Indonesia
*init data 
*exception

Penambahan UAS=
*Subclass Vitamin, Whey Protein
*Overloading pada Subclass Vitamin, Whey Protein
*Read and Write Data pada file .csv
*Data Validation (Exception Handling)
*Penambahan Fitur Menu 
*Melakukan Sort pada Tipe Data Inventory A-Z (Baju, Kosmetik, ELectronic, Vitamin, Whey)

*/


//Main Task
public class InventoryTask {

    public static void MainMenuDisplay() {
        System.out.println("------------------------------------------");
        System.out.println("-------Selamat Datang di GrabMartKW-------");
        System.out.println("------------------------------------------");
        System.out.println("Seluruh Harga yang tertera dalam Kurs Euro");
        System.out.println("------------------------------------------");
        System.out.println("Layanan yang disediakan:");
        System.out.println("1.Tambah Barang (Besifat Case Sensitif mohon perhatikan spasi dalam penamaan !)" + "\n" + "2.Tambah Order" + "\n" + "3.Tampilkan Barang" + "\n"
                + "4.Tampilkan Order" + "\n" + "5.Tampilkan Seluruh Data" + "\n" + "6.Save Data (Untuk melakukan save data lebih baik ditambah dengan barang terlebih dahulu !)" 
                + "\n" + "7.Sort Tipe Inventory (A-Z)"
                + "\n" + "8.Keluar");
    }

    //Menampilkan inventory
    public static void displayINV() {
        System.out.println("Tambahkan item: " + "\n" + "1.Baju" + "\n" + "2.Kosmetik" + "\n" + "3.Alat Elektronik"
                + "\n" + "4.Vitamin" + "\n" + "5.Whey Protein");
    }

    public static void displayAddInv() {
        System.out.println("Add to your cart" + "\n" + "[");

    }

    public static void main(String[] args) throws IOException {
        Inventory inv = new Inventory();
        inv.readFromCSV();
        // String product;
        // int qtty;
        // double pricee;
        // Item initclothes = new Cloth("Adidas", 78, 70);
        // Item initclothes1 = new Cloth("ADLV", 37, 114);
        // Item initclothes2 = new Cloth("Armani Exchange", 50, 169);
        // Item initclothes3 = new Cloth("BLVG", 32, 179);
        // Item initclothes4 = new Cloth("Burberry", 19, 300);
        // Item initcosmetic = new Cosmetic("A'pieu", 25, 135);
        // Item initcosmetic1 = new Cosmetic("Clinique", 65, 78);
        // Item initcosmetic2 = new Cosmetic("Estee Lauder", 45, 55);
        // Item initcosmetic3 = new Cosmetic("Nivea", 44, 39);
        // Item initcosmetic4 = new Cosmetic("Loreal", 3, 70);
        // Item initelectronic = new Electronic("Apple", 124, 699);
        // Item initelectronic1 = new Electronic("Huawei", 82, 469);
        // Item initelectronic2 = new Electronic("Toshiba", 65, 159);
        // Item initelectronic3 = new Electronic("Samsung", 84, 559);
        // Item initelectronic4 = new Electronic("Xiaomi", 13, 390);
        // Item initvitamin = new Vitamin("Amway", 124, 699);
        // ((Vitamin) initvitamin).setVitaminType("A");
        // Item initvitamin1 = new Vitamin("XXX", 82, 469);
        // ((Vitamin) initvitamin1).setVitaminType();
        // Item initvitamin2 = new Vitamin("XXX", 65, 159);
        // ((Vitamin) initvitamin2).setVitaminType("C");
        // Item initvitamin3 = new Vitamin("XXX", 84, 559);
        // ((Vitamin) initvitamin3).setVitaminType("E");
        // Item initvitamin4 = new Vitamin("XXX", 13, 390);
        // ((Vitamin) initvitamin4).setVitaminType("D");
        // inv.addToInventory(initclothes);
        // inv.addToInventory(initclothes1);
        // inv.addToInventory(initclothes2);
        // inv.addToInventory(initclothes3);
        // inv.addToInventory(initclothes4);
        // inv.addToInventory(initcosmetic);
        // inv.addToInventory(initcosmetic1);
        // inv.addToInventory(initcosmetic2);
        // inv.addToInventory(initcosmetic3);
        // inv.addToInventory(initcosmetic4);
        // inv.addToInventory(initelectronic);
        // inv.addToInventory(initelectronic1);
        // inv.addToInventory(initelectronic2);
        // inv.addToInventory(initelectronic3);
        // inv.addToInventory(initelectronic4);
        // inv.addToInventory(initvitamin);
        // inv.addToInventory(initvitamin1);
        // inv.addToInventory(initvitamin2);
        // inv.addToInventory(initvitamin3);
        // inv.addToInventory(initvitamin4);

        //Exception Handling
        while (true) {
            try {
                MainMenuDisplay();
                Scanner input = new Scanner(System.in);
                int mainmenu = input.nextInt();
                switch (mainmenu) {
                    case 1:
                        displayINV();
                        int anyInput = input.nextInt();
                        switch (anyInput) {
                            case 1:
                                System.out.println("---Baju---");
                                System.out.print("Masukkan Nama: ");
                                String name = input.next();
                                input.hasNextLine();
                                System.out.print("Masukkan Kuantitas: ");
                                int qty = input.nextInt();
                                System.out.print("Masukkan Harga per Unit: ");
                                double price = input.nextDouble();
                                Item clothes = new Cloth(name, qty, price);
                                inv.addToInventory(clothes);
                                break;
                            case 2:
                                System.out.println("---Kosmetik---");
                                System.out.print("Masukkan Nama: ");
                                String name2 = input.next();
                                input.hasNextLine();
                                System.out.print("Masukkan Kuantitas: ");
                                int qty2 = input.nextInt();
                                System.out.print("Masukkan Harga per Unit: ");
                                double price2 = input.nextDouble();
                                Item cosmetic = new Cosmetic(name2, qty2, price2);
                                inv.addToInventory(cosmetic);
                                break;
                            case 3:
                                System.out.println("---Alat Elektronik---");
                                System.out.print("Masukkan Nama: ");
                                String name3 = input.next();
                                input.hasNextLine();
                                System.out.print("Masukkan Kuantitas: ");
                                int qty3 = input.nextInt();
                                System.out.print("Masukkan Harga per Unit: ");
                                double price3 = input.nextDouble();
                                Item electonic = new Electronic(name3, qty3, price3);
                                inv.addToInventory(electonic);
                                break;
                            case 4:
                                System.out.println("---Vitamin---");
                                System.out.print("Masukkan Nama: ");
                                String name4 = input.next();
                                input.hasNextLine();
                                System.out.print("Masukkan Kuantitas: ");
                                int qty4 = input.nextInt();
                                System.out.print("Masukkan Harga per Unit: ");
                                double price4 = input.nextDouble();
                                Item vitamin = new Vitamin(name4, qty4, price4);
                                inv.addToInventory(vitamin);
                                break;
                            case 5:
                                System.out.println("---Whey Protein---");
                                System.out.print("Masukkan Kuantitas: ");
                                String name5 = input.next();
                                input.hasNextLine();
                                System.out.print("Enter quantity: ");
                                int qty5 = input.nextInt();
                                System.out.print("Masukkan Harga per Unit: ");
                                double price5 = input.nextDouble();
                                Item whey = new WheyProtein(name5, qty5, price5);
                                inv.addToInventory(whey);
                                break;
                        }
                        break;
                    case 2:
                        Order order = new Order();
                        System.out.println("Jenis barang apa yang ingin anda ubah? ");
                        System.out.println(inv.items.toString());
                        boolean bool = true;
                        while (bool) {
                            input.nextLine();
                            System.out.println("Masukkan Nama: ");
                            String name = input.nextLine();
                            boolean Boolean = true;
                            for (int s = 0; s < inv.items.size(); s++) {
                                if (inv.items.get(s).name.equalsIgnoreCase(name)) {
                                    Boolean = false;
                                    System.out.println("Masukkan Kuantitas: ");
                                    order.addItem(inv.items.get(s), input.nextInt());
                                    break;
                                }
                            }
                            if (Boolean)
                                System.out.println("Item terkait tidak tersedia");
                            System.out.println("Input angka 1 untuk melakukan perubahan lainnya \nInput angka 2 untuk menyelesaikan perubahan");
                            if (input.nextInt() == 2) {
                                System.out.println("Order Ditambahkan");
                                System.out.println(order.toString());
                                bool = false;
                            }
                        }
                        inv.addOrders(order);

                        break;
                    case 3:
                        System.out.println(inv.getInventory());
                        break;
                    case 4:
                        System.out.println(inv.orders.toString());
                        break;
                    case 5:
                        System.out.println("----------------------------INVENTORY---------------------------- \n");
                        System.out.println(inv.toString());
                        System.out.println("\n----------------------------ORDERS----------------------------\n");
                        System.out.println(inv.orders.toString());
                        break;

                    case 6:
                        inv.writeToCSV();
                        System.out.println("Data tersimpan dengan format 'inventoryitem.csv' !");
                        break;
                    case 7:
                        inv.SortItems();
                        System.out.println("Data telah disimpan dengan format 'DataSort.csv' !");
                        break;
                    case 8:
                        System.out.println("Terima Kasih telah menggunakan aplikasi GrabMart KW !" 
                        + "\n" + "Semoga aplikasi ini bermanfaat untuk Usaha Mikro di Indonesia"+ "\n" + "Sampai Jumpa");
                        System.exit(0);
                    
                }
            //Data Validation
            } catch (InputMismatchException e) {
                System.out.println("Salah Input T_T");
            } catch (Exception e) {
                System.out.println("Ada sesuatu yang Salah!!! (TT.TT)");
            }
        }

    }
}