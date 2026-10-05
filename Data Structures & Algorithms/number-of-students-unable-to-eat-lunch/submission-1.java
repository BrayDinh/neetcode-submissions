class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] preferenceCounter = new int[2];

        for (int student : students){
            preferenceCounter[student]++;
        }

        int leftHungry = students.length;

        for (int s : sandwiches){

            if (preferenceCounter[s] == 0){
                break;
            }

            preferenceCounter[s]--;
            leftHungry--;
        }
        return leftHungry;
    }
}