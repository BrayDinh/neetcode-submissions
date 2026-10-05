class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] preferenceCount = new int[2];

        for (int student : students){
            preferenceCount[student]++;
        }

        int unableToEat = students.length;

        for (int sandwich : sandwiches){
            if (preferenceCount[sandwich] == 0){
                break;
            }

            preferenceCount[sandwich]--;
            unableToEat--;
        }
        return unableToEat;
    }
}