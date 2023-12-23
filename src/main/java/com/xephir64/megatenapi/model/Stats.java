package com.xephir64.megatenapi.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Stats {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "demon_id")
    private Integer demonId;
    @Basic
    @Column(name = "strength")
    private int strength;
    @Basic
    @Column(name = "vitality")
    private int vitality;
    @Basic
    @Column(name = "magic")
    private int magic;
    @Basic
    @Column(name = "agility")
    private int agility;
    @Basic
    @Column(name = "luck")
    private int luck;

    public void setId(int id) {
        this.id = id;
    }

    public void setDemonId(Integer demonId) {
        this.demonId = demonId;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return id == stats.id && strength == stats.strength && vitality == stats.vitality && magic == stats.magic && agility == stats.agility && luck == stats.luck && Objects.equals(demonId, stats.demonId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, demonId, strength, vitality, magic, agility, luck);
    }
}
