package vn.edu.stu.luanvantotnghiep.service;

import java.util.List;
import java.util.Optional;

import vn.edu.stu.luanvantotnghiep.model.HoaDon;

public interface IHoaDonService {
    List<HoaDon> findAll();
    Optional<HoaDon> findById(Integer id);
    HoaDon create(HoaDon hoaDon);
    HoaDon update(Integer id, HoaDon hoaDon);
    HoaDon delete(Integer id);
    List<HoaDon> findAllHoaDonByKhachHang(Integer id);
    HoaDon updateChuanBiHang(Integer id);
    HoaDon updateGiaoHang(Integer id);
    HoaDon updateThanhCong(Integer id);
    HoaDon updateXoaDonHang(Integer id);
    HoaDon updateChuaThanhToan(Integer id);
    HoaDon updateDaThanhToan(Integer id);
    Integer countHoaDon();
}
