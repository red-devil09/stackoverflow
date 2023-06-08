package com.practice.stackoverflow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Member extends BaseModel {
    private Account account;

    @ManyToMany(mappedBy = "ownedBy")
    private List<Badge> badgeList;

    @OneToMany(mappedBy = "answeredBy")
    private List<Answer> answerList;

    @OneToMany(mappedBy = "askedBy")
    private List<Question> questionList;

    private int reputation;


}
