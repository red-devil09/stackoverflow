package com.practice.stackoverflow.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Bounty {
    private String description;
    private int reputation;
}
