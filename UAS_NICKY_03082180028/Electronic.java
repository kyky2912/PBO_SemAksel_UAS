/*
Nama: Nicky
Kelas: 18TI2
NIM: 03082180028

Penambahan =
*Tranlasi Inggris -> Bahasa Indonesia
*init data 
*exception

*/

public class Electronic extends Item {
    public Electronic(String name, int qty, double Prc) {
        super(name, qty, Prc);
    }

    @Override
    public String getType() {
        return "Electronic";
    }
}
