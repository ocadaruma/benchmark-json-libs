package entity

case class Foo(
  a: Double,
  aOpt: Option[Double],
  b: String,
  bOpt: Option[String],
  c: Boolean,
  cOpt: Option[Boolean]
)

object Foo {
  import io.circe.generic.auto._

  val foo = Foo(
    a = Double.MaxValue,
    aOpt = Some(Double.MinValue),
    b = "The quick brown fox jumps over the lazy dog",
    bOpt = Some(""),
    c = true,
    cOpt = Some(false)
  )
  val fooList = List.tabulate(1000)(i => foo.copy(a = foo.a + i))
  val fooListJson = benchmark.Circe.serialize(fooList)
}
