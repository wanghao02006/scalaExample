package com.leiyu.ch9

/**
  * Created by hdp on 16-11-18.
  */
object Example3 {
  def main(args: Array[String]): Unit = {
//    val numPattern = "[0-9]+".r
//    val wsnumwsPattern = """\s+[0-9]+\s+""".r
////    for(matchString <- numPattern.findAllIn("99 bottles,98 bottles")){
////      println(matchString)
////    }
//    val matches = numPattern.findAllIn("99 bottles,98 bottles").toArray
//    println(matches)
//    val m1 = wsnumwsPattern.findFirstIn("99 bottles,98 bottles"))
//    numPattern.findPrefixOf("99 bottles,98 bottles"))
//    wsnumwsPattern.findPrefixOf("99 bottles,98 bottles"))

    val numitemPattern = "([0-9]+)[ ]+([a-z]+)".r
    val numitemPattern(num,item) = "99  bottles"
    println("num:"+num+",item:"+item)

    for(numitemPattern(num,item) <- numitemPattern.findAllIn("99 bottles,98 bottles")){
      println("num:"+num+",item:"+item)
    }
  }
}
