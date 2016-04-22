package entity

case class Bar(
  a: Foo,
  aOpt: Option[Foo],
  b: String,
  bSeq: Seq[String]
)

object Bar {
  import io.circe.generic.auto._

  val bar = Bar(
    a = Foo.foo,
    aOpt = Some(Foo.foo),
    b = "Lorem ipsum dolor sit amet, ea vim magna viderer.",
    bSeq = Seq("Lorem", "ipsum", "dolor", "sit", "amet", "ea", "vim", "magna", "viderer")
  )
  val barList = Foo.fooList.map(f => bar.copy(a = f))
  val barListJson = benchmark.Circe.serialize(barList)
}
