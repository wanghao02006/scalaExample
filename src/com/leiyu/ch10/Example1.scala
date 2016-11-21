package com.leiyu.ch10

import java.io.PrintWriter
import java.util.Date

import scala.util.logging.Logged

/**
  * Created by hdp on 16-11-19.
  */

trait Logger{
  def log(msg:String)

  def info(msg:String): Unit ={
    log("INFO: " + msg)
  }

  def warn(msg:String): Unit ={
    log("WARN:" + msg)
  }

  def severe(msg:String): Unit ={
    log("SEVERE:"+msg)
  }

}

trait TimestampLogger extends Logger{
  abstract override def log(msg: String){
    super.log(new java.util.Date() + " " + msg)
  }
}

trait FileLogger extends Logger{
  val out = new PrintWriter("app.log")
  out.println("# "+new Date().toString)

  override def log(msg: String): Unit = {
    out.println(msg)
    out.flush()
  }
}

object Example1 {
  def main(args: Array[String]): Unit = {
    val account = new SavingsAccount()
    account.withdraw(65.0)
  }
}

//trait Logger{
//  def log(msg : String)
//}
//
//class ConsoleLogger extends Logger with  Cloneable with Serializable{
//  def log(msg : String): Unit ={
//    println(msg)
//  }
//}

//class Account(balance : Double)
//
//trait ConsoleLogger{
//  def log(msg : String): Unit ={
//    println(msg)
//  }
//}
//
//class SavingAccount(balance : Double) extends Account(balance) with ConsoleLogger{
//  def withdraw(amount : Double){
//    if(amount > balance){
//      log("Insufficient funds")
//    }else {
//      log("result : " + (balance - amount))
//    }
//  }
//  }
  class Account(){
    var balance = 56.7
  }

  class SavingsAccount extends Account with Logger {
    def withdraw(amount:Double): Unit ={
      if(amount > balance){
        severe("insufficient funds")
      }else{
        balance -= amount
      }
    }

    override def log(msg: String): Unit = {
      println(msg)
    }
  }

//  trait ConsoleLogger extends Logged{
//    override def log(msg: String): Unit = println(msg)
//  }
