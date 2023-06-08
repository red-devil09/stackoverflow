package com.practice.stackoverflow.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Account {
    private String name;
    private String email;
    private AccountType accountType;

}
