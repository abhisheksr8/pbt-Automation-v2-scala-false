package io.prophecy.pipelines.automationpbt_v2falsescala.graph

import io.prophecy.libs._
import io.prophecy.pipelines.automationpbt_v2falsescala.udfs.PipelineInitCode._
import io.prophecy.pipelines.automationpbt_v2falsescala.udfs.UDFs._
import io.prophecy.pipelines.automationpbt_v2falsescala.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object select_all_from_in0 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    in0.createOrReplaceTempView("in0")
    context.spark.sql("select * from in0")
  }

}
