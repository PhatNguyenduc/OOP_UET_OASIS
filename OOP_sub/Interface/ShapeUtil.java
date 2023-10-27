import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * .
     * @param shapes 1
     * @return res
     */
    public String printInfo(List<GeometricObject> shapes) {
        String c = "Circle:\n";
        String t = "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                c += shape.getInfo() + "\n";
            } else if (shape instanceof Triangle) {
                t += shape.getInfo() + "\n";

                }
            }
        String res = c + t;
        return res;
    }


}