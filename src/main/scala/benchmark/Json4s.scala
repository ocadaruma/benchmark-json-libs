package benchmark

import org.json4s._
import org.json4s.{native, jackson}

object Json4s {
  implicit val formats = DefaultFormats

  def serializeNative[A <: AnyRef](a: A): String = native.Serialization.write(a)
  def serializeJackson[A <: AnyRef](a: A): String = jackson.Serialization.write(a)

  def deserializeNative[A : Manifest](s: String): A = native.JsonMethods.parse(s).extract[A]
  def deserializeJackson[A : Manifest](s: String): A = jackson.JsonMethods.parse(s).extract[A]
}
