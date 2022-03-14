package com.devsuperior.dsmovieprofissional.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovieprofissional.entities.Score;
import com.devsuperior.dsmovieprofissional.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
