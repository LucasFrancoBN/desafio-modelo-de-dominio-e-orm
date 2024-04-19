package com.devsuperior.desafiomodelodedominioeorm.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "tb_category")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(columnDefinition = "TEXT")
  private String description;
  @OneToMany(mappedBy = "category")
  private Set<Activity> activities = new HashSet<>();

  public Category() {
  }

  public Category(Integer id, String description, Set<Activity> activities) {
    this.id = id;
    this.description = description;
    this.activities = activities;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Set<Activity> getActivities() {
    return activities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Category category = (Category) o;
    return Objects.equals(id, category.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
