DROP DATABASE if EXISTS Megaten;
CREATE DATABASE Megaten;

USE Megaten;

CREATE TABLE Demons (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    race VARCHAR(50) NOT NULL,
    level INT NOT NULL,
    hp INT NOT NULL,
    mp INT NOT NULL,
    game VARCHAR(10) NOT NULL,
    lore TEXT,
    moral_alignment VARCHAR(10) NOT NULL,
    ethical_alignment VARCHAR(10) NOT NULL
);

CREATE TABLE Affinities (
    id INT AUTO_INCREMENT PRIMARY KEY,
    demon_id INT,
    skill_type VARCHAR(20) NOT NULL,
    affinity INT NOT NULL,
    inherit VARCHAR(20),
    FOREIGN KEY (demon_id) REFERENCES Demons(id)
);

CREATE TABLE Stats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    demon_id INT,
    strength INT NOT NULL,
    vitality INT NOT NULL,
    magic INT NOT NULL,
    agility INT NOT NULL,
    luck INT NOT NULL,
    FOREIGN KEY (demon_id) REFERENCES Demons(id)
);

CREATE TABLE Learnset (
    id INT AUTO_INCREMENT PRIMARY KEY,
    demon_id INT,
    skill_name VARCHAR(255) NOT NULL,
    level_learned INT NOT NULL,
    FOREIGN KEY (demon_id) REFERENCES Demons(id)
);

CREATE TABLE Resistances (
    id INT AUTO_INCREMENT PRIMARY KEY,
    demon_id INT,
    attack_type VARCHAR(20) NOT NULL,
    resistance_type VARCHAR(20) NOT NULL,
    FOREIGN KEY (demon_id) REFERENCES Demons(id)
);

CREATE TABLE Ailments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    demon_id INT,
    ailment_type VARCHAR(20) NOT NULL,
    resistance_type VARCHAR(20) NOT NULL,
    FOREIGN KEY (demon_id) REFERENCES Demons(id)
)
