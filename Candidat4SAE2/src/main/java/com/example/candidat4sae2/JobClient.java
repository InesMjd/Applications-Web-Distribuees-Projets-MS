package com.example.candidat4sae2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "job")
public interface JobClient {

    @RequestMapping("/jobs")
    public List<Job> getAllJobs();

    @RequestMapping("jobs/{id}")
    public Job getJobById(@PathVariable("id") int id);

}
