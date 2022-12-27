package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.Status;
import com.fb.facebookapi.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    private StatusRepository statusRepository;


    @Override
    public Status saveStatus(Status status) {
        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime=new Timestamp(time);

        status.setStatusID(UUID.randomUUID());
        status.setUploadTIme(dateTime);
        return statusRepository.save(status);
    }

    @Override
    public ArrayList<Status> getAllStatus() {
        ArrayList<Status> result=new ArrayList<Status>();
        result=statusRepository.findAll();
        result.sort((e1, e2) -> e2.getUploadTIme().compareTo(e1.getUploadTIme()));
        return result;
    }
}
