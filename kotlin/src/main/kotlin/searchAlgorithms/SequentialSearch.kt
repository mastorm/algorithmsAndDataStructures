package searchAlgorithms

class SequentialSearch {
    companion object {
        fun sequentialSearch(arr: IntArray, searched: Int) : Int? {
            for (i in 0 until arr.count()) {
                if(arr[i] == searched) {
                    return i
                }
            }

            return null
        }
    }
}