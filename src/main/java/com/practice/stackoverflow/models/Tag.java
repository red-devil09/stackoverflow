package com.practice.stackoverflow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tag extends BaseModel {
    private String name;
    private String description;

    @ManyToMany(mappedBy = "tagList")
    private List<Question> questionList;
}
