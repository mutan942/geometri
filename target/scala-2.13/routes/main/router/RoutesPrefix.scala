// @GENERATOR:play-routes-compiler
// @SOURCE:D:/scalaweb/conf/routes
// @DATE:Wed Dec 23 00:03:50 SGT 2020


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
