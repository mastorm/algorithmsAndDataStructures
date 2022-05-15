class SelectionSort {
    companion object {
        fun selectionSort(arr: IntArray) {
            for (i in 0 until arr.count()) {
                var smallestSeen = i;

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