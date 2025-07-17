package com.zoomcar.backend.controller;

import com.zoomcar.backend.model.TestDrive;
import com.zoomcar.backend.service.TestDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test-drives")
public class TestDriveController {
    @Autowired
    private TestDriveService testDriveService;

    @PostMapping("/book")
    public TestDrive bookTestDrive(@RequestBody TestDrive testDrive) {
        return testDriveService.book(testDrive);
    }
}