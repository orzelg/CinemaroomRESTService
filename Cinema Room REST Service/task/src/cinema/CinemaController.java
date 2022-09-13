package cinema;

import cinema.domain.CinemaRoom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CinemaController {

    @GetMapping("/seats")
    public CinemaRoom getAvailableSeats() {
        CinemaRoom cinemaRoom;
        cinemaRoom = new CinemaRoom(9, 9, new ArrayList<>());
        return cinemaRoom;
    }
}
