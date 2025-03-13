import example.scala3.Hello

@main def hello(): Unit = {
  val hello = new Hello
  println(hello.hello)
  println(hello.useGson)
}
