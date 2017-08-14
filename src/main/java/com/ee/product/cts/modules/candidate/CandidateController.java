package com.ee.product.cts.modules.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//@RestController
public class CandidateController {

  @Autowired CandidateRepository candidateRepository;

  @RequestMapping("/candidates")
  public List<Candidate> getAllCandidates() {
    return candidateRepository.findAll();
  }

  @RequestMapping(value = "/candidates", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Candidate insertCandidate(@RequestBody Candidate candidate) {
    return candidateRepository.save(candidate);
  }

  @RequestMapping(value = "/candidates/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Candidate updateCandidate(@PathVariable int id, @RequestBody Candidate candidate) {
    Candidate c = candidateRepository.findById(id);
    c.setName(candidate.getName());
    c.setLocation(candidate.getLocation());
    c.setRecruiter(candidate.getRecruiter());
    c.setSkills(candidate.getSkills());
    return candidateRepository.save(c);
  }
}
