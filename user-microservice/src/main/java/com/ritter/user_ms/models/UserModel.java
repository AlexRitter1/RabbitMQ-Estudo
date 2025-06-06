package com.ritter.user_ms.models;

import com.ritter.user_ms.DTOs.UserDTO;
import jakarta.persistence.*;
import org.apache.catalina.UserDatabase;

import java.io.Serializable;
import java.util.UUID;

@Table(name = "TB_USERS")
@Entity
public class UserModel implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String name;
    private String email;

    public UserModel() {
    }

    public UserModel(UUID userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}