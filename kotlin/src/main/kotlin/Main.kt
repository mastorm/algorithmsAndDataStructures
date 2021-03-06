import miscAlgos.Fibonacci.Companion.fib
import patterrnMatchingAlgos.Match
import patterrnMatchingAlgos.NaiveMatcher
import searchAlgorithms.BinarySearch
import searchAlgorithms.SequentialSearch.Companion.sequentialSearch
import sortingAlgorithms.BubbleSort.Companion.bubbleSort
import sortingAlgorithms.QuickSort


fun main(args: Array<String>) {

//    val sortMe = intArrayOf(4,2,1,5,6,7,9,8,3)
//
////    val index = sequentialSearch(sortMe, 5)
////    println("found 5 at $index")
//
//    QuickSort.quickSort(sortMe, 0, sortMe.count() - 1)
//
//    val search = BinarySearch.search(sortMe, 10)
//    println("found 5 at $search")
//
//    for (el: Int in sortMe){
//        println(el)
//    }
//    println(fib(10))

    val haystack = "AAaaAA"
    val pattern = "AA"

    val matches = NaiveMatcher.match(haystack, pattern)

    for (match: Match in matches) {
        println("Match from position ${match.start} to position ${match.end}")
    }


}
