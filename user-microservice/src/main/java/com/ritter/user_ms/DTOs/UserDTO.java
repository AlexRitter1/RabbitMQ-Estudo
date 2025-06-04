package com.ritter.user_ms.DTOs;

import com.ritter.user_ms.models.UserModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record UserDTO(@NotBlank String name, @NotBlank @Email String email) {
}