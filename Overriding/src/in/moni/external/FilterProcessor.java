package in.moni.external;

import in.moni.internal.Filter;

public class FilterProcessor {
    public void process(Filter filter){
        if(filter!=null) {
            filter.apply();
            if (filter instanceof AIFilter) {
                AIFilter aiFilter = (AIFilter) filter;
                aiFilter.enhanceDetails();
            } else {
                System.err.println("This is not a ai filter");
            }
        }
        else{
            System.err.println("Filter is null");
            }

    }
}
