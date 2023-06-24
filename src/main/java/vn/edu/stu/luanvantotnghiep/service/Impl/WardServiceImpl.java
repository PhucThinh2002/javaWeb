package vn.edu.stu.luanvantotnghiep.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.stu.luanvantotnghiep.model.Ward;
import vn.edu.stu.luanvantotnghiep.repository.WardRepository;
import vn.edu.stu.luanvantotnghiep.service.IWardService;

@Service
public class WardServiceImpl implements IWardService{

    @Autowired
    private WardRepository wardRepository;
    @Override
    public Ward create(Ward ward) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Ward delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Ward> findAll() {
        return wardRepository.findAll();
    }

    @Override
    public Optional<Ward> findById(Long id) {
        return wardRepository.findById(id);
    }

    @Override
    public Ward update(Ward ward) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Ward> findByDistrictID(Long district) {
        return wardRepository.findDistrictById(district);
    }
    
}
