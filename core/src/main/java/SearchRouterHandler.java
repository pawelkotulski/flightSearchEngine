import com.google.common.collect.Lists;
import domain.searchQuery.SearchQuery;
import event.EventBus;
import event.SearchEvent;

import java.util.List;

public class SearchRouterHandler {

    private EventBus eventBus;


    public void handleSearchRequest(SearchQuery searchQuery) {
        List<SearchEvent> searchEventList = getSearchProviderEvents();
        searchEventList.forEach(e -> eventBus.sendEvent(e));
    }

    public List<SearchEvent> getSearchProviderEvents() {
        return Lists.newArrayList(SearchEvent.builder().build());
    }
}
