package com.springpractice.springoverviewdemo.dao;

import com.springpractice.springoverviewdemo.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Round, Integer> {

    @Query(value = "SELECT SUM(r.amount) FROM Round r WHERE r.roundId IN (1, 2, 3, 4)")
    public Double sumOfFour();
}
