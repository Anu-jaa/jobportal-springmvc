package com.springprac.JobApp;

import com.springprac.JobApp.model.JobPost;
import com.springprac.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/","home"})
    public String home(){
        System.out.println("Returning home page..");
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        System.out.println("Returning addjob page..");
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewalljobs(Model model){
        model.addAttribute("jobPosts",jobService.getAllJobs());
        System.out.println("Returning viewalljobs page..");
        return "viewalljobs";
    }

}
