public class TwoDMethods
{
    public static void display(String table[][])
    {
        System.out.println("\nThe list of strings are: ");
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void displayRev(String table[][])
    {
        int ctr = 0;
        String word;
        System.out.println("\nThe list of reverse strings are: ");
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                word = table[i][j];
                ctr = 0;
                for(int k = 0; k < word.length(); k++)
                {
                    ctr++;
                }
                for(ctr--; ctr >= 0; ctr--)
                {
                    System.out.print(word.charAt(ctr));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void numWords(String table[][])
    {
        int ctr = 0;
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                ctr++;
            }
        }
        System.out.print("The total no. of words are: " + ctr);
    }
    public static void numChar(String table[][])
    {
        int ctr = 0;
        String word;
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                word = table[i][j];
                for(int k = 0; k < word.length(); k++)
                {
                    ctr++;
                }
            }
        }
        System.out.print("\nThe total no. of characters are: " + ctr);
    }
    public static void vowels(String table[][])
    {
        int ctr = 0;
        String word;
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                word = table[i][j];
                for(int k = 0; k < word.length(); k++)
                {
                    if(word.charAt(k) == 'a' || word.charAt(k) == 'e'
                    || word.charAt(k) == 'i' || word.charAt(k) == 'o'
                    || word.charAt(k) == 'u' || word.charAt(k) == 'A'
                    || word.charAt(k) == 'E' || word.charAt(k) == 'I'
                    || word.charAt(k) == 'O' || word.charAt(k) == 'U')
                    {
                        ctr++;
                    }
                }
            }
        }
        System.out.print("\nThe total no. of vowels are: " + ctr);
    }
    public static void consonants(String table[][])
    {
        int ctr = 0;
        String word;
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                word = table[i][j];
                for(int k = 0; k < word.length(); k++)
                {
                    if(word.charAt(k) != 'a' && word.charAt(k) != 'e'
                    && word.charAt(k) != 'i' && word.charAt(k) != 'o'
                    && word.charAt(k) != 'u' && word.charAt(k) != 'A'
                    && word.charAt(k) != 'E' && word.charAt(k) != 'I'
                    && word.charAt(k) != 'O' && word.charAt(k) != 'U')
                    {
                        if((word.charAt(k) >= 'a' && word.charAt(k) <= 'z')
                        || word.charAt(k) >= 'A' && word.charAt(k) <= 'Z')
                        {
                            ctr++;
                        }
                    }
                }
            }
        }
        System.out.print("\nThe total no. of consonants are: " + ctr);
        System.out.println();
    }
}