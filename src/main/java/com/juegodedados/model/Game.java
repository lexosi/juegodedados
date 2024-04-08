package com.juegodedados.model;



import jakarta.persistence.*;

//import org.springframework.boot.autoconfigure.domain.EntityScan;



@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "player_id")
    private int playerId;
    @Column(name = "dice1")
    private int dice1;
    @Column(name = "dice2")
    private int dice2;
    @Column(name = "win")
    private boolean win;

    public Game() {}

    public Game(int playerId, int dice1, int dice2, boolean win) {
        this.playerId = playerId;
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.win = win;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}