package com.xephir64.megatenapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Affinities {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "demon_id")
    private Integer demonId;
    @Basic
    @Column(name = "skill_type")
    private String skillType;
    @Basic
    @Column(name = "affinity")
    private int affinity;
    @Basic
    @Column(name = "inherit")
    private String inherit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDemonId() {
        return demonId;
    }

    public void setDemonId(Integer demonId) {
        this.demonId = demonId;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public int getAffinity() {
        return affinity;
    }

    public void setAffinity(int affinity) {
        this.affinity = affinity;
    }

    public String getInherit() {
        return inherit;
    }

    public void setInherit(String inherit) {
        this.inherit = inherit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affinities that = (Affinities) o;
        return id == that.id && affinity == that.affinity && Objects.equals(demonId, that.demonId) && Objects.equals(skillType, that.skillType) && Objects.equals(inherit, that.inherit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, demonId, skillType, affinity, inherit);
    }
}
