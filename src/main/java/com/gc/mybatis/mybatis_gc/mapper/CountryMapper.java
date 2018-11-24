package com.gc.mybatis.mybatis_gc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gc.mybatis.mybatis_gc.domain.Country;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryMapper extends BaseMapper<Country> {
    Country getAll();
}
