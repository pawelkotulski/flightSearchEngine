package domain.searchQuery;

import domain.location.Location;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Route {
    LocalDateTime departureDate;
    Location from;
    Location to;
}
