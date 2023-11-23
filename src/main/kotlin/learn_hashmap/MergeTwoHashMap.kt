package learn_hashmap


fun main(args: Array<String>){

    val map1 = hashMapOf(1 to 1, 2 to 3, 3 to 1, 5 to 11)
    val map2 = hashMapOf(1 to 2, 4 to 1, 5 to 1)

    val result = mergeMaps(map1, map2)
    for ((k,v) in result){
        println("key ${k}, jumlahnya ${v}")
    }
}

fun mergeMaps(map1: HashMap<Int, Int>, map2: HashMap<Int, Int>): HashMap<Int, Int> {
    val result = HashMap<Int, Int>()
    for ((k,v) in map1){
        result[k] = v
    }
    for ((k,v) in map2){
        if (result.containsKey(k)){
            result[k] = result.getValue(k).plus(v)
        } else {
            result[k] = v
        }
    }
    return result
}
