package com.example.sep_drive_backend.repository;

import com.example.sep_drive_backend.models.Customer;
import com.example.sep_drive_backend.models.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<users, Long> {
}
