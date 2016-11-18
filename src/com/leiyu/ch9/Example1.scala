package com.leiyu.ch9

import java.io.{File, Serializable}

import scala.io.Source

/**
  * Created by hdp on 16-11-18.
  */
object Example1 {
  def main(args: Array[String]): Unit = {
//    val source = Source.fromFile("/home/hdp/dev/test/myfile.txt","UTF-8")
//    val lineIterator = source.getLines()
//    for(l <- lineIterator) println(l)
//    val lins = lineIterator.toArray
//    println("this array's length is : "+ lins.length)
//
//    println("this file string is :" + source.mkString)

//    val source = Source.fromFile("/home/hdp/dev/test/myfile.txt","UTF-8")
//    val iter = source.buffered
//    while (iter.hasNext){
//      println(iter.head)
//      iter.next()
//    }
//    val tokens = source.mkString.split("\\s+")
//    println(tokens.length)
//    tokens.foreach(arg => println(arg))
//    tokens.foreach(println(_))
//    var i = 0
//    while (i < tokens.length){
//      println(tokens(i))
//      i += 1
//    }
//    for(str <- tokens){
//      println(str)
//    }
//    val numbers = for(w <- tokens) yield  w.toDouble

//    var source1 = Source.fromURL("https://www.baidu.com","UTF-8")
//    val source2 = Source.fromString("Hello,World!")
//    val source3 = Source.stdin
//    println(source3.mkString)

    var homeDirs = subdirs(new File("/home/hdp"))
    for(file <- homeDirs){
      println(file.getAbsolutePath)
    }

  }

  def subdirs(dir:File): Iterator[File]={
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

  @SerialVersionUID(42L) class Person extends Serializable
}
