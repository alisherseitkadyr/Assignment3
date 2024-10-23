import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private CharacterFactory characterFactory;
    private List<CharacterPosition> characterPositions = new ArrayList<>();

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    private class CharacterPosition {
        Character character;
        int x;
        int y;

        CharacterPosition(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        public void render() {
            character.render(x, y);
        }
    }

    public void insert(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        characterPositions.add(new CharacterPosition(character, x, y));
    }

    public void render() {
        for (CharacterPosition cp : characterPositions) {
            cp.render();
        }
    }
}
