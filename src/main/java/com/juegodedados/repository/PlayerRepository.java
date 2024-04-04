package com.juegodedados.repository;

import com.juegodedados.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    static Player findByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }
}