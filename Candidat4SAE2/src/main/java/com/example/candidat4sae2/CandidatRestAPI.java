package com.example.candidat4sae2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/candidats")

public class CandidatRestAPI {
    private String title="Hello, i'm the candidate Micro-Service";

    @Autowired
    private CandidatService candidatService;


    private String hello="Hello Esprit, I'm the candidate MS";

    @RequestMapping("/hello")
    public String sayHello(){
        return hello;

    }

    @RequestMapping("/jobs/{id}")
    public Job getJobById(@PathVariable int id){
        return candidatService.getJobById(id);
    }

    @RequestMapping("/jobs")
    public List<Job> getAllJobs(){
        return candidatService.getAllJobs();
    }

   @GetMapping
    public List<Candidat> getListCandid() {
        return candidatService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Candidat> createCandidat(@RequestBody Candidat candidat) {
        return new ResponseEntity<>(candidatService.addCandidat(candidat), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Candidat> updateCandidat(@PathVariable(value = "id") int id,
                                                   @RequestBody Candidat candidat){
        return new ResponseEntity<>(candidatService.updateCandidat(id, candidat),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(candidatService.deleteCandidat(id), HttpStatus.OK);
    }



}
