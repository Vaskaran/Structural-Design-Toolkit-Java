package decorator.common;

import decorator.addon.Gym;
import decorator.addon.SwimmingPool;

public class AdvancedHome extends SwimmingPool {
    public AdvancedHome(Home home) {
        super(new Gym(home));
    }
}

