package com.ritter.user_ms.repositories;

import com.ritter.user_ms.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
