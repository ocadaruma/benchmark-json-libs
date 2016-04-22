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
[info] BenchmarkJsonLibs.argonautShapelessDeserialize   thrpt   10  39.013 ± 1.530  ops/s
[info] BenchmarkJsonLibs.argonautShapelessSerialize     thrpt   10  33.726 ± 6.625  ops/s
[info] BenchmarkJsonLibs.circeDeserialize               thrpt   10  53.423 ± 5.958  ops/s
[info] BenchmarkJsonLibs.circeSerialize                 thrpt   10  46.622 ± 2.170  ops/s
[info] BenchmarkJsonLibs.json4sJacksonDeserialize       thrpt   10  45.751 ± 5.956  ops/s
[info] BenchmarkJsonLibs.json4sJacksonSerialize         thrpt   10  26.135 ± 1.719  ops/s
[info] BenchmarkJsonLibs.json4sNativeDeserialize        thrpt   10  33.021 ± 1.941  ops/s
[info] BenchmarkJsonLibs.json4sNativeSerialize          thrpt   10  25.129 ± 4.027  ops/s
[info] BenchmarkJsonLibs.sprayJsonShapelessDeserialize  thrpt   10  65.947 ± 3.620  ops/s
[info] BenchmarkJsonLibs.sprayJsonShapelessSerialize    thrpt   10  28.697 ± 1.771  ops/s
```
