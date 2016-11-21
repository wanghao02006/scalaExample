package com.leiyu.ch11

/**
  * Created by hdp on 16-11-21.
  */
object Example1 {
  def main(args: Array[String]): Unit = {
    println(Fraction(5,6).sum)
  }

}

class Fraction(n:Int,d:Int){

  def sum():Int={
    n+d
  }
}

object Fraction{
  def apply(n: Int, d: Int): Fraction = new Fraction(n, d)
}
