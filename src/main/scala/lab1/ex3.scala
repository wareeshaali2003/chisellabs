// Exercise 3: Modify the counter in Listing 1.9 to make max parameter of type Int and then use
// typecasting to make it work.
package lab1
import chisel3._
import chisel3.util._
class Counter2 ( size : Int , maxValue : Int ) extends Module {
val io = IO ( new Bundle {
val result = Output ( Bool () )
})
// ' genCounter ' with counter size 'n '
def genCounter ( n : Int , max : Int ) = {
val count = RegInit (0. U ( n . W ) )
when ( count === max.asUInt  ) {
count := 0. U
} .otherwise {
count := count + 1. U
}
count
}
// genCounter instantiation
val counter1 = genCounter ( size , maxValue )
io . result := counter1 ( size -1)
}