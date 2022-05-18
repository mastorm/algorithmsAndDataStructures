package searchAlgorithms

import kotlin.math.floor

class BinarySearch {
    companion object {
        fun search(arr: IntArray, search: Int): Int? {
            return binarySearch(arr, search, 0, arr.count() - 1)
        }
        private fun binarySearch(arr: IntArray, search: Int, left: Int, right: Int) : Int? {
            if(arr[left] > search || arr[right] < search) {
                return null
            }

            val middle = (right - left) / 2

            return if(arr[middle] > search) {
                binarySearch(arr, search, middle+1, right)
            } else if (arr[middle] < search) {
                binarySearch(arr, search, left, middle-1)
            } else {
                middle
            }
        }

    }
}