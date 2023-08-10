package StringsWithSubset;

class Solution {
    static int maxRepeating(String sequence, String word) {

        int count = 0;

        if(sequence.isEmpty()){
            return count;
        }

        if(sequence.startsWith(word)){
            return (count + 1) + maxRepeating(sequence.substring(word.length()), word);
        }
        else{
            return 0 + maxRepeating(sequence.substring(1), word);
        }
        
    }

    public static void main(String[] args) {
//        String sequence = "aaabaaaabaaabaaaabaaaabaaaaba ";
//        String word = "aaaba";
//
//        System.out.println(word.length());
//
//        int count = maxRepeating(sequence,word);
//
//        System.out.println(count);

        String name = "prasanth";

        String name2 = name.substring(2);

        System.out.println(name2);
    }
}