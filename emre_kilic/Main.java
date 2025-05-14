// Emre KILIÇ 170423512
public class Main {
    public static void main(String[] args) {
        sarki sarki1 = new sarki("Karma", "Taylor swift", "midnights", 237);
        sarki sarki2 = new sarki("Lover", "Taylor swift", "lover", 225);
        sarki sarki3 = new sarki("Agora hills", "Doja Cat", "Demons", 230);

        sarki sarki4 = new sarki("Şu an","alizade","latin virgin",231);
        kullanici kullanici = new kullanici("Kullanıcı Adı", "Soyadı");
        kullanici.sarkiEkle(sarki1);
        kullanici.sarkiEkle(sarki2);
        kullanici.sarkiEkle(sarki3);
        kullanici.sarkiEkle(sarki4);

        kullanici.sarkilariListele();
        kullanici.sarkiAra("Şarkı 2");
        kullanici.sarkiAra("Şu an");
        kullanici.sarkiAra("Taylor swift");
        kullanici.sarkiSil(sarki2);
        System.out.print("yeni liste\n");
        kullanici.sarkilariListele();
    }
}