package com.xephir64.megatenapi.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
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

    public void setId(int id) {
        this.id = id;
    }

    public void setDemonId(Integer demonId) {
        this.demonId = demonId;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
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
