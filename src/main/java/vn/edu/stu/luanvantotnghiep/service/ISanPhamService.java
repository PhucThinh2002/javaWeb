package vn.edu.stu.luanvantotnghiep.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import vn.edu.stu.luanvantotnghiep.model.SanPham;

public interface ISanPhamService {
    Page<SanPham> findAll(Integer limit, Integer currentpage);
    Page<SanPham> findSanPhamActive(Integer limit, Integer currentpage);
    Optional<SanPham> findById(Integer id);
    SanPham create(SanPham sanPham);
    SanPham update(SanPham sanPham);
    SanPham delete(Integer id);
}
