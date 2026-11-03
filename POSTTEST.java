import javax.swing.JOptionPane;
public class POSTTEST {


    public static void main(String [] args) {
        String Nama, NIM,Prodi,Fakultas, Alamat, Thn;
        int tahunLahir, umur;

        Nama= JOptionPane.showInputDialog("Masukan Nama Mahasiswa");
        NIM = JOptionPane.showInputDialog("Masukan NIM");
        Prodi = JOptionPane.showInputDialog("Masukan Nama Prodi");
        Fakultas = JOptionPane.showInputDialog("Masukan Nama Fakultas");
        Alamat = JOptionPane.showInputDialog("Masukan Alamat");
        Thn = JOptionPane.showInputDialog("Masukan Tahun Lahir");
        tahunLahir = Integer.parseInt(Thn);
        umur = 2026 - tahunLahir;

        JOptionPane.showMessageDialog(null, "Nama Mahasiswa : " + Nama + "\nNIM : " + NIM + "\nProdi : " + Prodi + "\nFakultas : " + Fakultas + "\nAlamat : " + Alamat + "\nTahun Lahir : " + tahunLahir + "\nUmur : " + umur);
    }

}   


