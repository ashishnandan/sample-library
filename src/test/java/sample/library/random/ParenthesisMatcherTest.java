package sample.library.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesisMatcherTest {

    @Test
    public void matchParenthesis() {
        String input1 = "(ABC)";
        assertTrue(new ParenthesisMatcher().matchParenthesis(input1));

        String input2 = "(ABC){DEF}";
        assertTrue(new ParenthesisMatcher().matchParenthesis(input2));

        String input3 = ")ABC(";
        assertFalse(new ParenthesisMatcher().matchParenthesis(input3));

        String input4 = "[ABC{DEF(GHI)JKL}MNO]";
        assertTrue(new ParenthesisMatcher().matchParenthesis(input4));

        String input5 = "[ABC{DEF(GHI)JKL}}MNO]";
        assertFalse(new ParenthesisMatcher().matchParenthesis(input5));

        String input6 = "[ABC{DEF(GHI)JKL}(MNO)]";
        assertTrue(new ParenthesisMatcher().matchParenthesis(input6));

    }
}