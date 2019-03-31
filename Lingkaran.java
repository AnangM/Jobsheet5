public class Lingkaran extends Geometri{
    private double jariJari,keliling,luas;

    public void hitungKeliling(){
        this.keliling = 2 * Math.PI * this.jariJari;
    }

    public void hitungLuas(){
        this.luas = Math.PI * Math.pow(jariJari,2);
    }
    /**
     * 
     * @param r Panjang Jari-jari Lingkaran
     */
    public void setJariJari(double r){
        this.jariJari = r;
    }
    /**
     * 
     * @param r Panjang Jari-jari Lingkaran
     */
    public void setJariJari(int r){
        this.jariJari = (double) r;
    }
    /**
     * 
     * @return Panjang Jari Jari Lingkaran
     */
    public double getJariJari(){
        return this.jariJari;
    }
    /**
     * 
     * @return Keliling Lingkaran
     */
    public double getKeliling(){
        return this.keliling;
    }
    /**
     * 
     * @return Luas Lingkaran
     */
    public double getLuas(){
        return this.luas;
    }
}