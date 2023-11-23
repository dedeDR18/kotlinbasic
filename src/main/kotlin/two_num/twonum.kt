package two_num

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()

    for ((index, value ) in nums.withIndex()){
        val complement = target - value
        if (map.containsKey(complement)) {
            println("${map.containsKey(complement)}")
            return intArrayOf(map[complement]!!, index)
        }
        map[value] = index
        println("${map.values}")
    }

    throw IllegalArgumentException("No two sum solution found")
}