package Lists

def max(myList: List[Int]): Int =
    myList.max


def sum(myList: List[Int]): Int =
    myList.reduce(_+_)