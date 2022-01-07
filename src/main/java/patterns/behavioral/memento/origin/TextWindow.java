package patterns.behavioral.memento.origin;

import lombok.Getter;
import patterns.behavioral.memento.mementoState.TextWindowState;

public class TextWindow {
    @Getter
    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextWindowState createState() {
        return new TextWindowState(currentText.toString());
    }

    public void restoreState(TextWindowState textWindowState) {
        this.currentText = new StringBuilder(textWindowState.getStateText());
    }
}
