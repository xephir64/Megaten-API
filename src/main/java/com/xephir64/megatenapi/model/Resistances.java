package com.xephir64.megatenapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Resistances {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "demon_id")
    private Integer demonId;
    @Basic
    @Column(name = "attack_type")
    private String attackType;
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

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
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
        Resistances that = (Resistances) o;
        return id == that.id && Objects.equals(demonId, that.demonId) && Objects.equals(attackType, that.attackType) && Objects.equals(resistanceType, that.resistanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, demonId, attackType, resistanceType);
    }
}
