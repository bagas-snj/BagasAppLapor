/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Project.Tambah;

/**
 *
 * @author gusty_g.n.m
 */
public class NikServiceImp implements NikService {

    @Override
    public void insert(Nik product) {
        Data.list.add(product);
        JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
    }

    @Override
    public void update(int index, Nik product) {
        Data.list.set(index, product);
        JOptionPane.showMessageDialog(null, "Update berhasil!");
    }

    @Override
    public void delete(int index) {
        Data.list.remove(index);
        JOptionPane.showMessageDialog(null, "Data telah dihapus!");
    }

    @Override
    public DefaultTableModel view() {
        String[] judul = {"NIK", "Laporan"};
        DefaultTableModel dtm = new DefaultTableModel(null, judul);
        for (Nik m : Data.list) {
            Object[] kolom = new Object[2];
            kolom[0] = m.getIdnik();
            kolom[1] = m.getLaporan();
                        dtm.addRow(kolom);
        }
        return dtm;
    }

}
