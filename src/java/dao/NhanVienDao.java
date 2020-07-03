/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.NhanVien;
import java.util.List;

/**
 *
 * @author OS
 */
public interface NhanVienDao {

    public List<NhanVien> getAll();
    public List<NhanVien> TimMaNV(String maNV);
}
