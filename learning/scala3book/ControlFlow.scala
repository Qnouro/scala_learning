object Flow extends App {
    var x = 10
    var y = 59

    // Simple if statement
    if (x > y){
        println(f"$x is greater than $y")
    } else if (x == y) {
        println(f"$x is equal to $y")
    } else {
        println(f"$x is lesser than $y")
    }

    // Scala 3 if statement syntax
    if x > y then
        println("yep")
    else
        println(":/")

    // Simple loop
    val ints = List(1, 2, 5, 4, 7, 8, 9, 6, 54, 412, 4, 548, 8, 75, 4)
    for i <- ints if i > 10 do println(i)

    // Nested loop
    for
        i <- 1 to 5
        j <- 1 to 5
        if i > 3
        if j < 3
    do
        println(f"($i, $j)")

    // For loop generator
    val doubles = for i <- ints yield i * 2
    println(doubles)

    val capitalizedNames = for i <- List("nour", "potato", "master") yield i.capitalize
    println(capitalizedNames)

    val fruitNames = for
                        i <- List("banana", "apple", "mango", "kiwi", "strawberry")
                        if i.length > 4
                     yield
                        List(i.capitalize, i.length)
    println(fruitNames)

    // Simple while loop
    var po = 4
    while
        po > 0
    do
        println(po)
        po -= 1
}