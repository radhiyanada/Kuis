package kuis;

import Kriteria.Designer;
import Kriteria.Manager;
import Kriteria.Programmer;
import java.util.Scanner;

/**
 *
 * @author Nada
 */
public class Main {

    public static void main(String[] args) {
       try{
       Scanner input= new Scanner(System.in);
        System.out.println("Pelamaran Lowongan Pekerjaan");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilih = input.nextInt();
        
        //scanner berupa data
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Nama Lengkap : ");
        String nama = data.next();
        
        System.out.println("---Penilaian---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
        
        if (pilih == 1){
            //programmer
            System.out.print("Input Nilai Programming Knowledge : ");
            int nilaiPertama= data.nextInt();
            System.out.print("Input Nilai Clean Coding : ");
            int nilaiKedua = data.nextInt();
            System.out.print("Input Nilai Debugging : ");
            int nilaiKetiga = data.nextInt();
            Programmer programmer = new Programmer(nama,nilaiPertama,nilaiKedua,nilaiKetiga);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + programmer.hitungNilai());
                    System.out.println("Keterangan : " + programmer.keterangan());
                }
                else if (Menu == 2){
                    System.out.print("Input Nilai Programming Knowledge : ");
                    programmer.inputNilaiPertama(input.nextInt());
                    System.out.print("Input Nilai Clean Coding : ");
                    programmer.inputNilaiKedua(input.nextInt());
                    System.out.print("Input Nilai Debugging : ");
                    programmer.inputNilaiKetiga(input.nextInt());
                    
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.print("Input Nilai Design Portofolio : ");
            int nilaiPertama= data.nextInt();
            System.out.print("Input Nilai Prototyping : ");
            int nilaiKedua = data.nextInt();
            System.out.print("Input Nilai Creativity : ");
            int nilaiKetiga = data.nextInt();
            Designer designer = new Designer(nama,nilaiPertama,nilaiKedua,nilaiKetiga);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + designer.hitungNilai());
                    System.out.println("Keterangan : " + designer.keterangan());
                }
                else if (Menu == 2){
                    System.out.print("Input Nilai Design Portofolio : ");
                    designer.inputNilaiPertama(input.nextInt());
                    System.out.print("Input Nilai Prototyping : ");
                    designer.inputNilaiKedua(input.nextInt());
                    System.out.print("Input Nilai Creativity : ");
                    designer.inputNilaiKetiga(input.nextInt());
                }
                else {
                     System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else if(pilih == 3){
            System.out.print("Input Nilai Innovation : ");
            int nilaiPertama= data.nextInt();
            System.out.print("Input Nilai Decision Making : ");
            int nilaiKedua = data.nextInt();
            System.out.print("Input Nilai Communication: ");
            int nilaiKetiga = data.nextInt();
            Manager manager = new Manager(nama,nilaiPertama,nilaiKedua,nilaiKetiga);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + manager.hitungNilai());
                    System.out.println("Keterangan : " + manager.keterangan());
                }
                else if (Menu == 2){
                    System.out.print("Input Nilai Innovation : ");
                    manager.inputNilaiPertama(input.nextInt());
                    System.out.print("Input Nilai Decision Making  : ");
                    manager.inputNilaiKedua(input.nextInt());
                    System.out.print("Input Nilai Communication: ");
                    manager.inputNilaiKetiga(input.nextInt());
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
        }
        catch(Exception error){
            System.out.println("Error karena " +error.getMessage());
        }
    }
}
