public class UC7_CharacterPatternMap {

    // Static Inner Class to store character and its pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern mappings
        CharacterPatternMap[] bannerMap = {

            new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            })
        };

        String word = "OOPS";

        // Display banner
        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap map : bannerMap) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}