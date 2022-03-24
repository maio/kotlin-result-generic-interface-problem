# kotlin-result-generic-interface-problem

```
$ ./run-test
To honour the JVM settings for this build a single-use Daemon process will be forked. See https://docs.gradle.org/7.4.1/userguide/gradle_daemon.html#sec:disabling_the_daemon.
Daemon will be stopped at the end of the build
> Task :compileKotlin UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestKotlin UP-TO-DATE
> Task :compileTestJava NO-SOURCE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE

> Task :test FAILED

FooTest > test handle1() FAILED
    java.lang.ClassCastException: class kotlin.Result$Failure cannot be cast to class kotlin.Result (kotlin.Result$Failure and kotlin.Result are in unnamed module of loader 'app')
        at cz.maio.test.FooTest.test handle1(FooTest.kt:9)

2 tests completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///app/build/reports/tests/test/index.html

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 48s3 actionable tasks: 1 executed, 2 up-to-date
```
