package org.kata.tania;


import java.util.*;


public class BracketValidator {

    /**
     * Validates the proper nesting of braces, brackets, and parentheses in the given input string.
     * <p>
     * Returns a boolean to determine whether all openers '(', '{', '[' and their corresponding
     * closers ')', '}', ']' in the input string are properly nested and balanced.
     * <p>
     * The input string can contain any characters, but only the brackets are considered for validation.
     *
     * @param input the string to validate for proper nesting of brackets
     * @return {@code true} if the input string's openers and closers are properly nested;
     * {@code false} otherwise
     */
    public boolean validate(String input) {

        //creating map of bracket pairs
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');


        // empty stack
        Stack<Character> stack = new Stack<>();





        for (char ch : input.toCharArray()) {

            //Opening Brackets are pushed into the stack
            if (brackets.containsKey(ch)) {
                stack.push(ch);}

            // Ignore Characters in Alphabet
            else if (Character.isLowerCase(ch)){
                continue;}

            //Closing Brackets are popped and compared to the original
           if (brackets.containsValue(ch)) {

               // top of the Stack
               char top = stack.peek();

               if (stack.isEmpty()){return false;}

               if (ch != brackets.get(top)){
                   return false;}


               stack.pop();
           }


        }
       return true;



    }


    public static void main(String[] args) {
        BracketValidator validator = new BracketValidator();
        validator.validate("()");
    }
}
