package week6;

class BinarySearch {
    public static boolean search(int[] array, int searchedValue)
    {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == searchedValue)
                return true;

            if (array[middle] < searchedValue)
                left = middle + 1;

            else
                right = middle - 1;
        }
        return false;
    }
}
