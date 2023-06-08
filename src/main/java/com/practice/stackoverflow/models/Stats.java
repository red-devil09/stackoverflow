package com.practice.stackoverflow.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Stats {
    private int upvote;
    private int flagCount;
}
