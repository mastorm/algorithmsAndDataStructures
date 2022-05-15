package sortingAlgorithms

class SelectionSort {
    companion object {
        // insertion sort Time-Space complexity:
        // - Space-Complexity: O(1) because its an in-place sorting algo
        // - Time-Complexity:
        //      Worst case: O(n²) since the search for the smaller element shrinks as the sorted area increases
        //      Best case: O(n) when the array is already sorted
        fun selectionSort(arr: IntArray) {
            for (i in 0 until arr.count()) {
                var smallestSeen = i

                for (j in i until arr.count()) {
                    if (arr[j] < arr[smallestSeen]) {
                        smallestSeen = j
                    }
                }
                val temp = arr[i]
                arr[i] = arr[smallestSeen]
                arr[smallestSeen] = temp
            }
        }
    }
}