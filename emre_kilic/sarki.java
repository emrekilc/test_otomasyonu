class sarki {
    private String ad;
    private String sanatci;
    private String album;
    private int sure; // saniye cinsinden süre

    public sarki(String ad, String sanatci, String album, int sure) {
        this.ad = ad;
        this.sanatci = sanatci;
        this.album = album;
        this.sure = sure;
    }

    public String getAd() {
        return ad;
    }

    public String getSanatci() {
        return sanatci;
    }

    public String getAlbum() {
        return album;
    }

    public int getSure() {
        return sure;
    }
    public String toString() {
        return "Şarkı Adı: " + ad + ", Sanatçı: " + sanatci + ", Albüm: " + album + ", Süre: " + sure + " saniye";
    }
}