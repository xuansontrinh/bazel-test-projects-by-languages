package example.scala3

import com.google.gson.Gson

class Hello:
  private val me: String =
    """
    {
    "name" : "Son",
    "age" : 30
    }
      |""".stripMargin
  def hello: String = "Hello"
  def useGson: Person = {
    val gson = Gson()
    val human: Person = gson.fromJson(me, classOf[Person])
    human
  }
