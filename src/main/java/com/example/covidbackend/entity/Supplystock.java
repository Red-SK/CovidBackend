package com.example.covidbackend.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplystock {
    private String id;
    private String supplyname;
    private String categoryname;
    private Double remainQuantity;
    private String Note;
}
