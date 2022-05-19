package patterrnMatchingAlgos


class NaiveMatcher {
    companion object {
        fun match(haystack: String, needle: String): Array<Match>{
            val results = mutableListOf<Match>()

            for (i in haystack.indices) {
                var currentMatchStart: Int? = null

                for(j in needle.indices) {
                    if(i+j >= haystack.indices.last && j != needle.length) {
                        currentMatchStart = null;
                        break;
                    }

                    if(haystack[i+j] == needle[j]) {
                        if(currentMatchStart == null) {
                            currentMatchStart = i
                        }
                    } else {
                        currentMatchStart = null;
                    }

                }

                if(currentMatchStart != null && currentMatchStart + i == needle.length) {
                    results.add(Match(currentMatchStart, needle.length + i))
                }
            }

            return results.toTypedArray()
        }
    }
}