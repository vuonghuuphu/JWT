package com.example.auth.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username; // select * from account where username = "username"-> salt, passwordhash, passwordHash
    private String password; // đã mã hoá. salt+passwordhash (md5, sha)
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "roleId")
    private Role role;
    @Column(insertable = false, updatable = false)
    private int roleId;
    private Date createdAt;
    private Date updatedAt;
    private int status;
    private String verifyCode;
}
