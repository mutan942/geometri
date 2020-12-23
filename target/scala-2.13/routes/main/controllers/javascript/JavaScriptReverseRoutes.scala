// @GENERATOR:play-routes-compiler
// @SOURCE:D:/scalaweb/conf/routes
// @DATE:Wed Dec 23 08:39:33 SGT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseKelompok(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def dataku: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Kelompok.dataku",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hhh"})
        }
      """
    )
  
    // @LINE:10
    def hitung_pp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Kelompok.hitung_pp",
      """
        function(panjang0,lebar1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hitung_p" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("panjang", panjang0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("lebar", lebar1)])})
        }
      """
    )
  
    // @LINE:11
    def hitung_lingkaran: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Kelompok.hitung_lingkaran",
      """
        function(jari0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hitung_l" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("jari", jari0)])})
        }
      """
    )
  
    // @LINE:13
    def history: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Kelompok.history",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
        }
      """
    )
  
    // @LINE:9
    def hitung_segitiga: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Kelompok.hitung_segitiga",
      """
        function(alas0,tinggi1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hitung_s" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("alas", alas0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("tinggi", tinggi1)])})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Kelompok.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
