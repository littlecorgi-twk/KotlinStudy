package leetcode.easy

import leetcode.ListNode

/**
 *
 * @author littlecorgi
 * @date 2020-04-03 23:41
 */
fun removeDuplicateNodes(head: ListNode?): ListNode? {
    if (head == null) {
        return head
    }
    val occurred = HashSet<Int>()
    occurred.add(head.`val`)
    var pos = head
    while (pos?.next != null) {
        val cur = pos.next
        if (cur != null) {
            if (occurred.add(cur.`val`)) {
                pos = pos.next
            } else {
                pos.next = pos.next?.next
            }
        }
    }
    pos?.next = null
    return head
}