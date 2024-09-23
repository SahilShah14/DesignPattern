// Strategy interface
interface RouteStrategy {
    String buildRoute(String start, String end);
}

// Concrete Strategy-Fastest Route
class FastestRoute implements RouteStrategy {
    @Override
    public String buildRoute(String start, String end) {
        return "Fastest route from " + start + " to " + end;
    }
}

// Concrete Strategy - Scenic Route
class ScenicRoute implements RouteStrategy {
    @Override
    public String buildRoute(String start, String end) {
        return "Scenic route from " + start + " to " + end;
    }
}

// Context class
class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public String navigate(String start, String end) {
        return strategy.buildRoute(start, end);
    }
}

// Main class
public class StrategyPattern {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new FastestRoute());
        System.out.println(navigator.navigate("A", "B"));

        navigator.setStrategy(new ScenicRoute());
        System.out.println(navigator.navigate("A", "B"));
    }
}
