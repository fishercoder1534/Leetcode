package com.fishercoder;

import com.fishercoder.solutions._734;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _734Test {
    private static _734.Solution1 solution1;
    private static String[] words1;
    private static String[] words2;
    private static String[][] pairs;

    @BeforeClass
    public static void setup() {
        solution1 = new _734.Solution1();
    }

    @Test
    public void test1() {
        words1 = new String[]{"great", "acting", "skills"};
        words2 = new String[]{"fine", "drama", "talent"};
        pairs = new String[][]{
                {"great", "fine"},
                {"acting", "drama"},
                {"skills", "talent"}
        };
        assertEquals(true, solution1.areSentencesSimilar(words1, words2, pairs));
    }

    @Test
    public void test2() {
        String[] words1 = new String[]{"one", "excellent", "meal"};
        String[] words2 = new String[]{"one", "good", "dinner"};
        String[][] pairs = new String[][]{
                {"great", "good"},
                {"extraordinary", "good"},
                {"well", "good"},
                {"wonderful", "good"},
                {"excellent", "good"},
                {"dinner", "meal"},
                {"fine", "good"},
                {"nice", "good"},
                {"any", "one"},
                {"unique", "one"},
                {"some", "one"},
                {"the", "one"},
                {"an", "one"},
                {"single", "one"},
                {"a", "one"},
                {"keep", "own"},
                {"truck", "car"},
                {"super", "very"},
                {"really", "very"},
                {"actually", "very"},
                {"extremely", "very"},
                {"have", "own"},
                {"possess", "own"},
                {"lunch", "meal"},
                {"super", "meal"},
                {"food", "meal"},
                {"breakfast", "meal"},
                {"brunch", "meal"},
                {"wagon", "car"},
                {"automobile", "car"},
                {"auto", "car"},
                {"fruits", "meal"},
                {"vehicle", "car"},
                {"entertain", "have"},
                {"drink", "have"},
                {"eat", "have"},
                {"take", "have"},
        };
        assertEquals(true, solution1.areSentencesSimilar(words1, words2, pairs));
    }

}