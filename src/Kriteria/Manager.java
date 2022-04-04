/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kriteria;

import kuis.JobApplication;

/**
 *
 * @author Nada
 */
public class Manager extends DaftarNilai implements JobApplication{
    public Manager(String nama, int nilaiPertama, int nilaiKedua, int nilaiKetiga) {
        super(nama, nilaiPertama, nilaiKedua, nilaiKetiga);
    }
    
    public void inputNilaiPertama(int nilaiPertama) {
        this.nilaiPertama = nilaiPertama;
    }

    public void inputNilaiKedua(int nilaiKedua) {
        this.nilaiKedua = nilaiKedua;
    }
     
    public void inputNilaiKetiga(int nilaiKetiga) {
        this.nilaiKetiga = nilaiKetiga;
    }

    @Override
    public double hitungNilai() {
       return (0.4*super.nilaiPertama) + (0.3*super.nilaiKedua) + (0.3*super.nilaiKetiga);
    }

    @Override
    public String keterangan() {
       if (this.hitungNilai() >= 85){
            return "DITERIMA \n\n Selamat! " + this.nama + " mendapatkan pekerjaan sebagai Manager";
        } else {
            return "COBA LAGI \n\nMohon maaf, " + this.nama + " tidak mendapatkan pekerjaan sebagai Manager";
        }
    }
    
    
}
