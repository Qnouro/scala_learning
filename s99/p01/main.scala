package p01

object p01 extends App {
    def last(l: List[Any]): Any =
        println(f"Dealing with: $l with a length of ${l.length}")
        if l.length > 0 then
           return l.last
        
        return 0
}