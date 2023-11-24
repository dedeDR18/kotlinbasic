package learn_list


fun main(args: Array<String>) {

    val testList = listOf(1, 2, 3, 4, 5)
    val result = manualReverse4(testList)
    println(result.toString())
}

fun manualReverse(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size.downTo(1)) {
        result.add(i)
    }

    return result
}

fun manualReverse2(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.indices.reversed()) {
        result.add(list[i])
    }

    return result
}

fun <T> manualReverse3(inputList: List<T>): List<T> {
    val resultList = inputList.toMutableList() // Copy inputList to a mutable list to work with
    var start = 0
    var end = resultList.size - 1
    while (start < end) {
        // Swap elements at start and end
        val temp = resultList[start]
        resultList[start] = resultList[end]
        resultList[end] = temp
        start++
        end--
    }
    return resultList
}


fun <T> manualReverse4(inputList: List<T>): List<T> {
    return inputList.fold(initial = emptyList<T>()) { acc, item ->
        println(acc)
        println(item)
        println(listOf(item))
        println( listOf(item) + acc)
        listOf(item) + acc
    }
}
