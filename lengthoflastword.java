
class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();

        int last_word_index = s.lastIndexOf(' ');

        int length_of_last = s.length()-last_word_index-1;

        return length_of_last;
    }
}
