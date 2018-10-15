fun binarySearch(array: IntArray, target: Int): Int?{

    var foundAt: Int? = null
    var highIndex = array.lastIndex
    val isUnderRange = target <= array[highIndex]

    if (array.isNotEmpty() && isUnderRange){
        var lowIndex: Int = 0
        var medIndex: Int
        var actualValue: Int

        while (foundAt == null && lowIndex <= highIndex){
            medIndex = (highIndex + lowIndex) / 2
            actualValue = array[medIndex]

            when {
                actualValue == target -> foundAt = medIndex
                actualValue > target -> highIndex = medIndex - 1
                else -> lowIndex = medIndex + 1
            }
        }
    }
    return foundAt
}

fun main(args: Array<String>) {

    val targetValue = 16
    val myArray = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val isFoundAt = binarySearch(myArray, targetValue)

    if (isFoundAt != null){ println(" $targetValue is found at $isFoundAt index.")}
    else{ println("Target not found!")}
}