package com.ee.product.cts.modules.candidate;

import java.util.List;

public class Candidate {
  private int id;
  private String name;
  private String location;
  private String recruiter;
  private List<String> skills;

  public Candidate() {}

  public Candidate(String name, String location, String recruiter, List<String> skills) {
    this.name = name;
    this.location = location;
    this.recruiter = recruiter;
    this.skills = skills;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getRecruiter() {
    return recruiter;
  }

  public void setRecruiter(String recruiter) {
    this.recruiter = recruiter;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }
}
