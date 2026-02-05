import java.util.Scanner;

class count_vowel
 {
    static int countVowels(String word) 
    {
        int count = 0;
        for (int i = 0; i < word.length(); i++)
         {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();  
        int totalVowels = countVowels(word);
        System.out.println("Total vowels in the word = " + totalVowels);
    }
}
