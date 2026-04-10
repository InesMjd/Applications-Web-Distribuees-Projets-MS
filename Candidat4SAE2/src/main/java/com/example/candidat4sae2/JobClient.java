package com.example.candidat4sae2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="job")
public interface JobClient {


    @RequestMapping("/jobs")
    public List<Job> getListJob();

    @RequestMapping("/jobs/{id}")
    public Job getJobById(@PathVariable int id);
}
