import java.util.ArrayList;
class MuzikKoleksiyonu {
    private ArrayList<sarki> sarkiListesi = new ArrayList<>();

    public void sarkiEkle(sarki sarki) {
        sarkiListesi.add(sarki);
    }

    public void sarkiSil(sarki sarki) {
        sarkiListesi.remove(sarki);
    }

    public ArrayList<sarki> getSarkiListesi() {
        return sarkiListesi;
    }

    public int toplamSure() {
        int toplam = 0;
        for (sarki sarki : sarkiListesi) {
            toplam += sarki.getSure();
        }
        return toplam;
    }
}

