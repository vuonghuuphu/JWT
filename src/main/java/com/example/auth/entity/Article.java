package com.example.auth.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Article {
    @Id
    private int id;
    private String name;
    private int status;
}
