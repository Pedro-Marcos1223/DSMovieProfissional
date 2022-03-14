package com.devsuperior.dsmovieprofissional.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovieprofissional.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
