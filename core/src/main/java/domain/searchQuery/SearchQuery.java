package domain.searchQuery;

import lombok.Data;

import java.util.Set;

@Data
public class SearchQuery {
    Set<Route> routes;
}
