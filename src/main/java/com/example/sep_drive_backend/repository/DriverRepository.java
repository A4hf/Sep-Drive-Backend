package com.example.sep_drive_backend.repository;

import com.example.sep_drive_backend.models.Driver;
import com.example.sep_drive_backend.models.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}

