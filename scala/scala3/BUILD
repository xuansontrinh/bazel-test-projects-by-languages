load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary", "scala_library")

scala_library(
    name = "lib",
    srcs = ["Hello.scala", "Person.scala"],
    deps = ["@maven//:com_google_code_gson_gson",],
)

scala_binary(
    name = "main",
    srcs = ["Main.scala"],
    main_class = "hello",
    deps = [":lib"],
)
