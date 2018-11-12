package io.company

import spark.Spark.get

object HelloWorld {
  @JvmStatic
  fun main(args: Array<String>) {
    get("/hello") { _, _ -> "Bhello World!" }
    get("/hello/:name") { request, _ -> "Hello: " + request.params(":name") }
  }
}