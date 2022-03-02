package com.scala.tutorial

import org.apache.spark.{SparkConf, SparkContext}
object createRDD {

  def main(args: Array[String]): Unit = {


    val SparkConf = new SparkConf().setAppName("firstdemo").setMaster("local[*]")
    val sc = new SparkContext(SparkConf)

    val data = Array(1,2,3,4,5,6)

    val dataRDD = sc.parallelize(data)

   println("First Element of RDD: "+ dataRDD.first())

    val element = dataRDD.take(5)

    for(a <-element ){
      println("Array Element: "+ a)
    }
  }
}
