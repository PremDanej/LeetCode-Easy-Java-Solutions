class Solution {

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index > 0) {
            char[] arr = word.toCharArray();
            for(int i = 0; i < index; i++){
                char temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index--;
            }
            return String.valueOf(arr);
        }else
            return word;
    }
}