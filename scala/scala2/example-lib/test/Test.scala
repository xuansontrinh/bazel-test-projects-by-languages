import org.scalatest.flatspec.AnyFlatSpec

class TestSuite extends AnyFlatSpec {
  "things" should "work" in {
    assert(Foo.message == "hello world")
  }
}
