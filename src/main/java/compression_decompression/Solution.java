package compression_decompression;

import java.util.Stack;

public class Solution {
    //2[3[a]b]
    //3[abc]4[ab]c
    public String decompress(String compressedForm) {

        char[] compressed = compressedForm.toCharArray();
        for(int i = 0; i < compressed.length ; i++ ) {
            Stack brackets;

            if(isOpeningBracket(compressed[i])) {

            }
        }

        return null;
    }

    private boolean isOpeningBracket(char c) {
        return c == '[';
    }
}
