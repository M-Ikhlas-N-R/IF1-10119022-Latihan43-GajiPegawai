package com.minr;

public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport,uangTunjangan, gajiPokok, totalGaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }

    public void tampilData(String nama, String alamat, int uangTunjangan,int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.printf("Nama Karyawan : %s\n", nama);
        System.out.printf("Alamat : %s\n", alamat);
        System.out.printf("Uang Transport : Rp. %d\n", uangTransport);
        System.out.printf("Uang Tunjangan : Rp. %d\n", uangTunjangan);
        System.out.printf("Gaji Pokok : Rp. %d\n", gajiPokok);
        System.out.printf("TOTAL GAJI : Rp. %d\n", totalGaji);
    }

}
