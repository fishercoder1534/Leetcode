#!/usr/bin/env bash
# Write a bash script to calculate the frequency of each word in a text file words.txt.
#
# For simplicity sake, you may assume:
#
# words.txt contains only lowercase characters and space ' ' characters.
# Each word must consist of lowercase characters only.
# Words are separated by one or more whitespace characters.
# For example, assume that words.txt has the following content:
#
# the day is sunny the the
# the sunny is is
# Your script should output the following,
# sorted by descending frequency:
# the 4
# is 3
# sunny 2
# day 1
# Note:
# Don't worry about handling ties,
# it is guaranteed that each word's frequency count is unique.
#

# Read from the file words.txt and output the word frequency list to stdout.
awk '{for(i=1;i<=NF;i++) a[$i]++} END {for(k in a) print k,a[k]}' words.txt | sort -k2 -nr