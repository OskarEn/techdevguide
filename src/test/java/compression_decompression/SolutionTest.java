package compression_decompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decompress() {
        assertEquals("Didn't match the expected outcome", "abcabcabcababababc", new Solution().decompress("3[abc]4[ab]c"));
    }
}