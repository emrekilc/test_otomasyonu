import java.util.ArrayList;
public class kullanici {
    private String kullaniciAdi;
    private String soyadi;
    public MuzikKoleksiyonu koleksiyon;

    public kullanici(String kullaniciAdi, String soyadi) {
        this.kullaniciAdi = kullaniciAdi;
        this.soyadi = soyadi;
        koleksiyon = new MuzikKoleksiyonu();
    }
    public void sarkiEkle(sarki sarki) {
        koleksiyon.sarkiEkle(sarki);
    }

    public void sarkilariListele() {
        ArrayList<sarki> sarkiListesi = koleksiyon.getSarkiListesi();
        for (sarki sarki : sarkiListesi) {
            System.out.println(sarki);
        }
    }

    public void sarkiAra(String Ad) {
        ArrayList<sarki> sarkiListesi = koleksiyon.getSarkiListesi();
        for (sarki sarki : sarkiListesi) {
            if (sarki.getAd().equalsIgnoreCase(Ad)) {
                System.out.println("Şarkı bulundu: " + sarki);
                return;
            }
        }
        System.out.println("Şarkı bulunamadı.");
    }

    public void sarkiSil(sarki sarki) {
        koleksiyon.sarkiSil(sarki);
        System.out.println("Şarkı silindi:" + sarki );
    }
}
