package e3;

import java.util.ArrayList;
import java.util.List;

class Folder implements Component {
    private List<Component> components = new ArrayList<>();

    public void agregarArchivo(Component component) {
        components.add(component);
    }

    public void eliminarArchivo(Component component) {
        components.remove(component);
    }

    public int getNumPalabras() {
        int total = 0;
        for (Component component : components) {
            total += component.getNumPalabras();
        }
        return total;
    }
}
