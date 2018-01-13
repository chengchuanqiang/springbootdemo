package com.ccq.entity;



import javax.persistence.*;

/**
 * @author ccq
 * @Description
 * @date 2018/1/10 23:04
 */
@Entity
@Table(name = "cat")
public class Cat {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String catName;
    private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
