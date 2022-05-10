package com.twitter.api.repository;

import com.twitter.api.model.PortafolioVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterRepository extends JpaRepository<PortafolioVo, Integer> {
}
