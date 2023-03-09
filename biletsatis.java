public class biletsatis {
    //bilet satis
    //biletsatis
    //biletiptal
    private  int seferno;
    private String firma;
    private String plaka;
    private String aracmarka;
    private int  arac_kapasite;
    private String yolcu_tc;
    private String  yolcu_adsoyad;
    private int koltuk_sayisi;
    private boolean  ekbagaj;
    private int  ekbagaj_sayisi;
    private double bilet_fiyatı;

    biletsatis()
    {
       seferno=01;
       firma="adana turizm";
       plaka="jk0022";
       aracmarka="mercedes";
       arac_kapasite=24;
       yolcu_tc="432523532523";
       yolcu_adsoyad="yaşar görmez";
       koltuk_sayisi=1;
       ekbagaj=true;
       ekbagaj_sayisi=5;
       bilet_fiyatı=100;

    }

public void biletsat()
{
    System.out.println("----------------------------");
    System.out.println("bilet satışı yapılıyor...");
    double islem_tutari;
    if (aracdurumkntrolonay(koltuk_sayisi))
    {
        islem_tutari=fiyathesapla(koltuk_sayisi,bilet_fiyatı,ekbagaj,ekbagaj_sayisi);
        int guncel_kapasite=   kapasitegüncelle(arac_kapasite,koltuk_sayisi);
        islemozet("bilet satışı yapıldı",seferno,firma,plaka,aracmarka,yolcu_tc,yolcu_adsoyad,koltuk_sayisi,ekbagaj,ekbagaj_sayisi,islem_tutari);
    }
    else {
        System.out.println("bilet satışı koltuk sayısı eksik olduğundan yapılamadı.");
    }

}
private int  kapasitegüncelle(int kapasite,int koltuksayi){
        kapasite=kapasite-koltuksayi;
        return kapasite;
}
private double fiyathesapla(int koltuksayisi,double bilettutar,boolean ekbagajj,int ekbagajsayi){
        double toplamücret;
        if (ekbagajj){
            toplamücret=koltuksayisi*bilettutar+ekbagajsayi*50;
        }
        else {
            toplamücret=koltuksayisi*bilettutar;
        }
        return toplamücret;
}
private  boolean aracdurumkntrolonay(int koltuksayisi) {
    boolean onay=false;
    if (arac_kapasite>koltuksayisi)
    {
onay=true;
    }
    return onay;
}
public void seferozet() {
        System.out.println("        sefer bilgileri");
        System.out.println("----------------------------");

        System.out.println("sefer no: "+seferno);
        System.out.println("firma bilgisi: "+firma);
        System.out.println("aracın markası: "+aracmarka);
        System.out.println("araç plakası: "+plaka);
        System.out.println("araç kapasitesi: "+arac_kapasite);
        System.out.println("----------------------------");

    }
    public void islemozet(String mesaj,int seferno,String firma,String  plaka,String marka,String tc,String adsoyad,int koltuk,boolean ekbagaj,int ekbagajsayisi,double islemtotal) {
        System.out.println("        islem özeti");
        System.out.println("----------------------------");
        System.out.println(mesaj);
        System.out.println("sefer no: "+seferno);
        System.out.println("firma bilgisi: "+firma);
     System.out.println("araç plakası: "+plaka);
        System.out.println("aracın markası: "+marka);
        System.out.println("yolcu tc :"+tc);
        System.out.println("yolcu ad soyad: "+adsoyad);
        System.out.println("ekbagaj: "+ekbagaj);
        System.out.println("Ek bagaj sayisi: "+ekbagajsayisi);
        System.out.println("Kesilen bilet sayısı: "+koltuk);
        System.out.println("İşlem tutarı: "+islemtotal);
        System.out.println("----------------------------");

    }

}
