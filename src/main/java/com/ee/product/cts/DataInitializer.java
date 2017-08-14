package com.ee.product.cts;

import com.ee.product.cts.modules.candidate.Candidate;
import com.ee.product.cts.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner{

  @Autowired
  CandidateRepository candidateRepository;

  @Override
  public void run(String... args) throws Exception {

    ArrayList<String> skills = new ArrayList<>();
    skills.add("java");
    skills.add("react");
    Arrays.asList( new Candidate("Buce Wayne", "Gotham", "Ravi", skills),
        new Candidate("Peter PArker", "New York", "Nandan", skills),
        new Candidate("Super Man", "Chicago", "Ravi", skills)).stream().forEach(candidateRepository :: save);

  }
}
