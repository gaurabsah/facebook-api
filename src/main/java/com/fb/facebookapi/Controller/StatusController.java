package com.fb.facebookapi.Controller;

import com.fb.facebookapi.Entity.Status;
import com.fb.facebookapi.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/statusService")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status) {
        return statusService.saveStatus(status);
    }


    @GetMapping("/getAllStatus")
    public ArrayList<Status> getAllStatus() {
        return statusService.getAllStatus();
    }
}
