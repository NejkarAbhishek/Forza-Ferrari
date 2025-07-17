package com.zoomcar.backend.service;

import com.zoomcar.backend.model.TestDrive;
import com.zoomcar.backend.repository.TestDriveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDriveService {
    @Autowired
    private TestDriveRepository testDriveRepository;

    public TestDrive book(TestDrive testDrive) {
        return testDriveRepository.save(testDrive);
    }
}