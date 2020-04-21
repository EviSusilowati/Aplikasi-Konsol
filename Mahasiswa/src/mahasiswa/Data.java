package mahasiswa;

public class Data {
    private String nim;
    private String nama;
    private String jurusan;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        jurusan = "";
        alamat = "";
    }

    public Data(String nim, String nama, String jurusan, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnim() {
        return nim;
    }

    public String getnama() {
        return nama;
    }

    public String getjurusan() {
        return jurusan;
    }

    public String getalamat() {
        return alamat;
    }
}