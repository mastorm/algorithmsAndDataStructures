package miscAlgos

class Fibonacci {
    companion object {
        fun fib(n: Int): Int? {
            if(n < 0 ) {
                return null;
            }

            if(n == 0) {
                return 0
            } else if(n == 1) {
                return 1
            }

            var prev = 0;
            var current = 1;
            var next = 0

            for (i in 0 until n - 1) {
                val temp = current
                current += prev
                prev = temp
            }
            return current;
        }
    }
}