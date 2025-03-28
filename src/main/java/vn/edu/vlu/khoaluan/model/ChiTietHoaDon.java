package vn.edu.vlu.khoaluan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "chi_tiet_hoa_don")
public class ChiTietHoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "so_luong")
    private Integer soLuong;
    @Column(name = "gia")
    private Double gia;
    @JoinColumn(name = "san_pham_id", referencedColumnName = "id")
    @ManyToOne
    private SanPham sanPham;
    @JoinColumn(name = "hoa_don_id", referencedColumnName = "id")
    @ManyToOne
    @JsonBackReference
    private HoaDon hoaDon;
    @Column(name = "kich_thuoc")
    private String kichThuoc;
    public ChiTietHoaDon() {
    }
    public ChiTietHoaDon(Integer id, Integer soLuong, Double gia, SanPham sanPham, HoaDon hoaDon) {
        this.id = id;
        this.soLuong = soLuong;
        this.gia = gia;
        this.sanPham = sanPham;
        this.hoaDon = hoaDon;
    }
    public String getKichThuoc() {
        return kichThuoc;
    }
    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    public Double getGia() {
        return gia;
    }
    public void setGia(Double gia) {
        this.gia = gia;
    }
    public SanPham getSanPham() {
        return sanPham;
    }
    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
    
}
