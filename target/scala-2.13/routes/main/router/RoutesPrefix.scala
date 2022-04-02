// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alexandermadronero/Documents/Courses/akka/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Jun 18 22:41:55 COT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
