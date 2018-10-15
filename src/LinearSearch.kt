
private fun linearSearch(array: IntArray, target: Int): Int{
    val NOT_FOUND = -1
    var foundAt: Int = NOT_FOUND
    if (array.isNotEmpty()){
        var index: Int = 0
        while (foundAt == NOT_FOUND &&
                index <= array.lastIndex){
            if (array[index] == target){ foundAt = index}
            else { index++ }
        }
    }
    return foundAt
}

fun main(args: Array<String>) {

    val TARGET_VALUE = 15
    val myArray = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val isFoundAt = linearSearch(myArray, TARGET_VALUE)

    if (isFoundAt >= 0){ println(" $TARGET_VALUE is found at $isFoundAt index.")}
    else{ println("Target not found!")}
}
