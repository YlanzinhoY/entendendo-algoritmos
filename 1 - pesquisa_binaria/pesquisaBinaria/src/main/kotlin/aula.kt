fun main() {

    println(sortedArray.binarySearch(12))

}

val sortedArray = (0..12 step 3).toList()


fun List<Int>.binarySearch(item: Int): Int? {

    var min = 0
    var max = lastIndex

    while (min <= max) {
        val mid = (min + max) / 2
        val kick = this[mid]
        if (kick == item) return mid
        if (kick > item) max = mid + 1
        else min = mid + 1
    }
    return null
}
