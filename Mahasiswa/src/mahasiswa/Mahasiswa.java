package mahasiswa;

import java.util.List;
import java.util.Scanner;

public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public void printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("APLIKASI  DATA  MAHASISWA");
        System.out.println("------------------------------------");
        System.out.println("1. Tambah Data" + "\n2. Ubah Data" + "\n3. Hapus Data" + "\n4. Lihat Data" + "\n5. Keluar");
        System.out.print("Masukan Pilihan Anda ---> ");
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Urutan data yang dihapus ---> ");
        int idx = Integer.parseInt(sc.nextLine());
        // proses hapus data
        Operasi.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang diubah ---> ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------");
        System.out.print("NIM       : ");
        String nim = sc.nextLine();
        System.out.print("Nama      : ");
        String nama = sc.nextLine();
        System.out.print("Jurusan     : ");
        String jurusan = sc.nextLine();
        System.out.print("Alamat   : ");
        String alamat = sc.nextLine();
        // proses ubah data
        Operasi.editData(new Data(nim, nama, jurusan, alamat), idx - 1);
    }

    public void listData() {
        List<Data> result = Operasi.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  NIM       : " + result.get(i).getnim());
            System.out.println("  Nama      : " + result.get(i).getnama());
            System.out.println("  Jurusan     : " + result.get(i).getjurusan());
            System.out.println("  Alamat    : " + result.get(i).getalamat());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Jurusan : ");
        String jurusan = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
        // proses tambah data
        Operasi.addData(new Data(nim, nama, jurusan, alamat));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa app = new Mahasiswa();
        while (true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Daftar Data");
                    app.listData();
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Daftar Data");
                    app.listData();
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    app.listData();
                    break;
                case 5:
                    System.out.println("\nApakah Anda Ingin keluar?");
                    System.out.println("1.Ya \t2.Tidak");
                    char persetuju = sc.next().charAt(0);
                    if (persetuju == '2') {
                        app.printMenu();
//                        pilihan = sc.nextInt();

                    } else if (persetuju == '1') {
                        System.out.println("Anda telah keluar dari Aplikasi Mahasiswa");
                        System.out.println("TERIMA KASIH");
                        System.exit(0);
                    }
            }
        }
    }
}
