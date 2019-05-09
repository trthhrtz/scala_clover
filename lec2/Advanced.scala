object Advanced extends App {
// task 1: Implement the method for Vector[Int] and List[Int]
//  sealed abstract class Addable[A] {
//    def sum:A
//  }
//
//
//  class MyAddable[A] () extends Addable[A] {
//    override def sum:A
//  }
//
//  val myvec   = Vector (1,2,3)
//  val mylist  = List   (1,2,3)
//
//  val inst  = new MyAddable
//
//  val res0  = inst.sum(mylist)
//  val res1  = inst.sum(myvec)
//
//  println (s"res0 = $res0")
//  println (s"res1 = $res1")

  sealed abstract class Addable[Int] {
    def sum(el: Seq[Int]): Int
  }

  class MyAddable[A]() extends Addable[Int] {
    override def sum(el: Seq[Int]): Int = {
      el.sum

    }
  }

  val myvec = Vector(1, 2, 3)
  val mylist = List(1, 2, 3)

  val inst = new MyAddable

  val res0 = inst.sum(mylist)
  val res1 = inst.sum(myvec)

  println(s"res0 = $res0")
  println(s"res1 = $res1")

}
