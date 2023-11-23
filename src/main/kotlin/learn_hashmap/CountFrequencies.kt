package learn_hashmap


// list { 1,1,2,3 }

fun main(args: Array<String>){

    val listTest = listOf(1,1,2,2,2,3)
    val result = countFrequncies(listTest)

    for ((k,v) in result){
        println("key = ${k} jumlahnya = ${v}")
    }
}

fun countFrequncies(element: List<Int>): HashMap<Int, Int> {
    val freq = element.groupingBy { it }.eachCount()
    val result = HashMap<Int, Int>()
    for ((key, value) in freq){
        result[key] = value
    }
    return result
}