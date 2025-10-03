package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts){
        int maxWealth = 0;
        for (int[] accountWealth : accounts) {
            int personWealth = 0;
            for (int wealth : accountWealth) {
                personWealth += wealth;
            }
            if (personWealth > maxWealth)
                maxWealth = personWealth;
        }
        return maxWealth;
    }
}
