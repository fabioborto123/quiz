package com.quiz.back.entity;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private String description;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
