package LinearSearch;

public class searchInString {
    public static void main(String[] args) {

        String name = "Aditya";
        char ch = 'f';
        System.out.println(findChar(name, ch));
    }

    static boolean findChar(String str, char target)
    {
        if(str.isEmpty())
            return false;

        for(char ch : str.toCharArray())
        {
            if(ch == target)
                return true;
        }
        return  false;
    }
}
