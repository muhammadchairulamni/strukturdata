import java.util.LinkedList;

public class ContohSenarai2 {
    public static void main(String[] args) {
        LinkedList<Simpul> senarai = new LinkedList<Simpul>();Simpul simpul;

        senarai.addFirst(new Simpul("AMN", "Aminudin"));
        senarai.addFirst(new Simpul("ZAS", "Zaskia"));
        senarai.addFirst(new Simpul("RIN", "Rina Melati"));
        senarai.addFirst(new Simpul("FAR", "Farhan"));
        senarai.addFirst(new Simpul("AGN", "Agnes Monica"));
        System.out.println("Keadaan awal:");

        for (int i=0; i < senarai.size(); i++) {
            simpul = senarai.get(i);
            simpul.display();

        }

        hapus(senarai, "RIN");
        System.out.println();
        System.out.println("Setelah RIN dihapus:");
        for (int i=0; i < senarai.size(); i++) {
            simpul = senarai.get(i);
            simpul.display();

        }

        String dicari = "RIN";
        System.out.println();
        System.out.println("Pencarian " + dicari);
        Simpul posisiData = cari(senarai, dicari);
        if (posisiData == null)
        System.out.println(dicari + " tidak ditemukan.");
        else {
            System.out.println("Hasil pencarian:");
            posisiData.display();

        }

        dicari = "FAR";
        System.out.println();
        System.out.println("Pencarian " + dicari);
        posisiData = cari(senarai, dicari);
        if (posisiData == null)
        System.out.println(dicari + " tidak ditemukan.");
        else {
            System.out.println("Hasil pencarian:");
            posisiData.display();

        }

    }

    public static void hapus(LinkedList<Simpul> senarai,
    String x) {
int posisi = -1;
for (int i = 0; i < senarai.size(); i++) {
Simpul simpul = senarai.get(i);
if (simpul.kode.compareTo(x) == 0) {
posisi = i;
break;
}
}
if (posisi != -1)
senarai.remove(posisi);
else
System.out.println(x + " tidak dapat dihapus.");
}

public static Simpul cari(LinkedList<Simpul> senarai,
String x) {
    int posisi = -1;
    for (int i = 0; i < senarai.size(); i++) {
        Simpul simpul = senarai.get(i);
        if (simpul.kode.compareTo(x) == 0) {
            posisi = i;
            break;

        }

    }

    if (posisi == -1)
    return null;
    else
    return senarai.get(posisi);

}

}

class Simpul {
    public String kode;
    public String nama;
    public Simpul(String xkode, String xnama) {
        kode = xkode;
        nama = xnama;

    }

    void display() {

    }
} 
