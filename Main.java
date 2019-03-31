
public class Main{
public static void main(String[] args) {
    Geometri geoSegitiga, geoSegiEmpat,geoLingkaran;
    
    SegiTiga st = new SegiTiga(Segitiga.SIKUSIKU);
    st.setAlas(25);
    st.setTinggi(10);
    st.hitungSisiMiring();
    //polymorphism
    geoSegitiga = st;
    geoSegitiga.hitungLuas();    
    geoSegitiga.hitungKeliling();    

    System.out.println("===================================");
    System.out.println("Luas Segitiga = "  + st.getLuas());
    System.out.println("Keliling Segitiga = "  + st.getKeliling());
    System.out.println("Panjang Alas Segitiga = "  + st.getAlas());
    System.out.println("Tinggi Segitiga = "  + st.getTinggi());
    System.out.println("Panjang Sisi Miring Segitiga = "  + st.getSisi());
    System.out.println();

    SegiEmpat se = new SegiEmpat();
    se.setSisi(25);
    //polymorphism
    geoSegiEmpat = se;
    geoSegiEmpat.hitungLuas();
    geoSegiEmpat.hitungKeliling();
    
    System.out.println("===================================");
    System.out.println("Luas Segi Empat = " + se.getLuas());
    System.out.println("Keliling Segi Empat = " + se.getKeliling());
    System.out.println("Panjang Sisi = " + se.getSisi());
    System.out.println();

    Lingkaran lingkaran  = new Lingkaran();
    lingkaran.setJariJari(10);
    //polymorphism
    geoLingkaran = lingkaran;
    geoLingkaran.hitungKeliling();
    geoLingkaran.hitungLuas();
    
    System.out.println("===================================");
    System.out.println("Luas Lingkaran = " + lingkaran.getLuas());
    System.out.println("Keliling Lingkaran = " + lingkaran.getKeliling());
    System.out.println("Panjang Jari-Jari = " + lingkaran.getJariJari());
    System.out.println();

}}