// package lab6
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class Pipetest extends FreeSpec with ChiselScalatestTester {
//   "Pipe Test" in {
//     test(new Pipe()) { c =>
//       c.io.in.valid.poke(true.B) // Set the valid signal to true
//       c.io.in.bits.poke(4.U) // Set the data value

//       c.clock.step(1)

//       // Expect the output to be valid and equal to 4.U
//       c.io.out.valid.expect(false.B)
//       c.io.out.bits.expect(0.U)
//     }
//   }
// }
