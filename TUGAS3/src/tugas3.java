import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class tugas3 {
    public static void main(String[] args) throws Exception {
        
       LinkedList <Integer> nobp  = new LinkedList<>();
       LinkedList <String> nama   = new LinkedList<>();
       LinkedList <String> alamat = new LinkedList<>();
       
       nobp.add(2111522005);
       nama.add("Rakhilca Yanedika");
       alamat.add("Agam");

       System.out.println("\n=======DATA MAHASISWA UNAND=======");
       System.out.println("\nNomor BP Mahasiswa\t = "+nobp);
       System.out.println("Nama Mahasiswa\t\t= "+nama);
       System.out.println("Alamat Mahasiswa\t = "+alamat);

       //Add Linkedlist (menambah data mahasiswa)
       
       System.out.println("\n=======ENTRY DATA MAHASISWA BARU======");

       nobp.addFirst(2111522007);
       nobp.addLast(2111522008);
       nobp.add(2111522009);
       nobp.add(2111522001);
       nobp.add(2111522002);
       nobp.add(2111522003);

       System.out.println("Nomor BP Mahasiswa = "+nobp);
       System.out.println("Ukuran = "+nobp.size());

       nama.addFirst("Gheo");
       nama.addLast("Cilha");
       nama.add("Orchid");
       nama.add("Oche");
       nama.add("Cihan");
       nama.add("Acha");

       System.out.println("\nNama Mahasiswa = "+nama);
       System.out.println("Ukuran = "+nama.size());

       alamat.addFirst("BSD");
       alamat.addLast("Cilegon");
       alamat.add("Bungo Pasang");
       alamat.add("Radio Dalam");
       alamat.add("Jakarta");
       alamat.add("Sungai Taruang");

       System.out.println("\nAlamat Mahasiswa = "+alamat);
       System.out.println("Ukuran = "+alamat.size());

       //Set Linkedlist (menyisipkan data mahasiswa)

       nobp.set(0, 2111522004);
       nobp.set(3, 2111521001);
       nobp.set(5, 2111521006);
       nobp.set(4, 2111521008);

       nama.set(0, "Eraldika");
       nama.set(3, "Gobenvy");
       nama.set(5, "Alnekhaesa");
       nama.set(4, "Kafka");

       alamat.set(0, "Air Tawar");
       alamat.set(3, "Tangerang");
       alamat.set(5, "Kamang");
       alamat.set(4, "Padang Panjang");
       
       System.out.println("\n======TAMBAHAN ENTRY DATA MABA======");
       System.out.println("\nNomor BP Mahasiswa = "+nobp);
       System.out.println("Nama Mahasiswa = "+nama);
       System.out.println("Alamat Mahasiswa ="+alamat);

       //Remove Linkedlist (menghapus data mahasiswa)

       nobp.removeFirst();
       nobp.remove(2);

       nama.removeFirst();
       nama.remove(2);

       alamat.removeFirst();
       alamat.remove(2);

       System.out.println("\n======MENGHAPUS DATA MAHASISWA======");
       System.out.println("\nNomor BP Mahasiswa = "+nobp);
       System.out.println("Ukuran = "+nobp.size());
       System.out.println("\nNama Mahasiswa = "+nama);
       System.out.println("Ukuran = "+nama.size());
       System.out.println("\nAlamat Mahasiswa = "+alamat);
       System.out.println("Ukuran = "+alamat.size());

       //isEmpty Linkedlist (Mengecek data mahasiswa yang kosong)
       
       System.out.println("\n======KELENGKAPAN DATA MAHASISWA======");
       System.out.println("Ada data Nomor BP Mahasiswa yang kosong = "+nobp.isEmpty());
       System.out.println("Ada data Nama Mahasiswa yang kosong = "+nama.isEmpty());
       System.out.println("Ada data Alamat Mahasiswa yang kosong = "+alamat.isEmpty());

       //pop dan push
       
       nobp.pop();
       nama.pop();
       alamat.pop();

       System.out.println("\n======MENGHAPUS DATA MAHASISWA PERTAMA======");
       System.out.println("\nNomor BP Mahasiswa = "+nobp);
       System.out.println("Ukuran = "+nobp.size());
       System.out.println("\nNama Mahasiswa = "+nama);
       System.out.println("Ukuran = "+nama.size());
       System.out.println("\nAlamat Mahasiswa = "+alamat);
       System.out.println("Ukuran = "+alamat.size());

       nobp.push(2111521007);
       nama.push("Erma");
       alamat.push("Magek");
       
       System.out.println("\n======MENAMBAH DATA PERTAMA MAHASISWA======");
       System.out.println("\nNomor BP Mahasiswa = "+nobp);
       System.out.println("Ukuran = "+nobp.size());
       System.out.println("\nNama Mahasiswa = "+nama);
       System.out.println("Ukuran = "+nama.size());
       System.out.println("\nAlamat Mahasiswa = "+alamat);
       System.out.println("Ukuran = "+alamat.size());

       //get (menampilkan data mahasiswa tertentu)
       
       System.out.println("\n======TAMPILKAN DATA MAHASISWA======");
       System.out.println("\nNomor BP Mahasiswa index ke-3 = "+nobp.get(3));
       System.out.println("Nama Mahasiswa index ke-3 = "+nama.get(3));
       System.out.println("Alamat Mahasiswa index ke-3 = "+alamat.get(3));

       //indexof (mengetahui index data mahasiswa tertentu)

       System.out.println("\n======URUTAN DATA MAHASISWA======");
       System.out.println("\nNomor BP Mahasiswa = "+nobp.indexOf(2111522005));
       System.out.println("Nama Mahasiswa = "+nama.indexOf("Rakhilca Yanedika"));
       System.out.println("Alamat Mahasiswa = "+alamat.indexOf("Agam"));

    }
}
