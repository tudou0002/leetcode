class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
/* Bitwise Operators:
    &, Bitwise AND operator: returns bit by bit AND of input values.
    |, Bitwise OR operator: returns bit by bit OR of input values.
    ^, Bitwise XOR operator: returns bit by bit XOR of input values.
    ~, Bitwise Complement Operator: This is a unary operator which returns the one’s compliment representation of the input value, i.e. with all bits inversed.
    
    [source:https://www.geeksforgeeks.org/operators-in-java/]
*/
