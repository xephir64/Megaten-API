package com.xephir64.megatenapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Ailments {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "demon_id")
    private Integer demonId;
    @Basic
    @Column(name = "ailment_type")
    private String ailmentType;
    @Basic
    @Column(name = "resistance_type")
    private String resistanceType;

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

    public String getAilmentType() {
        return ailmentType;
    }

    public void setAilmentType(String ailmentType) {
        this.ailmentType = ailmentType;
    }

    public String getResistanceType() {
        return resistanceType;
    }

    public void setResistanceType(String resistanceType) {
        this.resistanceType = resistanceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ailments ailments = (Ailments) o;
        return id == ailments.id && Objects.equals(demonId, ailments.demonId) && Objects.equals(ailmentType, ailments.ailmentType) && Objects.equals(resistanceType, ailments.resistanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, demonId, ailmentType, resistanceType);
    }
}
