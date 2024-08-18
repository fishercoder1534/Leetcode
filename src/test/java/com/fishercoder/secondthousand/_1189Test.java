package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1189;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1189Test {
    private _1189.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1189.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.maxNumberOfBalloons("nlaebolko"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.maxNumberOfBalloons("loonbalxballpoon"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.maxNumberOfBalloons("leetcode"));
    }

    @Test
    public void test4() {
        assertEquals(
                10,
                solution1.maxNumberOfBalloons(
                        "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"));
    }
}
