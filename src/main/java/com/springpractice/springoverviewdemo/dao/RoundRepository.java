package com.springpractice.springoverviewdemo.dao;

import com.springpractice.springoverviewdemo.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Round, Integer> {
}
