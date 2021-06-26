package com.fishercoder;

import com.fishercoder.solutions._792;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _792Test {
    private static _792.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _792.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.numMatchingSubseq("dsahjpjauf", new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.numMatchingSubseq("vvvvvvvvm", new String[]{"vvm", "vm", "vn"}));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.numMatchingSubseq("vvvvvvvvm", new String[]{"vm"}));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.numMatchingSubseq("vvvvvvvvm", new String[]{"vvm"}));
    }

    @Test
    public void test6() {
        assertEquals(51, solution1.numMatchingSubseq("ricogwqznwxxcpueelcobbbkuvxxrvgyehsudccpsnuxpcqobtvwkuvsubiidjtccoqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjscnlhbrhookmioxqighkxfugpeekgtdofwzemelpyjsdeeppapjoliqlhbrbghqjezzaxuwyrbczodtrhsvnaxhcjiyiphbglyolnswlvtlbmkrsurrcsgdzutwgjofowhryrubnxkahocqjzwwagqidjhwbunvlchojtbvnzdzqpvrazfcxtvhkruvuturdicnucvndigovkzrqiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqnhrewhagldzhryzdmmrwnxhaqfezeeabuacyswollycgiowuuudrgzmwnxaezuqlsfvchjfloczlwbefksxsbanrektvibbwxnokzkhndmdhweyeycamjeplecewpnpbshhidnzwopdjuwbecarkgapyjfgmanuavzrxricbgagblomyseyvoeurekqjyljosvbneofjzxtaizjypbcxnbfeibrfjwyjqrisuybfxpvqywqjdlyznmojdhbeomyjqptltpugzceyzenflfnhrptuugyfsghluythksqhmxlmggtcbdddeoincygycdpehteiugqbptyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjckmaptilrbfpjxiarmwalhbdjiwbaknvcqovwcqiekzfskpbhgxpyomekqvzpqyirelpadooxjhsyxjkfqavbaoqqvvknqryhotjritrkvdveyapjfsfzenfpuazdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzqfgqwhgobwyhxltligahroyshfndydvffd",
                new String[]{"iowuuudrgzmw", "azfcxtvhkruvuturdicnucvndigovkzrq", "ylmmo", "maptilrbfpjxiarmwalhbd", "oqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqgl", "ytldcdlxqbaszbuxsacqwqnhrewhagldzhr", "zeeab", "cqie", "pvrazfcxtvhkruvuturdicnucvndigovkzrqiya", "zxnvpluwicurrtshyvevkriudayyysepzq", "wyhxltligahroyshfn", "nhrewhagldzhryzdmmrwn", "yqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmw", "nhrptuugyfsghluythksqhmxlmggtcbdd", "yligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjsc", "zdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzq", "ncygycdpehteiugqbptyqbvokpwovbnplshnzafun", "gdzutwgjofowhryrubnxkahocqjzww", "eppapjoliqlhbrbgh", "qwhgobwyhxltligahroys", "dzutwgjofowhryrubnxkah", "rydhxkdhffyytldcdlxqbaszbuxs", "tyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjc", "khvyjyrydhxkdhffyytldcdlxqbasz", "jajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqn", "ppapjoliqlhbrbghq", "zmwwxzjckmaptilrbfpjxiarm", "nxkahocqjzwwagqidjhwbunvlchoj", "ybfxpvqywqjdlyznmojdhbeomyjqptltp", "udrgzmwnxae", "nqglnpjvwddvdlmjjyzmww", "swlvtlbmkrsurrcsgdzutwgjofowhryrubn", "hudqbfnzxnvpluwicurr", "xaezuqlsfvchjf", "tvibbwxnokzkhndmdhweyeycamjeplec", "olnswlvtlbmkrsurrcsgdzu", "qiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyyt", "eiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwyl", "cgiowuuudrgzmwnxaezuqlsfvchjflocz", "rxric", "cygycdpehteiugqbptyqbvokpwovbnplshnzaf", "g", "surrcsgd", "yzenflfnhrptuugyfsghluythksqh", "gdzutwgjofowhryrubnxkahocqjzwwagqid", "ddeoincygycdpeh", "yznmojdhbeomyjqptltpugzceyzenflfnhrptuug", "ejuisks", "teiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoi", "mrwnxhaqfezeeabuacyswollycgio", "qfskkpfakjretogrokmxemjjbvgmmqrfdxlkfvycwalbdeumav", "wjgjhlrpvhqozvvkifhftnfqcfjmmzhtxsoqbeduqmnpvimagq", "ibxhtobuolmllbasaxlanjgalgmbjuxmqpadllryaobcucdeqc", "ydlddogzvzttizzzjohfsenatvbpngarutztgdqczkzoenbxzv", "rmsakibpprdrttycxglfgtjlifznnnlkgjqseguijfctrcahbb", "pqquuarnoybphojyoyizhuyjfgwdlzcmkdbdqzatgmabhnpuyh", "akposmzwykwrenlcrqwrrvsfqxzohrramdajwzlseguupjfzvd", "vyldyqpvmnoemzeyxslcoysqfpvvotenkmehqvopynllvwhxzr", "ysyskgrbolixwmffygycvgewxqnxvjsfefpmxrtsqsvpowoctw", "oqjgumitldivceezxgoiwjgozfqcnkergctffspdxdbnmvjago", "bpfgqhlkvevfazcmpdqakonkudniuobhqzypqlyocjdngltywn", "ttucplgotbiceepzfxdebvluioeeitzmesmoxliuwqsftfmvlg", "xhkklcwblyjmdyhfscmeffmmerxdioseybombzxjatkkltrvzq", "qkvvbrgbzzfhzizulssaxupyqwniqradvkjivedckjrinrlxgi", "itjudnlqncbspswkbcwldkwujlshwsgziontsobirsvskmjbrq", "nmfgxfeqgqefxqivxtdrxeelsucufkhivijmzgioxioosmdpwx", "ihygxkykuczvyokuveuchermxceexajilpkcxjjnwmdbwnxccl", "etvcfbmadfxlprevjjnojxwonnnwjnamgrfwohgyhievupsdqd", "ngskodiaxeswtqvjaqyulpedaqcchcuktfjlzyvddfeblnczmh", "vnmntdvhaxqltluzwwwwrbpqwahebgtmhivtkadczpzabgcjzx", "yjqqdvoxxxjbrccoaqqspqlsnxcnderaewsaqpkigtiqoqopth", "wdytqvztzbdzffllbxexxughdvetajclynypnzaokqizfxqrjl", "yvvwkphuzosvvntckxkmvuflrubigexkivyzzaimkxvqitpixo", "lkdgtxmbgsenzmrlccmsunaezbausnsszryztfhjtezssttmsr", "idyybesughzyzfdiibylnkkdeatqjjqqjbertrcactapbcarzb", "ujiajnirancrfdvrfardygbcnzkqsvujkhcegdfibtcuxzbpds", "jjtkmalhmrknaasskjnixzwjgvusbozslrribgazdhaylaxobj", "nizuzttgartfxiwcsqchizlxvvnebqdtkmghtcyzjmgyzszwgi", "egtvislckyltpfogtvfbtxbsssuwvjcduxjnjuvnqyiykvmrxl", "ozvzwalcvaobxbicbwjrububyxlmfcokdxcrkvuehbnokkzala", "azhukctuheiwghkalboxfnuofwopsrutamthzyzlzkrlsefwcz", "yhvjjzsxlescylsnvmcxzcrrzgfhbsdsvdfcykwifzjcjjbmmu", "tspdebnuhrgnmhhuplbzvpkkhfpeilbwkkbgfjiuwrdmkftphk", "jvnbeqzaxecwxspuxhrngmvnkvulmgobvsnqyxdplrnnwfhfqq", "bcbkgwpfmmqwmzjgmflichzhrjdjxbcescfijfztpxpxvbzjch", "bdrkibtxygyicjcfnzigghdekmgoybvfwshxqnjlctcdkiunob", "koctqrqvfftflwsvssnokdotgtxalgegscyeotcrvyywmzescq", "boigqjvosgxpsnklxdjaxtrhqlyvanuvnpldmoknmzugnubfoa", "jjtxbxyazxldpnbxzgslgguvgyevyliywihuqottxuyowrwfar", "zqsacrwcysmkfbpzxoaszgqqsvqglnblmxhxtjqmnectaxntvb", "izcakfitdhgujdborjuhtwubqcoppsgkqtqoqyswjfldsbfcct", "rroiqffqzenlerchkvmjsbmoybisjafcdzgeppyhojoggdlpzq", "xwjqfobmmqomhczwufwlesolvmbtvpdxejzslxrvnijhvevxmc", "ccrubahioyaxuwzloyhqyluwoknxnydbedenrccljoydfxwaxy", "jjoeiuncnvixvhhynaxbkmlurwxcpukredieqlilgkupminjaj", "pdbsbjnrqzrbmewmdkqqhcpzielskcazuliiatmvhcaksrusae", "nizbnxpqbzsihakkadsbtgxovyuebgtzvrvbowxllkzevktkuu", "hklskdbopqjwdrefpgoxaoxzevpdaiubejuaxxbrhzbamdznrr", "uccnuegvmkqtagudujuildlwefbyoywypakjrhiibrxdmsspjl", "awinuyoppufjxgqvcddleqdhbkmolxqyvsqprnwcoehpturicf"}));
    }

}