package com.practice.stackoverflow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Answer extends BaseModel {
    private String description;

    @ManyToOne
    @JoinColumn(name="member_id", nullable=false)//after writing this, Member table will have member_id instead
    //of answeredBy_id
    private Member answeredBy;

//    @ManyToOne
//    private Question answeredFor;
//
    @OneToMany()
    private List<Comment> commentList;

    private Stats stats;
}
