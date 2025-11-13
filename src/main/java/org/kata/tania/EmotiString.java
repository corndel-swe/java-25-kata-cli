package org.kata.tania;

import java.util.HashMap;
import java.util.Map;

public class EmotiString {

    /**
     * Returns a string with specific words replaced by emoticons.
     * Given a sentence as a string, replace the words "smile," "grin," "sad," and "mad" with their corresponding emoticons:
     * - "smile" -> ":)"
     * - "grin" -> ":D"
     * - "sad" -> ":("
     * - "mad" -> ":@"
     *
     * @param sentence the input string to update
     * @return {@code String} a string with the specified words replaced by emoticons
     */
    public String emotify(String sentence) {
        Map<String, String> emojis = new HashMap<>();
        emojis.put("smile", ":)");
        emojis.put("grin", ":D");
        emojis.put("sad", ":(");
        emojis.put("mad", ":@");


// Located the value of the emoji, now need to concatenate with the existing sentence string
        StringBuilder sb = new StringBuilder();

        // Problem when looping, returns letters instead of words, resolved using sentence.split method!

        for (String word : sentence.split(" ")) {
            if (emojis.containsKey(word)) {
                sb.append(emojis.get(word));
            }
            else {
                sb.append(word); // else necessary to piecing the sentence together, otherwise returns the emoji
            }
            sb.append(" ");



        }


        return sb.toString().trim(); }
}

