package com.practice.stackoverflow.models;

import jakarta.persistence.*;

@Entity
public class Comment extends BaseModel {
    private String description;

//    @ManyToOne
//    private Member madeBy;
//
//    @ManyToOne
//    private Answer belongsToAnswer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private Stats stats;
}
