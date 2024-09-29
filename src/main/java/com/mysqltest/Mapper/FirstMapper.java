package com.mysqltest.Mapper;

import com.mysqltest.POJO.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper
public interface FirstMapper {
    @Select("select * from address_info")
    public List<Address> getInfo();
}
