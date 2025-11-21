package Prototype;
import java.util.HashMap;
import java.util.Map;

public class ToolPanel {
    private Map<String, GraphicObject> prototypes = new HashMap<>();

    public void addPrototype(String name, GraphicObject obj) {
        prototypes.put(name, obj);
    }

    public GraphicObject clickButton(String name, int x, int y) {
        GraphicObject proto = prototypes.get(name);
        if (proto == null) return null;

        GraphicObject newObj = proto.clone();
        newObj.setPosition(x, y);
        return newObj;
    }
}
