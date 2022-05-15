class InsertionSort {
    companion object {
        // Time-Space Complexity:
        // - Space Complexity: O(n) since its an in-place sorting algorithm
        // - Time-Complexity: Worst-Case O(n²), Best-Case O(n)
        fun insertionSort(arr: IntArray) {
            // the array is split in two partitions:
            // - the sorted partition
            // - the unsorted partition
            // the partition is delimited by the following loop`s iterator.
            // Example: If the iterator is 1, 0 is considered to be part of the sorted partition
            for (i in 1 until arr.count()) {
                // this is the value that needs to be inserted into the sorted partition
                val current = arr[i]

                // j is the search cursor that looks for the correct place for `current` in the sorted partition.
                // Since i itself is not yet part of the sorted partition, we decrease it by one
                var j = i - 1

                // while we`re still in bounds, loop through the sorted partition
                while(j > -1 && arr[j] > current) {
                    // move each element to the right IF it is larger than the element we want to sort
                    arr[j + 1] = arr[j]
                    j--
                }

                // at the end, j+1 is the current position of our element
                arr[j+1] = current
            }
        }
    }
}