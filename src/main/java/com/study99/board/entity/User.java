package com.study99.board.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String userId;
    private String password;
    private String email;
    private LocalDateTime created_at;

    @PrePersist
    protected void onCreate(){
        created_at = LocalDateTime.now();
    }
}
