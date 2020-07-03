/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import DataConnection.ConnectionManagement;
import dto.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author OS
 */
public class NhanVienImpl implements NhanVienDao {

    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        Connection conn = new ConnectionManagement().getConnection();
        if (conn != null) {
            try {
                String query = "select MANV,HONV,TENLOT,TENNV,NGSINH,DCHI from NHANVIEN ";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(rs.getString("MANV"));
                    nv.setHoNV(rs.getString("HONV"));
                    nv.setTenLot(rs.getString("TENLOT"));
                    nv.setTenNV(rs.getString("TENNV"));
                    nv.setNgSinh(rs.getString("NGSINH"));
                    nv.setDiaChi(rs.getString("DCHI"));
                    list.add(nv);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception e) {
                }
            }
        }
        return list;
    }

    @Override
    public List<NhanVien> TimMaNV(String maNV) {
        List<NhanVien> list = new ArrayList<>();
        Connection conn = new ConnectionManagement().getConnection();
        if (conn != null) {
            try {
                String query = "select MANV,HONV,TENLOT,TENNV,NGSINH,DCHI from NHANVIEN where MANV = '" + maNV +"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(rs.getString("MANV"));
                    nv.setHoNV(rs.getString("HONV"));
                    nv.setTenLot(rs.getString("TENLOT"));
                    nv.setTenNV(rs.getString("TENNV"));
                    nv.setNgSinh(rs.getString("NGSINH"));
                    nv.setDiaChi(rs.getString("DCHI"));
                    list.add(nv);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception e) {
                }
            }
        }
        return list;
    }

}
