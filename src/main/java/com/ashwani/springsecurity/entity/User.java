package com.ashwani.springsecurity.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @created 16/12/2022
 */
@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private boolean active;

    private String roles;

}
