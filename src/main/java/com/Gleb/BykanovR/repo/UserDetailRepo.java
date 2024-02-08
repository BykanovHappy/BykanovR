package com.Gleb.BykanovR.repo;

import com.Gleb.BykanovR.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<User, String> {
}
