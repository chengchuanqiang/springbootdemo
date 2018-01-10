package com.ccq.repository;

import com.ccq.entity.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ccq
 * @Description
 * @date 2018/1/10 23:11
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {

}
