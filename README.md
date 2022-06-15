# play-silhouette-test
Test for issue https://github.com/honeycomb-cheesecake/play-silhouette/issues/15

## Setup
* `sbt new playframework/play-scala-seed.g8`
* Add v8.0.2 dependencies for Play-Silhouette
* `sbt compile`

## Issue
```
$ sbt --batch --color=never --supershell=never compile
[info] welcome to sbt 1.6.2 (Oracle Corporation Java 11.0.13)
[info] loading global plugins from C:\Users\Nick\.sbt\1.0\plugins
[info] loading settings for project play-silhouette-test-build from plugins.sbt ...
[info] loading project definition from C:\Users\Nick\play-silhouette-test\project
[info] loading settings for project root from build.sbt ...
[info]   __              __
[info]   \ \     ____   / /____ _ __  __
[info]    \ \   / __ \ / // __ `// / / /
[info]    / /  / /_/ // // /_/ // /_/ /
[info]   /_/  / .___//_/ \__,_/ \__, /
[info]       /_/               /____/
[info]
[info] Version 2.8.16 running Java 11.0.13
[info]
[info] Play is run entirely by the community. Please consider contributing and/or donating:
[info] https://www.playframework.com/sponsors
[info]
[info] Executing in batch mode. For better performance use sbt's shell
[warn]
[warn]  Note: Unresolved dependencies path:
[error] sbt.librarymanagement.ResolveException: Error downloading com.atlassian.jwt:jwt-api:3.2.3
[error]   Not found
[error]   Not found
[error]   not found: C:\Users\Nick\.ivy2\localcom.atlassian.jwt\jwt-api\3.2.3\ivys\ivy.xml
[error]   not found: https://repo1.maven.org/maven2/com/atlassian/jwt/jwt-api/3.2.3/jwt-api-3.2.3.pom
[error] Error downloading com.atlassian.jwt:jwt-core:3.2.3
[error]   Not found
[error]   Not found
[error]   not found: C:\Users\Nick\.ivy2\localcom.atlassian.jwt\jwt-core\3.2.3\ivys\ivy.xml
[error]   not found: https://repo1.maven.org/maven2/com/atlassian/jwt/jwt-core/3.2.3/jwt-core-3.2.3.pom
[error]         at lmcoursier.CoursierDependencyResolution.unresolvedWarningOrThrow(CoursierDependencyResolution.scala:345)
[error]         at lmcoursier.CoursierDependencyResolution.$anonfun$update$38(CoursierDependencyResolution.scala:314)
[error]         at scala.util.Either$LeftProjection.map(Either.scala:573)
[error]         at lmcoursier.CoursierDependencyResolution.update(CoursierDependencyResolution.scala:314)
[error]         at sbt.librarymanagement.DependencyResolution.update(DependencyResolution.scala:60)
[error]         at sbt.internal.LibraryManagement$.resolve$1(LibraryManagement.scala:59)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$12(LibraryManagement.scala:133)
[error]         at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:73)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$20(LibraryManagement.scala:146)
[error]         at scala.util.control.Exception$Catch.apply(Exception.scala:228)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11(LibraryManagement.scala:146)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11$adapted(LibraryManagement.scala:127)
[error]         at sbt.util.Tracked$.$anonfun$inputChangedW$1(Tracked.scala:219)
[error]         at sbt.internal.LibraryManagement$.cachedUpdate(LibraryManagement.scala:160)
[error]         at sbt.Classpaths$.$anonfun$updateTask0$1(Defaults.scala:3690)
[error]         at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error]         at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error]         at sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error]         at sbt.Execute.work(Execute.scala:291)
[error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error]         at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error]         at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[error]         at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error]         at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error]         at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error]         at java.base/java.lang.Thread.run(Thread.java:834)
[error] (update) sbt.librarymanagement.ResolveException: Error downloading com.atlassian.jwt:jwt-api:3.2.3
[error]   Not found
[error]   Not found
[error]   not found: C:\Users\Nick\.ivy2\localcom.atlassian.jwt\jwt-api\3.2.3\ivys\ivy.xml
[error]   not found: https://repo1.maven.org/maven2/com/atlassian/jwt/jwt-api/3.2.3/jwt-api-3.2.3.pom
[error] Error downloading com.atlassian.jwt:jwt-core:3.2.3
[error]   Not found
[error]   Not found
[error]   not found: C:\Users\Nick\.ivy2\localcom.atlassian.jwt\jwt-core\3.2.3\ivys\ivy.xml
[error]   not found: https://repo1.maven.org/maven2/com/atlassian/jwt/jwt-core/3.2.3/jwt-core-3.2.3.pom
[error] Total time: 2 s, completed 15 Jun 2022, 21:50:10
```
