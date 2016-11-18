package com.leiyu.ch10

import scala.util.logging.Logged

/**
  * Created by hdp on 16-11-19.
  */
object Example1 {
  def main(args: Array[String]): Unit = {
    val account = new SavingsAccount() with ConsoleLogger
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

  class SavingsAccount extends Account with Logged {
    def withdraw(amount : Double){
      if(amount > balance) {
        log("Insufficient funds")
      }else {
        balance -= amount
      }
    }
  }

  trait ConsoleLogger extends Logged{
    override def log(msg: String): Unit = println(msg)
  }
