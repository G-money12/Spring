package com.example.springexam01.model;

import com.example.springexam01.dto.AddressDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private SqlSession sqlMapper;
    //추가
    @Override
    public void addrInsert(AddressDTO addressDTO) {
        sqlMapper.insert("insertData", addressDTO);
    }
    // 상세보기
    @Override
    public List<AddressDTO> getAddress() {
        return sqlMapper.selectList("listData");
    }

    @Override
    public AddressDTO viewAddress(int num) {
        return sqlMapper.selectOne("viewData", num);
    }

    @Override
    public void updateAddress(AddressDTO addressDTO) {

    }
    //삭제
    @Override
    public void deleteAddress(int num) {
        sqlMapper.delete("deleteData",num);
    }
    //갯수
    @Override
    public int countAddress() {
        return sqlMapper.selectOne("countData");
    }
}
