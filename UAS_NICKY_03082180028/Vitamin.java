import java.lang.ProcessBuilder.Redirect.Type;

// New Subclass Vitamins

public class Vitamin extends Item {
    String vitaminType;

    public Vitamin(String name, int qty, double Prc) {
        super(name, qty, Prc);
    }

    @Override
    public String getType() {
        return "Vitamin";
    }

    // Overloading
    // set default to 'Isolate' kalau data pada colom type .csv kosong
    // Tidak berjalan untuk sementara karena diperlukan tambahan columns data pada .csv || NULL
    public void setVitaminType() {
        this.vitaminType = "A";
    }

    public void setVitaminType(String type) {
        this.vitaminType = type;
    }

    @Override
    public String toString() {
        return "Type: "+ getType() + " Name: " + name + " Tipe Vitamin: " + vitaminType + " Quantity: " + quantity + " Price: " + price+"\n";
    }
}
