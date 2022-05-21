package patterrnMatchingAlgos


class NaiveMatcher {
    companion object {
        fun match(haystack: String, needle: String): Array<Match> {
            val results = mutableListOf<Match>()

            for (i in haystack.indices) {
                var currentMatchStart: Int? = null

                for (j in needle.indices) {
                    if (i + j > haystack.length - 1) {
                        currentMatchStart = null;
                        break;
                    }
                    if (haystack[i + j] == needle[j]) {
                        currentMatchStart = if (currentMatchStart == null) {
                            i
                        } else {
                            null
                        }
                    }

                }
                if (currentMatchStart != null) {
                    results.add(Match(currentMatchStart, needle.length + i))
                }

            }

            return results.toTypedArray()
        }
    }
}