object Pascal_Triangle {
  // Calculate a given row/column value in a Pascal Triangle
  def pascal(r: Int, c: Int): Int = (r, c) match {
    case (r, c) if r > c => 0 
    case (0, _)  => 1 
    case (r, c) if r == c => 1
    case _ => pascal(r-1, c-1) + pascal(r, c-1)
  }

  def main(args: Array[String]) {
    println(pascal(3,4))
  }
}
