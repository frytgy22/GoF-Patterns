package patterns.behavioral.memento;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.memento.origin.TextWindow;
import patterns.behavioral.memento.takecare.Editor;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor(new TextWindow());

        editor.writeText("hello\n");
        editor.saveText(1);

        editor.writeText("world\n");
        editor.saveText(2);

        editor.writeText("new word");
        editor.saveText(3);
        log.info(editor.getAllText());

        editor.undoText(1);
        log.info(editor.getAllText());

        editor.undoText(3);
        log.info(editor.getAllText());
    }
}
