public class SegiEmpat extends Geometri{
    private double luas,keliling,sisi,panjang,lebar;


    public void hitungKeliling(){
        this.keliling = 2 * (this.panjang + this.lebar);
    }


    public void hitungLuas(){
        this.luas = this.panjang * this.lebar;
    }
    /**
     * 
     * @param p Panjang Segi Empat
     */
    public void setPanjang(double p){
        this.panjang = p;
    }
    /**
     * 
     * @param p Panjang Segi Empat
     */
    public void setPanjang(int p){
        this.panjang = (double) p;
    }
    /**
     * 
     * @param l Lebar Segi Empat
     */
    public void setLebar(double l){
        this.lebar = l;
    }
    /**
     * 
     * @param l Lebar Segi Empat
     */
    public void setLebar(int l){
        this.lebar = (double) l;
    }
    /**
     * 
     * @param s Panjang Sisi Segi Empat
     */
    public void setSisi(double s){
        this.panjang = s;
        this.lebar = s;
        this.sisi = s;
    }
     /**
     * 
     * @param s Panjang Sisi Segi Empat
     */
    public void setSisi(int s){
        this.panjang = (double) s;
        this.lebar = (double) s;
        this.sisi = (double) s;
    }
    /**
     * 
     * @return Panjang segi empat
     */
    public double getPanjang(){
        return this.panjang;
    }
    /**
     * 
     * @return Lebar Segi Empat
     */
    public double getLebar(){
        return this.lebar;
    }
    /**
     * 
     * @return Panjang Sisi Segi Empat
     */
    public double getSisi(){
        return this.sisi;
    }
    /**
     * 
     * @return Keliling Segi Empat
     */
    public double getKeliling(){
        return this.keliling;
    }
    /**
     * 
     * @return Luas Segi Empat
     */
    public double getLuas(){
        return this.luas;
    }
}