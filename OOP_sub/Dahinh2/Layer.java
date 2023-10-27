import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<Shape>();
    }

    /**
     * .
     * @param newShape 1
     */
    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /**
     * .
     * @return res
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            info += shape.toString() + "\n";
        }
        return info;
    }

    /**
     * .
     * @return res
     */
    private int containCircle() {
        int index = 0;
        for (Shape shape : shapes) {
            if (shape.getClass() == Circle.class) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * .
     */
    public void removeCircles() {
        int index = 0;
        do {
            index = containCircle();
            if (index != -1) {
                shapes.remove(index);
            } else {
                break;
            }
        } while (index != -1);
    }

    /**
     * .
     */
    public void removeDuplicates() {
        for (int index = 0; index < shapes.size() - 1; index++) {
            List<Integer> duplicateIndex = new ArrayList<Integer>();
            for (int objIndex = index + 1; objIndex < shapes.size(); objIndex++) {
                if (shapes.get(index).equals(shapes.get(objIndex))) {
                    duplicateIndex.add(objIndex);
                }
            }

            if (duplicateIndex.isEmpty()) {
                continue;
            }

            for (int objIndex : duplicateIndex) {
                shapes.remove(objIndex);
            }
        }
    }
}