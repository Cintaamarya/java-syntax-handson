package Task1;

class NamingConvention {
    public static void main(String[] args){

        String namaLengkapMahasiswa = "Cinta Amarya Brigitha Zefanya Tarigan";
        String nimMahasiswa = "2482025";
        double ipkMahasiswa = 3.65;
        String alamatMahasiswa = "jl. Kamboja Dalam Cijantung, Jakarta Timur";
        boolean statusAktifKuliah = true;
        int jumlahSks = 22;

        //Tampilkan semua data
        System.out.println("===DATA MAHASISWA===");
        System.out.println("Nama Lengkap :" + namaLengkapMahasiswa);
        System.out.println("NIM :" + nimMahasiswa);
        System.out.println("ipk :" + ipkMahasiswa);
        System.out.println("Status Kuliah :" + (statusAktifKuliah ? "Aktif" : "Tidak Aktif"));
        System.out.println("Jumlah SKS :" + jumlahSks);
    }
}
