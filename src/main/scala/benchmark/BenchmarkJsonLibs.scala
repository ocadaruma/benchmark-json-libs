package benchmark

import entity.{Bar, Foo}
import org.openjdk.jmh.annotations.Benchmark

class BenchmarkJsonLibs {
  import Foo._
  import Bar._

  // codecs
  import io.circe.generic.auto._
  import argonaut.Shapeless._
  import fommil.sjs.FamilyFormats._

  @Benchmark
  def circeSerialize(): Unit = {
    Circe.serialize(fooList)
    Circe.serialize(barList)
  }

  @Benchmark
  def circeDeserialize(): Unit = {
    Circe.deserialize[List[Foo]](fooListJson)
    Circe.deserialize[List[Bar]](barListJson)
  }

  @Benchmark
  def argonautShapelessSerialize(): Unit = {
    ArgonautShapeless.serialize(fooList)
    ArgonautShapeless.serialize(barList)
  }

  @Benchmark
  def argonautShapelessDeserialize(): Unit = {
    ArgonautShapeless.deserialize[List[Foo]](fooListJson)
    ArgonautShapeless.deserialize[List[Bar]](barListJson)
  }

  @Benchmark
  def sprayJsonShapelessSerialize(): Unit = {
    SprayJsonShapeless.serialize(fooList)
    SprayJsonShapeless.serialize(barList)
  }

  @Benchmark
  def sprayJsonShapelessDeserialize(): Unit = {
    SprayJsonShapeless.deserialize[List[Foo]](fooListJson)
    SprayJsonShapeless.deserialize[List[Bar]](barListJson)
  }

  @Benchmark
  def json4sNativeSerialize(): Unit = {
    Json4s.serializeNative(fooList)
    Json4s.serializeNative(barList)
  }

  @Benchmark
  def json4sNativeDeserialize(): Unit = {
    Json4s.deserializeNative[List[Foo]](fooListJson)
    Json4s.deserializeNative[List[Bar]](barListJson)
  }

  @Benchmark
  def json4sJacksonSerialize(): Unit = {
    Json4s.serializeJackson(fooList)
    Json4s.serializeJackson(barList)
  }

  @Benchmark
  def json4sJacksonDeserialize(): Unit = {
    Json4s.deserializeJackson[List[Foo]](fooListJson)
    Json4s.deserializeJackson[List[Bar]](barListJson)
  }
}
