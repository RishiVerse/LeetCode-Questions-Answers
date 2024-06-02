class Answer {

    // Define main function to test the code


    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;

        while (i < len1 && j < len2) {
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }
        while (i < len1) {
            str.append(word1.charAt(i++));
        }
        while (j < len2) {
            str.append(word2.charAt(j++));
        }

        return str.toString();
    }
}
