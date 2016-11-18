package com.leiyu.extendexample

import org.apache.avro.ipc.specific.Person

import scala.util.Random

/**
  * Created by hdp on 16-11-16.
  */
abstract class Person(age:Int){
  var name:String
  def id:Int
  override def toString: String = getClass.getName + "[name=" + name + "]"
}

class Employee(age:Int,salary:Double) extends Person(age){
  var name = "zhangsan"
  override def toString: String = super.toString + "[salary=" + salary + "]" + this.id
  def id:Int = Random.nextInt()
}

object Main{
  def main(args: Array[String]): Unit = {
    val p = new Employee(22,55.6)
    if(p.isInstanceOf[Employee]){
      val s = p.asInstanceOf[Employee]
      println(p)
    }

    p match {
      case s1:Person => println("s1:"+s1)
      case _ => println("nothing")
    }

    var fred = new Person(33){
      override def id: Int = 55

      override var name: String = "fred"
    }
    println(fred)
  }
}
