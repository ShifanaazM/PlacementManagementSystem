package net.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.model.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long>{

}
