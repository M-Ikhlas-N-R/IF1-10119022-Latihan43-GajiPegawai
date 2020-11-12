package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : program untuk mengetahui banyak gaji yang didapat pegawai
 *
 */
public class Main {

    public static void main(String[] args) {
        String nama, alamat;
        int uangTransport,uangTunjangan, gajiPokok, totalGaji;

        GajiPegawai pegawai1 = new GajiPegawai();

        pegawai1.setNama("Rizki Adam Kurniawan");
        pegawai1.setAlamat("Jalan Semar dlm 4 No 72/66");
        pegawai1.setUangTransport(250000);
        pegawai1.setUangTunjangan(300000);
        pegawai1.setGajiPokok(4500000);

        nama = pegawai1.getNama();
        alamat = pegawai1.getAlamat();
        uangTransport = pegawai1.getUangTransport();
        uangTunjangan = pegawai1.getUangTunjangan();
        gajiPokok = pegawai1.getGajiPokok();

        totalGaji = pegawai1.totalGaji(uangTunjangan, uangTransport, gajiPokok);
        pegawai1.setTotalGaji(totalGaji);
        totalGaji = pegawai1.getTotalGaji();

        pegawai1.tampilData(nama, alamat, uangTunjangan, uangTransport, gajiPokok, totalGaji);




    }
}
