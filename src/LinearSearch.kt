
fun linearSearch(array: IntArray, target: Int): Int?{
    var foundAt: Int? = null
    if (array.isNotEmpty()){
        var index: Int = 0
        while (foundAt == null &&
                index <= array.lastIndex){
            if (array[index] == target){ foundAt = index}
            else { index++ }
        }
    }
    return foundAt
}

fun main(args: Array<String>) {

    val targetValue = 0
    val myArray = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val isFoundAt = linearSearch(myArray, targetValue)

    if (isFoundAt != null){ println(" $targetValue is found at $isFoundAt index.")}
    else{ println("Target not found!")}
}
