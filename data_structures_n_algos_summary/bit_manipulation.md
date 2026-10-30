# Bit Manipulation

* **`^` exclusive or:**
    * This is incredibly useful in CS:
        * **A number `^` with itself will result in zero:**
            * `num1 ^ num1 = 0`
        * **Toggling state:** Any number `^` with **_one_** will toggle every bit of this number:
            * It flips between 0 and 1 each time it runs:
            * `8 ^ 1 = 9` $\rightarrow$ `1000 ^ 0001 = 1001` $\rightarrow$ `9`
            * `7 ^ 1 = 6` $\rightarrow$ `0111 ^ 0001 = 0110` $\rightarrow$ `6`
            * `3 ^ 1 = 2` $\rightarrow$ `0011 ^ 0001 = 0010` $\rightarrow$ `2`
        * **It's perfectly reversible:**
            * **Encrypting:** Message `^` Key = Secret
                * 12 (message) `^` 7 (key) = 11 (secret)
                * `1100 ^ 0111 = 1011`
            * **Decrypting:** Secret `^` Key = Message
                * 11 (secret) `^` 7 (key) = 12 (message)
                * `1011 ^ 0111 = 1100`
