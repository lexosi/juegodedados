CREATE DATABASE IF NOT EXISTS dice_game;

USE dice_game;

CREATE TABLE IF NOT EXISTS players (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS games (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player_id INT,
    dice1 INT,
    dice2 INT,
    win BOOLEAN,
    FOREIGN KEY (player_id) REFERENCES players(id)
);