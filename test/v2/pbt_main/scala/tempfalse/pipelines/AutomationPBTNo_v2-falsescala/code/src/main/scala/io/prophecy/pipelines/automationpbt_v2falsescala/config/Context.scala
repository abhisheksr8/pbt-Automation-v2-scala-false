package io.prophecy.pipelines.automationpbt_v2falsescala.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
