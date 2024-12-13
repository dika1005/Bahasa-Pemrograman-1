/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujitsu U938
 */
import javax.swing.JOptionPane;

public class DataDiriMahasiswa {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama: ");
        String nim = JOptionPane.showInputDialog("Masukkan NIM: ");
        String prodi = JOptionPane.showInputDialog("Masukkan Program Studi: ");
        String universitas = JOptionPane.showInputDialog("Masukkan Universitas: ");

        String hasil = "Data Diri Mahasiswa\n"
                     + "Nama        : " + nama + "\n"
                     + "NIM         : " + nim + "\n"
                     + "Program Studi : " + prodi + "\n"
                     + "Universitas : " + universitas;

        JOptionPane.showMessageDialog(null, hasil, "Data KTM Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
    }
}
