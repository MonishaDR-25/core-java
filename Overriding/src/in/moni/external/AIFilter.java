package in.moni.external;

import in.moni.internal.Filter;

public class AIFilter extends Filter {
    @Override
    public void apply() {
        System.out.println("Applying neural network filter");
    }

    public void enhanceDetails() {
        System.out.println("Enhancing image details with AI");
    }
}

