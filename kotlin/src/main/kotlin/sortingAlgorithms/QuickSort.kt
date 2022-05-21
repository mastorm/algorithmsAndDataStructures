package sortingAlgorithms

import java.util.*

class QuickSort {
    companion object {
        fun quickSort(arr: IntArray, left: Int, right: Int) {
            if (right < left) return

            val pivot = arr[right]

            var i = left
            var j = right

            while(i<j) {
                while(arr[i] < pivot) {
                    i++
                }

                while(arr[j] > pivot) {
                    j--
                }

                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }

            quickSort(arr, left, i - 1)
            quickSort(arr, i + 1, right)
        }
    }
}