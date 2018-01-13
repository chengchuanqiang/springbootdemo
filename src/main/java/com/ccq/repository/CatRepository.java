package com.ccq.repository;

import com.ccq.entity.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author ccq
 * @Description
 * @date 2018/1/10 23:11
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {

    /**
     * 1 查询方法以 get|find|read 开头
     * 2 涉及查询条件，条件的属性用关键字连接，要注意的是条件属性的首字母需要大写
     * @param catName
     * @return
     */
    public List<Cat> findByCatName(String catName);

    /**
     * JPQL
     * @param catName
     * @return
     */
    @Query("from Cat where catName=:catName")
    public List<Cat> findMyCatName(@Param("catName")String catName);

}
