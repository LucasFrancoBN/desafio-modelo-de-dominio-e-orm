package com.devsuperior.desafiomodelodedominioeorm.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_block")
public class Block {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant initialized;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant finalized;
  @ManyToOne
  private Activity activity;

  public Block() {
  }

  public Block(Integer id, Instant initialized, Instant finalized, Activity activity) {
    this.id = id;
    this.initialized = initialized;
    this.finalized = finalized;
    this.activity = activity;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Instant getInitialized() {
    return initialized;
  }

  public void setInitialized(Instant initialized) {
    this.initialized = initialized;
  }

  public Instant getFinalized() {
    return finalized;
  }

  public void setFinalized(Instant finalized) {
    this.finalized = finalized;
  }

  public Activity getActivity() {
    return activity;
  }
  public void setActivity(Activity activity) {
    this.activity = activity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Block block = (Block) o;
    return Objects.equals(id, block.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
