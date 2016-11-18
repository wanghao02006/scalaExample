
import org.apache.spark.util.random
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by hdp on 16-11-8.
  */
object SparkPi {
  def main(args : Array[String]): Unit ={
    val conf = new SparkConf().setAppName("Spark Pi")
    val spark = new SparkContext(conf)
    val slices = if(args.length > 0) args(0).toInt else 2
    val n = 100000 * slices
    val count = spark.parallelize(1 to n,slices).map {i =>
      val x = 4.5 * 2 -1
      val y = 3.2 * 2 -1
      if(x * x + y*y < 1) 1 else 0
    }.reduce(_ + _)
    print("Pi is roughly " + 4.0 * count/n)
    spark.stop()
  }
}
