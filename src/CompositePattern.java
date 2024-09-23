import java.util.List;
import java.util.ArrayList;


// Component interface
interface Graphic {
    String draw();
}

// Leaf Component - Circle
class Circle implements Graphic {
    @Override
    public String draw() {
        return "Circle drawn.";
    }
}

// Leaf Component - Rectangle
class Rectangle implements Graphic {
    @Override
    public String draw() {
        return "Rectangle drawn.";
    }
}

// Composite Component
class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public String draw() {
        List<String> results = new ArrayList<>();
        for (Graphic graphic : graphics) {
            results.add(graphic.draw());
        }
        return String.join(", ", results);
    }
}

// Main class
public class CompositePattern {
    public static void main(String[] args) {
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(new Circle());
        composite.add(new Rectangle());

        System.out.println(composite.draw()); // Output: "Circle drawn., Rectangle drawn."
    }
}
