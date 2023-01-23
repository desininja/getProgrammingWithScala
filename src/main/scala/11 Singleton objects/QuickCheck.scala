object QuickCheck {

  def main(args: Array[String]): Unit ={

    //val n = args(0).toInt
    //val word = args(1)
    ec( n= args(0).toInt,word= args(1))
  }
  def ec(n: Int, word:String) ={

    println(word * n )

  }
}

// if no main is defined object will not run/compile etc
// After defining two mains compiler throws an error saying method main is defined twice.