/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author OS
 */
public class NhanVien implements Serializable {
    private String maNV = "";
    private String hoNV = "";
    private String tenLot = "";
    private String tenNV = "";
    private String ngSinh = "";
    private String diaChi = "";

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoNV, String tenLot, String tenNV, String ngSinh, String diaChi) {
        this.maNV = maNV;
        this.hoNV = hoNV;
        this.tenLot = tenLot;
        this.tenNV = tenNV;
        this.ngSinh = ngSinh;
        this.diaChi = diaChi;
    }


    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the hoNV
     */
    public String getHoNV() {
        return hoNV;
    }

    /**
     * @param hoNV the hoNV to set
     */
    public void setHoNV(String hoNV) {
        this.hoNV = hoNV;
    }

    /**
     * @return the tenLot
     */
    public String getTenLot() {
        return tenLot;
    }

    /**
     * @param tenLot the tenLot to set
     */
    public void setTenLot(String tenLot) {
        this.tenLot = tenLot;
    }

    /**
     * @return the tenNV
     */
    public String getTenNV() {
        return tenNV;
    }

    /**
     * @param tenNV the tenNV to set
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    /**
     * @return the ngSinh
     */
    public String getNgSinh() {
        return ngSinh;
    }

    /**
     * @param ngSinh the ngSinh to set
     */
    public void setNgSinh(String ngSinh) {
        this.ngSinh = ngSinh;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
//    public ArrayList<NhanVien> Init(){
//        ArrayList<NhanVien> dsnv = new ArrayList<>();
//        dsnv.add(new NhanVien("001","Nguyen Truong Son","tp hcm"));
//        dsnv.add(new NhanVien("002","Le Nguyen Hoai Nam","tp hcm"));
//        dsnv.add(new NhanVien("003","Tiet Gia Hong","tp hcm"));
//        return dsnv;
//    }
}
