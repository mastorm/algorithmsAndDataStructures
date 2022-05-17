package sortingAlgorithms

class BubbleSort {
    companion object {
        fun bubbleSort(arr: IntArray) {

            while (true) {
                var cleanRun = true

                for(i in 0 until arr.count() - 1) {
                    if (arr[i] > arr[i+1]) {
                        val temp = arr[i]
                        arr[i] = arr[i+1]
                        arr[i+1] = temp
                        cleanRun = false
                    }
                }

                if(cleanRun) {
                    break;
                }
            }
        }
    }
}