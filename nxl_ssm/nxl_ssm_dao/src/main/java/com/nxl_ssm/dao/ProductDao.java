package com.nxl_ssm.dao;

import com.nxl_ssm.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProductDao {

    //@Select("select * from product")
    public List<Product> findAll();

    public void save(Product product);

}
