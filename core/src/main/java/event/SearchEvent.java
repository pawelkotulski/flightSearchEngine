package event;

import domain.searchQuery.SearchQuery;
import lombok.Builder;

@Builder
public class SearchEvent {
    SearchQuery searchQuery;
}
