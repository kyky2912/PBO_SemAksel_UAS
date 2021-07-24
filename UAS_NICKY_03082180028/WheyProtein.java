import java.lang.ProcessBuilder.Redirect.Type;

// New Subclass Whey

public class WheyProtein extends Item{
    String WheyType;

    public WheyProtein(String name, int qty, double Prc) {
        super(name, qty, Prc);
    }

    @Override
    public String getType() {
        return "Whey";
    }

    // Overloading
    // set default to 'Isolate' kalau data pada colom type .csv kosong
    // Tidak berjalan untuk sementara karena diperlukan tambahan columns data pada .csv || NULL
    public void setWheyType() {
        this.WheyType = "Isolate";
    }

    public void setWheyType(String type) {
        this.WheyType = type;
    }

    @Override
    public String toString() {
        return "Type: "+ getType() + " Name: " + name + " Tipe Whey Protein: " + WheyType + " Quantity: " + quantity + " Price: " + price+"\n";
    }
}
