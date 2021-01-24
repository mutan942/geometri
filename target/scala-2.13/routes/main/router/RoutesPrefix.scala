// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Utama/Semester 7/Scala/Ujian Socket/scala_soket/conf/routes
// @DATE:Sun Jan 24 13:51:20 SGT 2021


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
