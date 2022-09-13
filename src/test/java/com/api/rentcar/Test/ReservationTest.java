package com.api.rentcar.Test;

import com.api.rentcar.rents.domain.model.entity.Reservation;
import com.api.rentcar.rents.domain.persistence.ReservationRepository;
import com.api.rentcar.rents.domain.service.ReservationService;
import com.api.rentcar.rents.service.ReservationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.persistence.EntityManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ReservationTest {
    @Mock
    private ReservationRepository reservationRepository;
    @InjectMocks
    private ReservationServiceImpl reservationService;

    @Test
    void AcceptOrNo() throws Exception{
        Reservation reservation=new Reservation();
        Reservation reservation2=new Reservation();
        Reservation reservation3=new Reservation();
        reservation3.setStatus(8);
        /*Assertions.assertEquals(1,reservationService.getById(2L).getCar().getId());*/
        /*when(reservationRepository.findAll()).thenReturn(List.of(reservation, reservation2,reservation3));
        Assertions.assertEquals(2,reservationService.getAll().size());*/

        /*when(reservationRepository.findById(10L)).thenReturn(java.util.Optional.of(reservation3));
        Assertions.assertEquals(5,reservationService.getById(10L).getStatus());*/
        when(reservationRepository.findById(10L)).thenReturn(java.util.Optional.of(reservation3));
        when(reservationRepository.save(reservation)).thenReturn(reservation3);
        Assertions.assertEquals(5,reservationService.updateStatus(10L,1).getStatus());
    }
}
