package com.api.rentcar.rents.domain.persistence;

import com.api.rentcar.rents.domain.model.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent,Long> {
    @Query(value="select RE.*from reservations as R " +
            "inner join rents as RE on RE.reservation_id=R.id " +
            "where R.client_id=?1 group by R.client_id; ", nativeQuery = true)
    List<Rent> getRentsByClientId(Long clientId);
}
