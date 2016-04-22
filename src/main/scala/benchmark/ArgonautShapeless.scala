package benchmark

import argonaut._
import Argonaut._

import scalaz.\/

object ArgonautShapeless {
  def serialize[A : EncodeJson](a: A): String = a.asJson.nospaces
  def deserialize[A : DecodeJson](s: String): \/[String \/ (String, CursorHistory), A] = s.decode[A]
}
