package com.practice.stackoverflow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question extends BaseModel{
    private String questionDescription;

    @ManyToOne
    @JoinColumn(name="member_id", nullable=false)
    private Member askedBy;

    @OneToMany
    private List<Answer> answerList;

    @OneToMany(mappedBy = "question")
    private List<Comment> commentList;
    //agar apne ko sirf one to many hi rkhna hai, to best is element collection(i think so)
    // aagr hum sirf ye OneToMany hi likhte hai, to alag se table bnegi, jaise m:m mei bnti hai
    //and is table ki primary key bnegi comment_id that is
    /*

      each qustion can have multiple comments
      but every comment is unique

      cmmn_id   |   Question_id
      1    -    1
      2    -    1
      3    -    2
     */
    //aur agar doosri side ko ownwe bnate hai hum, i.e we also write ManyToOne (means id of 1 to M side)
    //agar alag se table nhi bnega : basic hai

    @ManyToMany
    private List<Tag> tagList;

    private QuestionStatus questionStatus;
    private Stats stats;
    private int deleteCount;
}
