package com.springprac.JobApp.repo;

import com.springprac.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    private static List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(
                    1,
                    "Java Developer",
                    "Develop and maintain Java applications.",
                    3,
                    Arrays.asList("Java", "Spring Boot", "Maven")
            ),
            new JobPost(2,"Frontend Engineer","Build responsive web interfaces.",
                    2,
                    Arrays.asList("HTML", "CSS", "JavaScript", "React")
            ),
            new JobPost(
                    3,
                    "DevOps Engineer",
                    "Manage CI/CD pipelines and cloud infrastructure.",
                    4,
                    Arrays.asList("AWS", "Docker", "Kubernetes", "Jenkins")
            )
    ));

    public void addJobs(JobPost jobPost){
        jobs.add(jobPost);
    }

    public List<JobPost> getAllJobs(){
        System.out.println(jobs);
        return jobs;
    }

}
