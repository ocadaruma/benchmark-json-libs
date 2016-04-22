package benchmark

import cats.data.Xor
import io.circe._
import io.circe.parser._
import io.circe.syntax._

object Circe {
  def serialize[A : io.circe.Encoder](a: A): String = a.asJson.noSpaces
  def deserialize[A : io.circe.Decoder](s: String): Xor[Error, A] = decode[A](s)
}
