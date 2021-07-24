import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Inventory {
    public ArrayList<Item> items = new ArrayList<>();
    public ArrayList<Order> orders = new ArrayList<>();
    String row;
    Object pathToCsv;

    public Inventory() {
    }

    public void readFromCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("inventoryitem.csv"));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            switch (data[0]) {
                case "Cloth":
                    this.items.add(new Cloth(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
                    break;
                case "Cosmetic":
                    this.items.add(new Cosmetic(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
                    break;
                case "Electronic":
                    this.items.add(new Electronic(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
                    break;
                case "Vitamin":
                    this.items.add(new Vitamin(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
                    break;
                case "Whey":
                    this.items.add(new WheyProtein(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
                    break;
            }
            // this.items.add(new Item(data[1], data[0], data));
            // do something with the data;
    }
    csvReader.close();
    }


    public void writeToCSV() throws IOException {
        FileWriter csvWriter = new FileWriter("inventoryitem.csv");
        csvWriter.append("Type");
        csvWriter.append(",");
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Quantity");
        csvWriter.append(",");
        csvWriter.append("Price");
        csvWriter.append("\n");

        for (Item item : this.items) {
            csvWriter.append(item.writetoCSV());
        }
        csvWriter.flush();
        csvWriter.close();

    }

    public void SortItems() throws IOException{
                BufferedReader reader = new BufferedReader(new FileReader("inventoryitem.csv"));
                Map<String, List<String>> map = new TreeMap<String, List<String>>();
                String line = reader.readLine();//read header
                while ((line = reader.readLine()) != null) {
                    String key = getField(line);
                    var l = map.get(key);
                    if (l == null) {
                        l = new LinkedList<String>();
                        map.put(key, l);
                    }
                    l.add(line);
        
                }
                reader.close();
                FileWriter writer = new FileWriter("DataSort.csv");
                writer.write("Type");
                writer.write(",");
                writer.write("Name");
                writer.write(",");
                writer.write("Quantity");
                writer.write(",");
                writer.write("Price");
                writer.write("\n");
                for (List<String> list : map.values()) {
                    for (String val : list) {
                        writer.write(val);
                        writer.write("\n");
                    }
                }
                writer.close();
            }
        
            private static String getField(String line) {
                return line.split(",")[0];// extract value you want to sort on
            }
        

    

    public void addToInventory(Item items) {

        this.items.add(items);
    }

    public String getInventory() {

        return this.items.toString();
    }

    public void addOrders(Order orders) {

        this.orders.add(orders);
    }

    public String getOrders() {

        return orders.toString();
    }

    @Override
    public String toString() {
        return items.toString();
    }

}
