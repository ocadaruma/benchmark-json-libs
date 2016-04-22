# benchmark-json-libs

## Target libraries

- [argonaut-shapeless](https://github.com/alexarchambault/argonaut-shapeless)
- [circe](https://github.com/travisbrown/circe)
- [JSON4S](https://github.com/json4s/json4s)
- [spray-json-shapeless](https://github.com/fommil/spray-json-shapeless)

## Run

```bash
$ sbt
> jmh:compile
> jmh:run -i 10 -wi 20 -f1 -t1
```

## Result

```
[info] Benchmark                                         Mode  Cnt   Score   Error  Units
[info] BenchmarkJsonLibs.argonautShapelessDeserialize   thrpt   10  41.063 ± 1.909  ops/s
[info] BenchmarkJsonLibs.argonautShapelessSerialize     thrpt   10  37.530 ± 0.926  ops/s
[info] BenchmarkJsonLibs.circeDeserialize               thrpt   10  52.426 ± 4.896  ops/s
[info] BenchmarkJsonLibs.circeSerialize                 thrpt   10  46.619 ± 1.056  ops/s
[info] BenchmarkJsonLibs.json4sJacksonDeserialize       thrpt   10  50.363 ± 1.359  ops/s
[info] BenchmarkJsonLibs.json4sJacksonSerialize         thrpt   10  29.081 ± 0.509  ops/s
[info] BenchmarkJsonLibs.json4sNativeDeserialize        thrpt   10  37.430 ± 1.234  ops/s
[info] BenchmarkJsonLibs.json4sNativeSerialize          thrpt   10  28.723 ± 0.934  ops/s
[info] BenchmarkJsonLibs.sprayJsonShapelessDeserialize  thrpt   10  70.349 ± 2.470  ops/s
[info] BenchmarkJsonLibs.sprayJsonShapelessSerialize    thrpt   10  29.165 ± 0.468  ops/s
```
