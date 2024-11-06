package com.alextechsolutions.travelinsightsversion2_1.Repository;

import com.alextechsolutions.travelinsightsversion2_1.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    public Users findByUsername(String username);
}
