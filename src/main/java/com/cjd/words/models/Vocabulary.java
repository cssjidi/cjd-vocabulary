package com.cjd.words.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Vocabulary {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;
    private String name;
    private String description;
    private String add_time;
    private String update_time;

    public String getName(){return this.name;}
    public Long getId() {
        return id;
    }
    public String getDescription(){return this.description;}
    public String getAdd_time(){return this.add_time;}
    public String getUpdate_time(){return this.update_time;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUpdate_time() {
        this.update_time = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    public void setAdd_time() {
        this.add_time = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

}
