class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {

        int[] prefix = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i == 0) {
                prefix[i] = 0;
            } else {
                prefix[i] = prefix[i - 1] + arr[i - 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (prefix[i] == sum - prefix[i] - arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
