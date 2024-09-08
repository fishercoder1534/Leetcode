package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2284;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2284Test {
    private _2284.Solution1 solution1;
    private static String[] messages;
    private static String[] senders;

    @BeforeEach
    public void setup() {
        solution1 = new _2284.Solution1();
    }

    @Test
    public void test1() {
        messages =
                new String[] {
                    "Hello userTwooo", "Hi userThree", "Wonderful day Alice", "Nice day userThree"
                };
        senders = new String[] {"Alice", "userTwo", "userThree", "Alice"};
        assertEquals("Alice", solution1.largestWordCount(messages, senders));
    }

    @Test
    public void test2() {
        messages = new String[] {"How is leetcode for everyone", "Leetcode is useful for practice"};
        senders = new String[] {"Bob", "Charlie"};
        assertEquals("Charlie", solution1.largestWordCount(messages, senders));
    }

    @Test
    public void test3() {
        messages =
                new String[] {
                    "Ux i E XMm",
                    "G Mo f q Qa q",
                    "v qZ J m R",
                    "z pt T yG W xq Xq G",
                    "GS F Ug",
                    "QDv",
                    "I iY k pd M",
                    "aOi",
                    "f xV xa",
                    "c Zu Fa ofO",
                    "x c E R H",
                    "pw sfU",
                    "i aE G Aqw",
                    "Yu S di sV sx mc AlB",
                    "D lx g cF k",
                    "U fw rh Ne",
                    "I aN o Sv aE s",
                    "ZF c Jo IA",
                    "Y S f Ld D M fbb",
                    "OI Mn e Q A gT",
                    "xV f Li v h vy I S",
                    "Q gI G vj Qd c y r W",
                    "Q R BK VI",
                    "K Am NZ",
                    "wk CT",
                    "p sQ b Se l BI We fv",
                    "x WF fW l n px WY rz",
                    "S rW mh",
                    "a T og TA b Gg h",
                    "t v WO",
                    "Ai bO mY",
                    "e AMh",
                    "t nfH",
                    "q F G ch N",
                    "sf W iH yx M Pf YjA",
                    "uE D",
                    "hA F q NX",
                    "Fm",
                    "lI C Vl Em md d L",
                    "az kz i bx g v dD",
                    "Fq UR qf hh",
                    "C r Nq u Ve i",
                    "x tT BR Bj d a yu G",
                    "Nm M DM h Wu",
                    "IZ y Lo ZN Yv",
                    "l Kh ia Rt",
                    "VR cg C fM mL MH",
                    "a P e Gb",
                    "Xq UO",
                    "U qM",
                    "h bM mn e a",
                    "WD w VT Tf dK G YPE",
                    "cT T wc O VLT",
                    "e q K e Ao V kw",
                    "Ie dt JB a C y O rq",
                    "ih Wu",
                    "QP T G Zl Yx Q pSz",
                    "Rs",
                    "xA y D e e g",
                    "Gik",
                    "D o Y wyD",
                    "mG z N a j fz P",
                    "U q W",
                    "Ei xr Zf",
                    "wT X EI vz BI",
                    "nj Fr g J P qH h gZa",
                    "e wB XX s",
                    "wL Md wt",
                    "RE yd U rY J qx",
                    "DO Q a U N",
                    "p F gh fv",
                    "xn LT vg rZ pF z xrf",
                    "k",
                    "DD r sh B",
                    "Z Eg iJ Hq r VX h",
                    "Xy N k Hd Lk ea",
                    "teU",
                    "n kp U k KZ aw",
                    "UG uO ax S y",
                    "q D SD",
                    "r ns E Wv XR wv tP g"
                };
        senders =
                new String[] {
                    "K",
                    "kFIbpoFxn",
                    "yErgn",
                    "N",
                    "wtJesr",
                    "rusffeL",
                    "KlpoodEd",
                    "qGcQqIVdFr",
                    "ztmCdK",
                    "HFILjKln",
                    "rusffeL",
                    "TmmQZ",
                    "R",
                    "CNh",
                    "YMQDBkOWy",
                    "kjiSc",
                    "cGMsZxxx",
                    "YMQDBkOWy",
                    "PPqsmNBewN",
                    "gbtn",
                    "nQNcL",
                    "rK",
                    "ppr",
                    "LhSVp",
                    "Ub",
                    "QGRFMLY",
                    "YMQDBkOWy",
                    "Ub",
                    "PPqsmNBewN",
                    "SdDObYkD",
                    "q",
                    "suAakSCuHz",
                    "QGRFMLY",
                    "dnzhjdwrEt",
                    "ubIEXAO",
                    "EsBuLal",
                    "kFIbpoFxn",
                    "yErgn",
                    "ubIEXAO",
                    "TmmQZ",
                    "TmmQZ",
                    "xlQqQRrdTv",
                    "mWxCG",
                    "TmmQZ",
                    "DmwIEmS",
                    "gbtn",
                    "nBQLLS",
                    "QhF",
                    "Ub",
                    "ppr",
                    "bmtYQKYv",
                    "ppr",
                    "EsBuLal",
                    "PRiNk",
                    "rusffeL",
                    "ztmCdK",
                    "PPqsmNBewN",
                    "rK",
                    "xlQqQRrdTv",
                    "QGRFMLY",
                    "EsBuLal",
                    "QyYJw",
                    "QIFauTN",
                    "dnzhjdwrEt",
                    "zJLcUq",
                    "ubIEXAO",
                    "HFILjKln",
                    "ppr",
                    "wtJesr",
                    "ztmCdK",
                    "suAakSCuHz",
                    "zJLcUq",
                    "TU",
                    "HFILjKln",
                    "lCkGjDY",
                    "A",
                    "zJLcUq",
                    "SdDObYkD",
                    "YMQDBkOWy",
                    "R",
                    "LhSVp"
                };
        assertEquals("ubIEXAO", solution1.largestWordCount(messages, senders));
    }
}
