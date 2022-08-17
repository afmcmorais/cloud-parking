package one.digitalinnovation.parking.exception;

import one.digitalinnovation.parking.model.Parking;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotFoundException extends RuntimeException {

    public ParkingNotFoundException(String id) {
        super("Parking not found with id: " + id);
    }

    Parking parking = new Parking();
}
