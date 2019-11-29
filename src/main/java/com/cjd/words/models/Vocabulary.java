package com.cjd.words.models;

public class Vocabulary {
    private String id;
    private String name;
    private String description;
    private String add_time;
    private String update_time;
    public String getId(){return this.id;}
    public String getName(){return this.id;}
    public String getDescription(){return this.id;}
    public String getAdd_time(){return this.id;}
    public String getUpdate_time(){return this.id;}

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }
}
