package $package$

import org.apache.spark.sql.SparkSession

object LocalSparkDemo extends App {
  val spark = SparkSession.builder
    .appName("RunMe")
    .master("local")
    .getOrCreate()
  val sc = spark.sparkContext
  val rdd = sc.parallelize(1 to 1000)
  rdd.filter(_ % 5 == 0).collect().foreach(p => println(p))

  spark.close()
}
