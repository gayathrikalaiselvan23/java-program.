class Vowels {
    public static void main(String[] args) {
        String word = "welcome to java class";
        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                System.out.println(arr[i]);
            }
        }
    }
}