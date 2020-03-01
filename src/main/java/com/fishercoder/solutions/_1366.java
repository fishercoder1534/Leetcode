package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1366. Rank Teams by Votes
 *
 * In a special ranking system, each voter gives a rank from highest to lowest to all teams participated in the competition.
 * The ordering of teams is decided by who received the most position-one votes.
 * If two or more teams tie in the first position, we consider the second position to resolve the conflict,
 * if they tie again, we continue this process until the ties are resolved. If two or more teams are still tied after considering all positions,
 * we rank them alphabetically based on their team letter.
 * Given an array of strings votes which is the votes of all voters in the ranking systems. Sort all teams according to the ranking system described above.
 * Return a string of all teams sorted by the ranking system.
 *
 * Example 1:
 * Input: votes = ["ABC","ACB","ABC","ACB","ACB"]
 * Output: "ACB"
 * Explanation: Team A was ranked first place by 5 voters. No other team was voted as first place so team A is the first team.
 * Team B was ranked second by 2 voters and was ranked third by 3 voters.
 * Team C was ranked second by 3 voters and was ranked third by 2 voters.
 * As most of the voters ranked C second, team C is the second team and team B is the third.
 *
 * Example 2:
 * Input: votes = ["WXYZ","XYZW"]
 * Output: "XWYZ"
 * Explanation: X is the winner due to tie-breaking rule.
 * X has same votes as W for the first position but X has one vote as second position while W doesn't have any votes as second position.
 *
 * Example 3:
 * Input: votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]
 * Output: "ZMNAGUEDSJYLBOPHRQICWFXTVK"
 * Explanation: Only one voter so his votes are used for the ranking.
 *
 * Example 4:
 * Input: votes = ["BCA","CAB","CBA","ABC","ACB","BAC"]
 * Output: "ABC"
 * Explanation:
 * Team A was ranked first by 2 voters, second by 2 voters and third by 2 voters.
 * Team B was ranked first by 2 voters, second by 2 voters and third by 2 voters.
 * Team C was ranked first by 2 voters, second by 2 voters and third by 2 voters.
 * There is a tie and we rank teams ascending by their IDs.
 *
 * Example 5:
 * Input: votes = ["M","M","M","M"]
 * Output: "M"
 * Explanation: Only team M in the competition so it has the first rank.
 *
 * Constraints:
 * 1 <= votes.length <= 1000
 * 1 <= votes[i].length <= 26
 * votes[i].length == votes[j].length for 0 <= i, j < votes.length.
 * votes[i][j] is an English upper-case letter.
 * All characters of votes[i] are unique.
 * All the characters that occur in votes[0] also occur in votes[j] where 1 <= j < votes.length.
 * */
public class _1366 {
    public static class Solution1 {
        class Node {
            int[] count = new int[26];
            char c;

            public Node(char c) {
                this.c = c;
            }
        }

        public String rankTeams(String[] votes) {
            Node[] nodes = new Node[26];
            for (int i = 0; i < 26; i++) {
                nodes[i] = new Node((char) (i + 'A'));
            }
            for (String vote : votes) {
                for (int i = 0; i < vote.length(); i++) {
                    nodes[vote.charAt(i) - 'A'].count[i]++;
                }
            }
            Arrays.sort(nodes, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    for (int i = 0; i < 26; i++) {
                        if (o1.count[i] != o2.count[i]) {
                            return o2.count[i] - o1.count[i];
                        }
                    }
                    return o1.c - o2.c;
                }
            });
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < votes[0].length(); i++) {
                sb.append(nodes[i].c);
            }
            return sb.toString();
        }

    }
}
