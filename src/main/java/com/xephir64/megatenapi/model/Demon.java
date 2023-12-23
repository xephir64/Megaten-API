package com.xephir64.megatenapi.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
@Table(name = "demons")
public class Demon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "race")
    private String race;
    @Basic
    @Column(name = "level")
    private int level;
    @Basic
    @Column(name = "hp")
    private int hp;
    @Basic
    @Column(name = "mp")
    private int mp;
    @Basic
    @Column(name = "game")
    private String game;
    @Basic
    @Column(name = "lore")
    private String lore;
    @Basic
    @Column(name = "moral_alignment")
    private String moralAlignment;
    @Basic
    @Column(name = "ethical_alignment")
    private String ethicalAlignment;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public void setMoralAlignment(String moralAlignment) {
        this.moralAlignment = moralAlignment;
    }

    public void setEthicalAlignment(String ethicalAlignment) {
        this.ethicalAlignment = ethicalAlignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demon demon = (Demon) o;
        return id == demon.id && level == demon.level && hp == demon.hp && mp == demon.mp && Objects.equals(name, demon.name) && Objects.equals(race, demon.race) && Objects.equals(game, demon.game) && Objects.equals(lore, demon.lore) && Objects.equals(moralAlignment, demon.moralAlignment) && Objects.equals(ethicalAlignment, demon.ethicalAlignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, race, level, hp, mp, game, lore, moralAlignment, ethicalAlignment);
    }
}
