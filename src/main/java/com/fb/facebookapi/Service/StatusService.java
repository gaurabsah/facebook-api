package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.Status;

import java.util.ArrayList;

public interface StatusService {

    Status saveStatus(Status status);

    ArrayList<Status> getAllStatus();
}
