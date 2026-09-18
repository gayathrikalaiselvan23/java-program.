class welcometojava {
    public static void main(String[] args) {
        String word = "welcome to java";
        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}