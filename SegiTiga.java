public class SegiTiga extends Geometri{
    private double alas,tinggi,luas, keliling, sisiSatu, sisiDua,sisiMiring, sisi;
    Segitiga segitiga;
    public SegiTiga(){}
    /**
     * 
     * @param s Menentukan bentuk segitiga
     */
    public SegiTiga(Segitiga s){
        this.segitiga = s;
    }

    @Override
    public void hitungKeliling(){
        switch(this.segitiga){
            case SAMAKAKI:
                keliling = this.alas + this.sisiSatu + this.sisiDua;
                break;
            case SAMASISI:
                keliling = this.alas * 3;
                break;
            case SEMBARANG:
                keliling = this.alas + this.sisiSatu + this.sisiDua;
                break;
            case SIKUSIKU:
                keliling = this.alas + this.tinggi + this.sisiMiring;
                break;
            default:
                throw new NullPointerException("[ERROR] Tipe Segitiga Tidak Ditemukan!");
        }
    }

    public void hitungLuas(){
        this.luas = (this.alas * this.tinggi)/2;
    }
    public double getLuas(){
        return this.luas;
    }
    public double getKeliling(){
        return this.keliling;
    }
    public double getAlas(){
        return this.alas;
    }
    public double getTinggi(){
        return this.tinggi;
    }
    public double getSisi(){
        switch(this.segitiga){
            case SAMAKAKI:
                this.sisi = Math.sqrt(Math.pow(this.alas/2,2)+Math.pow(this.tinggi,2));
            case SAMASISI:
                 this.sisi = this.alas;
            case SEMBARANG:
                throw new ArithmeticException("[ERROR] Gunakan getSisiSembarang() untuk mendapatkan panjang sisi segitiga sembarang!");
            case SIKUSIKU:
                this.sisi =  this.sisiMiring;
        }
        return this.sisi;
    }

    public void hitungSisiMiring(){
        if(this.segitiga == Segitiga.SIKUSIKU){
            this.sisiMiring = Math.sqrt(Math.pow(this.alas,2) + Math.pow(this.tinggi,2));
        }else{
            throw new ArithmeticException("[ERROR Bentuk segitiga salah!");
        }
    }

    /**
     * @return Mengembalikan nilai 3 sisi dalam bentuk array mulai dari alas, sisi satu, sisi dua!
     */
    public double[] getSisiSembarang(){
        double[] arr = new double[3];
        arr[0] = this.alas;
        arr[1] = this.sisiSatu;
        arr[2] = this.sisiDua;

        return arr;
    }
    /**
     * 
     * @param a (double) mendefinisikan panjang alas
     */
    public void setAlas(double a){
        this.alas = a;
    }
    /**
     * 
     * @param a (int) mendefiniskan panjang alas
     */
    public void setAlas(int a){
        this.alas = (double) a;
    }
    /**
     * 
     * @param t (double) mendefinisikan tinggi segitiga
     */
    public void setTinggi(double t){
        this.tinggi = t;
    }
    /**
     * 
     * @param t (int) mendefinisikan tinggi segitiga
     */
    public void setTinggi(int t){
        this.tinggi = (double) t;
    }
    /**
     * 
     * @param s (double) menentukan panjang sisi pada segitiga
     */
    public void setSisi(double s){
        this.sisi = s;
        this.sisiDua = s;
        this.sisiSatu = s;
        this.sisiMiring = s;
    }
    /**
     * 
     * @param s (int) menentukan panjang sisi pada segitiga
     */
    public void setSisi(int s){
        this.sisi = (double) s;
        this.sisiDua = (double) s;
        this.sisiSatu = (double) s;
        this.sisiMiring = (double) s;
    }
    /**
     * Hanya untuk segitiga sembarang
     * @param satu mendefinisikan panjang salah satu sisi selain alas
     * @param dua mendefinisikan panjang sisi lainnya selain sisi satu dan alas
     */
    public void setSisi(double satu, double dua){
        this.sisiSatu = satu;
        this.sisiDua = dua;
    }
    /**
     * Hanya untuk segitiga sembarang
     * @param satu mendefinisikan panjang salah satu sisi selain alas
     * @param dua mendefinisikan panjang sisi lainnya selain sisi satu dan alas
     */
    public void setSisi(int satu, int dua){
        this.sisiSatu = (double) satu;
        this.sisiDua = (double) dua;
    }
}