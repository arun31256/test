
import org.apache.spark.{SparkConf, SparkContext}

object firstdemo {

  def main(args: Array[String]): Unit = {

    val SparkConf = new SparkConf().setAppName("firstdemo").setMaster("local[*]")
    val sc = new SparkContext(SparkConf)

    val dataRDD = sc.textFile("C:\\Users\\hp\\Downloads\\username.csv")

    //first element
    println("First Element:"+dataRDD.first())

    //filter data
    val filterData = dataRDD.filter(x=> x.contains("smith"))
    filterData.foreach(x=> println(x))
  }

}
