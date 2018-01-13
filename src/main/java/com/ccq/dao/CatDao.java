package com.ccq.dao;

import com.ccq.entity.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 使用@Repository注解，标注这是一个持久化操作对象
 *
 * @author ccq
 * @Description
 * @date 2018/1/13 15:38
 */
@Repository
public class CatDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Cat> selectByCatName(String catName) {
        String sqlStr = "select * from cat where cat_name = ?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);
        List<Cat> catList = jdbcTemplate.query(sqlStr, new Object[]{catName}, rowMapper);
        return catList;
    }

}
