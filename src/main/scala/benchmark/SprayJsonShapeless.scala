package benchmark

import spray.json._

object SprayJsonShapeless {
  def serialize[A : JsonWriter](a: A): String = a.toJson.compactPrint
  def deserialize[A : JsonReader](s: String): A = s.parseJson.convertTo[A]
}
