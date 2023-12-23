package com.xephir64.megatenapi.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Learnset {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "demon_id")
    private Integer demonId;
    @Basic
    @Column(name = "skill_name")
    private String skillName;
    @Basic
    @Column(name = "level_learned")
    private int levelLearned;

    public void setId(int id) {
        this.id = id;
    }

    public void setDemonId(Integer demonId) {
        this.demonId = demonId;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setLevelLearned(int levelLearned) {
        this.levelLearned = levelLearned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Learnset learnset = (Learnset) o;
        return id == learnset.id && levelLearned == learnset.levelLearned && Objects.equals(demonId, learnset.demonId) && Objects.equals(skillName, learnset.skillName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, demonId, skillName, levelLearned);
    }
}
