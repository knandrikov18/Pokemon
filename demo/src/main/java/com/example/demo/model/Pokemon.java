package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Pokemon")
public class Pokemon {
    @Id
    @GeneratedValue
    private int pokemonId;
    @Column(name="PookemonName")
    private String pokemonName;
    @Column(name="Color")
    private String pokemonColor;
    @Column(name = "Type")
    private String pokemonType;
    @Column(name = "Size")
    private double size;
    @Column(name = "LifePoints")
    private double lifePointsPokemon;
    @Column(name = "AttackPoints")
    private double attackPoints;
    @Column(name = "DeffensePoints")
    private double deffensivePointsOfPokemon;

    public Pokemon(){

    }

    public int getPokemonId() {
        return pokemonId;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonColor() {
        return pokemonColor;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public double getSize() {
        return size;
    }

    public double getLifePointsPokemon() {
        return lifePointsPokemon;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public double getDeffensivePointsOfPokemon() {
        return deffensivePointsOfPokemon;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public void setPokemonColor(String pokemonColor) {
        this.pokemonColor = pokemonColor;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setLifePointsPokemon(double lifePointsPokemon) {
        this.lifePointsPokemon = lifePointsPokemon;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void setDeffensivePointsOfPokemon(double deffensivePointsOfPokemon) {
        this.deffensivePointsOfPokemon = deffensivePointsOfPokemon;
    }
}
