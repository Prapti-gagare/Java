import java.util.Scanner;

class count_vwls_consnt
{
    static void countVowelsConsonants(String word)
    {
        int vowels = 0, consonants = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        countVowelsConsonants(word);
    }
}
