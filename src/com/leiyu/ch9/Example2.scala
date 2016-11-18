package com.leiyu.ch9

/**
  * Created by hdp on 16-11-18.
  */
object Example2 {
  def main(args: Array[String]): Unit = {
    import sys.process._
    "pwd " !!;
    "ls -al .." !;
    "ls -al /dev" #| "grep sec" !;
  }
}
