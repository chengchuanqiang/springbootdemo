package com.ccq.controller;

import com.ccq.entity.Cat;
import com.ccq.service.CatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ccq
 * @Description
 * @date 2018/1/10 23:20
 */

@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @GetMapping("/save")
    public Cat save(){
        Cat cat = new Cat();
        cat.setCatName("jack");
        cat.setCatAge(12);
        return catService.save(cat);
    }

    @GetMapping("/delete")
    public void delete(){
       catService.delete(1);
    }

    @GetMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }
}
