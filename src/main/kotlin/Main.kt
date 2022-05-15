import sortingAlgorithms.InsertionSort.Companion.insertionSort


fun main(args: Array<String>) {

    val sortMe = intArrayOf(4,2,1,5,6,7,9,8,3)
//    selectionSort(sortMe);
    insertionSort(sortMe)

    for (el: Int in sortMe){
        println(el)
    }
}
