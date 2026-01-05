import java.util.Scanner;

class print_vowels_consonent
{
   
    static void printVowelsConsonants(String word)
    {
        char ch;

        System.out.println("Vowels:");
        for (int i = 0; i < word.length(); i++)
        {
            ch = Character.toLowerCase(word.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u')
            {
                System.out.print(word.charAt(i) + " ");
            }
        }
        System.out.println("\nConsonants:");
        for (int i = 0; i < word.length(); i++)
        {
            ch = Character.toLowerCase(word.charAt(i));

            if (ch >= 'a' && ch <= 'z' &&
               !(ch == 'a' || ch == 'e' || ch == 'i' ||
                 ch == 'o' || ch == 'u'))
            {
                System.out.print(word.charAt(i) + " ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        printVowelsConsonants(word);
    }
}
