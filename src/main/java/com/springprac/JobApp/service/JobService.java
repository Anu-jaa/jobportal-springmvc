package com.springprac.JobApp.service;

import com.springprac.JobApp.model.JobPost;
import com.springprac.JobApp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repo;

    public void addJob(JobPost jobPost){
        repo.addJobs(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
