package patterns.behavioral.memento.takecare;

import patterns.behavioral.memento.mementoState.TextWindowState;
import patterns.behavioral.memento.origin.TextWindow;

import java.util.HashMap;
import java.util.Map;

public class Editor {
    private final TextWindow textWindow;
    private final Map<Integer, TextWindowState> states = new HashMap<>();

    public Editor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void saveText(int version) {
        states.put(version, textWindow.createState());
    }

    public void undoText(int version) {
        if (states.containsKey(version)) {
            textWindow.restoreState(states.get(version));
        }
    }

    public void writeText(String text) {
        textWindow.addText(text);
    }

    public String getAllText() {
        return textWindow.getCurrentText().toString();
    }
}
