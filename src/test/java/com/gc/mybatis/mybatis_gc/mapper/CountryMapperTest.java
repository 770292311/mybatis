package com.gc.mybatis.mybatis_gc.mapper;

import com.gc.mybatis.mybatis_gc.domain.Country;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CountryMapperTest {
    @Resource
    CountryMapper countryMapper;
    @Test
    public void getAll() {
        Country country = countryMapper.getAll();
        log.info(country.toString());
    }

    @Test
    public void get() {
        try {
            List<Country> country=null;
//            Country country = countryMapper.selectById(1);
            Map<String,Object> map=new HashMap<>();
            map.put("country_code","US");
            country=countryMapper.selectByMap(map);
            log.info(country.toString());
        } catch (Exception e) {
            log.error(e.toString());
        }
    }

}