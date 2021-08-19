package gearth.services.internal_extensions.extensionstore.application.entities.search;

import gearth.services.internal_extensions.extensionstore.GExtensionStore;
import gearth.services.internal_extensions.extensionstore.application.entities.ContentItem;
import gearth.services.internal_extensions.extensionstore.application.entities.HOverview;
import gearth.services.internal_extensions.extensionstore.repository.StoreRepository;

import java.util.Collections;
import java.util.List;

public class SearchOverview extends HOverview {

    private final StoreRepository storeRepository;

    public SearchOverview(HOverview parent, StoreRepository storeRepository) {
        super(null, 0, 1);
        this.storeRepository = storeRepository;
    }


    @Override
    public String buttonText() {
        return null;
    }

    @Override
    public boolean buttonEnabled() {
        return false;
    }

    @Override
    public List<? extends ContentItem> getContentItems() {
        return Collections.singletonList(new SearchComponent());
    }

    @Override
    public int getMaxAmount() {
        return 1;
    }

    @Override
    public void buttonClick(GExtensionStore gExtensionStore) {
        // nothing
    }

    @Override
    public HOverview.Header header() {
        return new Header() {
            @Override
            public String iconUrl() {
                return "images/overviews/search.png";
            }

            @Override
            public String title() {
                return "Search";
            }

            @Override
            public String description() {
                return "Find the extension that fits your needs";
            }

            @Override
            public String contentTitle() {
                return "Search extensions";
            }
        };
    }

    @Override
    public HOverview getNewPage(int startIndex, int size) {
        return null; // impossible
    }

}
