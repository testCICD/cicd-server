package com.ee.product.cts.modules.candidate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestController
public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

  public Candidate findById(Integer id);
}
