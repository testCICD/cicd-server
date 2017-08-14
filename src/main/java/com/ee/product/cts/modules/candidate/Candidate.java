package com.ee.product.cts.modules.candidate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity()
public class Candidate {
  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String location;
  private String recruiter;

  private ArrayList<String> skills;

  public Candidate() {}

  public Candidate(String name, String location, String recruiter, ArrayList<String> skills) {
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

  public ArrayList<String> getSkills() {
    return skills;
  }

  public void setSkills(ArrayList<String> skills) {
    this.skills = skills;
  }

  public int getId() {
    return id;
  }
}
