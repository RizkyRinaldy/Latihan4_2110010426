package Penilaian;

public class NilaiAkhir extends Mahasiwa {
    int uts,uas, tugas, nilai;

    public NilaiAkhir(String nama, String npm) {
        super(nama, npm);
    }
    
    int setNilaiUts(){
       return (int) (nilai*0.30);
   }
    int setNilaiUas(){
       return (int) (nilai*0.30);
   }
    int setNilaiTugas(){
       return (int) (nilai*0.40);
   }
    
    public static void main(String[] args) {
        NilaiAkhir hasilnilai = new NilaiAkhir(80,90,70);
        
        System.out.println("Nama    ="+hasilnilai.setNama());
        System.out.println("Nama    ="+hasilnilai.setNpm());
        System.out.println("Nama    ="+hasilnilai.setNilaiUts());
        System.out.println("Nama    ="+hasilnilai.setNilaiUas());
        System.out.println("Nama    ="+hasilnilai.setNilaiTugas());
    }
}
