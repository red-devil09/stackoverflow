package com.practice.stackoverflow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Badge extends BaseModel{
    private String name;
    private String description;

    @ManyToMany
    private List<Member> ownedBy;
}
