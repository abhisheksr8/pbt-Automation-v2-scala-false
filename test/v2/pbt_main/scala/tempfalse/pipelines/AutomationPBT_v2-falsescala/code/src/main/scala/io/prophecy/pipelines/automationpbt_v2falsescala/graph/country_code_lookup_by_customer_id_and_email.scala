package io.prophecy.pipelines.automationpbt_v2falsescala.graph

import io.prophecy.libs._
import io.prophecy.pipelines.automationpbt_v2falsescala.config.Context
import io.prophecy.pipelines.automationpbt_v2falsescala.udfs.UDFs._
import io.prophecy.pipelines.automationpbt_v2falsescala.udfs.PipelineInitCode._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object country_code_lookup_by_customer_id_and_email {

  def apply(context: Context, in0: DataFrame): Unit =
    createLookup("LookupTest",
                 in0,
                 context.spark,
                 List("customer_id", "email"),
                 "country_code"
    )

}
