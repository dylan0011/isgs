package top.iyuhp.isgs.data.structure.chapter1

/**
 * Created by yuhp@terminus.io on 2017/9/27.
 * Desc: 计算一个数N转化为二进制后含有 1 的个数
 */
class Pra1 {

}

fun main(args: Array<String>) {
    val num = getAll(128)
    println(num)
}

fun getAll(number: Int): Int {
    return when {
        number == 1 -> 1
        number % 2 == 0 -> getAll(number / 2)
        else -> getAll(number / 2) + 1
    }
}
