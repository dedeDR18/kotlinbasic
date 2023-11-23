package learn_hashmap

fun main(args: Array<String>) {

    val text = "Ayo main yo Kita main ke pantai"
    val result = countWordFrequency(text)
    for ((k, v) in result) {
        println("key ${k} = ${v}")
    }
}


fun countWordFrequency(text: String): HashMap<String, Int> {

    val words = text.split("\\s+".toRegex())
    val wordCount = HashMap<String, Int>()

    for (word in words) {
        val cleanWord = word.filter {
            it.isLetter()
        }.lowercase()
        if (cleanWord.isNotEmpty()) {
            wordCount[cleanWord] = wordCount.getOrDefault(cleanWord, 0) + 1
        }
    }

    return wordCount
}