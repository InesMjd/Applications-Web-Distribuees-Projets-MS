package com.esprit.ms.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobRestAPI {


    @GetMapping("/all")
    public String getJobs(@RequestHeader(value = "Authorization", required = false) String token) {
        return "Liste des jobs (token reçu : " + (token != null) + ")";
    }
    private String hello="Hello, i'm the Job MS";

    @RequestMapping("/helloJ")
    public String sayHello(){
        return hello;
    }

    @Autowired
    private JobService jobService;

    /*@Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping("/welcome")
    public String welcome() {
        return welcomeMessage;
    }
*/
    @RequestMapping
    public ResponseEntity<List<Job>> getAll() {
        return new ResponseEntity<>(jobService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Job getJob(@PathVariable int id) {

        return jobService.getJobById(id);
    }
    @PostMapping
    public ResponseEntity<Job>addJob( @RequestBody Job b)
    {
        return  new ResponseEntity<Job> (jobService.addJob(b),HttpStatus.CREATED);
    }

}
