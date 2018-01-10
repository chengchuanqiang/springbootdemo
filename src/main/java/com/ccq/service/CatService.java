package com.ccq.service;

import com.ccq.entity.Cat;
import com.ccq.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author ccq
 * @Description
 * @date 2018/1/10 23:13
 */

@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Transactional
    public Cat save(Cat cat){
        return catRepository.save(cat);
    }

    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    public Iterable<Cat>  getAll(){
        Iterable<Cat> cats = catRepository.findAll();
        return cats;
    }
}
