package com.zoomcar.backend.repository;

import com.zoomcar.backend.model.TestDrive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDriveRepository extends JpaRepository<TestDrive, Long> {}