package com.Gleb.BykanovR.repo;

import com.Gleb.BykanovR.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
