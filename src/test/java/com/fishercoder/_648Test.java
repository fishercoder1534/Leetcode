package com.fishercoder;

import com.fishercoder.solutions._648;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _648Test {
    private static _648.Solution1 solution1;
    private static List<String> dict;
    private static String sentence;

    @BeforeClass
    public static void setup() {
        solution1 = new _648.Solution1();
    }

    @Test
    public void test1() {
        dict = Arrays.asList("cat", "bat", "rat");
        sentence = "the cattle was rattled by the battery";
        assertEquals("the cat was rat by the bat", solution1.replaceWords(dict, sentence));
    }

    @Test
    public void test2() {
        dict = Arrays.asList("e", "k", "c", "harqp", "h", "gsafc", "vn", "lqp", "soy", "mr", "x",
                "iitgm", "sb", "oo", "spj", "gwmly", "iu", "z", "f", "ha", "vds",
                "v", "vpx", "fir", "t", "xo", "apifm", "tlznm", "kkv", "nxyud", "j",
                "qp", "omn", "zoxp", "mutu", "i", "nxth", "dwuer", "sadl", "pv", "w",
                "mding", "mubem", "xsmwc", "vl", "farov", "twfmq", "ljhmr", "q", "bbzs",
                "kd", "kwc", "a", "buq", "sm", "yi", "nypa", "xwz", "si", "amqx", "iy", "eb",
                "qvgt", "twy", "rf", "dc", "utt", "mxjfu", "hm", "trz", "lzh", "lref", "qbx",
                "fmemr", "gil", "go", "qggh", "uud", "trnhf", "gels", "dfdq", "qzkx", "qxw");
        sentence = "ikkbp miszkays wqjferqoxjwvbieyk gvcfldkiavww vhokchxz dvypwyb "
                + "bxahfzcfanteibiltins ueebf lqhflvwxksi dco kddxmckhvqifbuzkhstp wc "
                + "ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy ifvifheoxqlbosfww mengfdydekwttkhbzenk wjhmmyltmeufqvcpcxg "
                + "hthcuovils ldipovluo aiprogn nusquzpmnogtjkklfhta klxvvlvyh nxzgnrveghc mpppfhzjkbucv cqcft "
                + "uwmahhqradjtf iaaasabqqzmbcig zcpvpyypsmodtoiif qjuiqtfhzcpnmtk yzfragcextvx ivnvgkaqs "
                + "iplazv jurtsyh gzixfeugj rnukjgtjpim hscyhgoru aledyrmzwhsz xbahcwfwm hzd ygelddphxnbh "
                + "rvjxtlqfnlmwdoezh zawfkko iwhkcddxgpqtdrjrcv bbfj mhs nenrqfkbf spfpazr "
                + "wrkjiwyf cw dtd cqibzmuuhukwylrnld dtaxhddidfwqs bgnnoxgyynol hg "
                + "dijhrrpnwjlju muzzrrsypzgwvblf zbugltrnyzbg hktdviastoireyiqf qvufxgcixvhrjqtna ipfzhuvgo daee "
                + "r nlipyfszvxlwqw yoq dewpgtcrzausqwhh qzsaobsghgm ichlpsjlsrwzhbyfhm ksenb "
                + "bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala qmxixtooxtbrzyorn gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn "
                + "frotscysdyclrc ckcttaceuuxzcghw pxbd oklwhcppuziixpvihihp";
        assertEquals("i miszkays w gvcfldkiavww v dvypwyb bxahfzcfanteibiltins ueebf "
                + "lqhflvwxksi dc k w ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy i mengfdydekwttkhbzenk w "
                + "h ldipovluo a nusquzpmnogtjkklfhta k nxzgnrveghc mpppfhzjkbucv c uwmahhqradjtf i z "
                + "q yzfragcextvx i i j gzixfeugj rnukjgtjpim h a x h "
                + "ygelddphxnbh rvjxtlqfnlmwdoezh z i bbfj mhs nenrqfkbf "
                + "spfpazr w c dtd c dtaxhddidfwqs bgnnoxgyynol h "
                + "dijhrrpnwjlju muzzrrsypzgwvblf z h q i daee r nlipyfszvxlwqw "
                + "yoq dewpgtcrzausqwhh q i k bqprarpgnyemzwifqzz "
                + "oai pnqottd nygesjtlpala q gyvukjpc s mxhlkdaycskj "
                + "uvwmerplaibeknltuvd ocnn f c pxbd oklwhcppuziixpvihihp", solution1.replaceWords(dict, sentence));
    }

}
