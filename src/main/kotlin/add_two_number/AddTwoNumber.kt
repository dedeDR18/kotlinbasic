package add_two_number

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummyHead = ListNode(0)
    var p = l1
    var q = l2
    var curr = dummyHead
    var carry = 0

    while (p != null || q != null) {
        val x = p?.`val` ?: 0
        val y = q?.`val` ?: 0
        val sum = carry + x + y
        carry = sum / 10
        curr.next = ListNode(sum % 10)
        curr = curr.next!!
        if (p != null) p = p.next
        if (q != null) q = q.next
    }

    if (carry > 0) {
        curr.next = ListNode(carry)
    }
    return dummyHead.next
}


fun main(args: Array<String>){

// Angka 342 disimpan sebagai 2 -> 4 -> 3
    val l1 = ListNode(2).apply {
        next = ListNode(4).apply {
            next = ListNode(3)
        }
    }

// Angka 465 disimpan sebagai 5 -> 6 -> 4
    val l2 = ListNode(5).apply {
        next = ListNode(6).apply {
            next = ListNode(4)
        }
    }

    val result = addTwoNumbers(l1, l2)
    // Hasil harusnya 7 -> 0 -> 8 karena 342 + 465 = 807
    println("${result?.`val`} -> ${result?.next?.`val`} -> ${result?.next?.next?.`val`}")

}

