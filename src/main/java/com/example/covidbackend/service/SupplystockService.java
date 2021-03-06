package com.example.covidbackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.covidbackend.entity.Supplystock;
import com.example.covidbackend.mapper.SupplystockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplystockService extends ServiceImpl<SupplystockMapper, Supplystock> {


    public List<Supplystock> getListByOrder() {
        QueryWrapper<Supplystock> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("id");
        return getBaseMapper().selectList(wrapper);
    }

    public List<Supplystock> getofCategory(String categoryname) {

        QueryWrapper<Supplystock> wrapper = new QueryWrapper<>();
        wrapper.eq("categoryname", categoryname);
        wrapper.ne("remain_quantity", 0);
        return getBaseMapper().selectList(wrapper);

    }

    public Integer getsum() {
        List<Supplystock> lists = list();
        int sum = 0;
        for (Supplystock supplystock : lists) {
            sum += supplystock.getRemainQuantity();
        }
        return sum;
    }


}
