package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
