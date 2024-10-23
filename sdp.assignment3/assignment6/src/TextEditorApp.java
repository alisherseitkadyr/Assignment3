public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor textEditor = new TextEditor(characterFactory);

        textEditor.insert('H', "Arial", 12, 0, 0);
        textEditor.insert('e', "Arial", 12, 10, 0);
        textEditor.insert('l', "Arial", 12, 20, 0);
        textEditor.insert('l', "Arial", 12, 30, 0);
        textEditor.insert('o', "Arial", 12, 40, 0);

        textEditor.insert('W', "Times", 14, 0, 20);
        textEditor.insert('o', "Times", 14, 10, 20);
        textEditor.insert('r', "Times", 14, 20, 20);
        textEditor.insert('l', "Times", 14, 30, 20);
        textEditor.insert('d', "Times", 14, 40, 20);

        textEditor.render();
    }
}