package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class ReservationTest {

    @ParameterizedTest
    @CsvSource({"double, 124, 1, false"})
    public void ifReservationCriteriaMet_ReturnProperTotal(String roomType, double roomPrice, int nightsStayed, boolean isWeekend) {
        Reservation reservation = new Reservation(roomType, nightsStayed, isWeekend);
        var reservationTotal = reservation.calculateReservationTotal();
        if (isWeekend) {
           double weekendTax = .10;
            assertEquals(reservationTotal, roomPrice * nightsStayed * weekendTax);
        }
        else{
            assertEquals(reservationTotal, roomPrice * nightsStayed);
        }

    }

}