package save_the_prisoner;

public class Solution {
    public  int saveThePrisoner(int arr[]) {
        int prisoner = arr[0], sweet = arr[1], start = arr[2];
        if (sweet + start < prisoner) {
            return sweet + start - 1;
        }
        sweet = sweet % prisoner;
        if ((sweet + start - 1) % prisoner == 0)
            return prisoner;
        return (sweet + start - 1) % prisoner;
    }
}
