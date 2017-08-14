package com.ee.product.cts.modules.candidate;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CandidateController {

  @RequestMapping("/candidates")
  public List<Candidate> getAllCandidates() {
    return Arrays.asList( new Candidate("Buce Wayne", "Gotham", "Ravi", Arrays.asList("Java", "React")),
        new Candidate("Peter PArker", "New York", "Nandan", Arrays.asList("UI", "React")),
        new Candidate("Super Man", "Chicago", "Ravi", Arrays.asList("DBA", "Mongo")));
  }

  @RequestMapping(value = "/candidates", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Candidate insertCandidate(@RequestBody Candidate candidate) {
    return candidate;
  }

  @RequestMapping(value = "/candidates/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Candidate insertCandidate(@PathVariable int id) {
    System.out.println("Id: " + id);
    return null;
  }
}
