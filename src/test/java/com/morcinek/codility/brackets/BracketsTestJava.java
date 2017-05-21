package com.morcinek.codility.brackets;

import java.util.Stack;

/**
 * Tomasz Morcinek 2017
 */
public class BracketsTestJava extends BracketsTest {

    public int solution(String S) {
        if (S.length() % 2 != 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        for (Character character : S.toCharArray()) {
            Character stackCharacter = peekOrNull(stack);
            if (stackCharacter == null || opening(character)) {
                stack.push(character);
            } else if (conform(stackCharacter, character)) {
                stack.pop();
            } else {
                return 0;
            }
        }
        return stack.empty() ? 1 : 0;
    }

    private boolean opening(Character character) {
        switch (character) {
            case '{':
            case '[':
            case '(':
                return true;
            default:
                return false;
        }
    }

    private boolean conform(Character stackCharacter, Character character) {
        switch (stackCharacter) {
            case '{':
                return character.equals('}');
            case '[':
                return character.equals(']');
            case '(':
                return character.equals(')');
            default:
                return false;
        }
    }

    private Character peekOrNull(Stack<Character> stack) {
        return stack.empty() ? null : stack.peek();
    }
}
