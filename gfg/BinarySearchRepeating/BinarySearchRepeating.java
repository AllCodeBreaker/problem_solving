class BinarySearchRepeating {
    public int binarysearch(int[] arr, int k) {
        int len = arr.length;
        int low = 0, high = len - 1;
        int mid, result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == k) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}