package com.devsuperior.desafiomodelodedominioeorm.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "tb_activity")
public class Activity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String description;
  private Double price;
  @ManyToOne
  private Category category;
  @ManyToMany
  @JoinTable(
      name = "tb_activity_participant",
      joinColumns = @JoinColumn(name = "activity_id"),
      inverseJoinColumns = @JoinColumn(name = "participant_id")
  )
  private Set<Participant> participants = new HashSet<>();
  @OneToMany(mappedBy = "activity")
  private Set<Block> blocks = new HashSet<>();

  public Activity() {
  }

  public Activity(Integer id, String name, String description, Double price, Category category, Set<Participant> participants, Set<Block> blocks) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.category = category;
    this.participants = participants;
    this.blocks = blocks;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Set<Participant> getParticipants() {
    return participants;
  }

  public Set<Block> getBlocks() {
    return blocks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Activity activity = (Activity) o;
    return Objects.equals(id, activity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
