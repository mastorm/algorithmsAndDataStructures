import sortingAlgorithms.BubbleSort.Companion.bubbleSort
import sortingAlgorithms.QuickSort


fun main(args: Array<String>) {

    val sortMe = intArrayOf(4,2,1,5,6,7,9,8,3)
//    selectionSort(sortMe);
//    insertionSort(sortMe)
//    InsertionSortTwo.insertionSort(sortMe)

//    QuickSort.quickSort(sortMe, 0, sortMe.count() - 1)
    bubbleSort(sortMe)
    for (el: Int in sortMe){
        println(el)
    }
}
