// @GENERATOR:play-routes-compiler
// @SOURCE:D:/scalaweb/conf/routes
// @DATE:Wed Dec 23 00:03:50 SGT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:8
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
  }

  // @LINE:7
  class ReverseKelompok(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def hitung_pp(panjang:String, lebar:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hitung_p" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("panjang", panjang)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("lebar", lebar)))))
    }
  
    // @LINE:9
    def hitung_segitiga(alas:String, tinggi:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hitung_s" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("alas", alas)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("tinggi", tinggi)))))
    }
  
    // @LINE:11
    def hitung_lingkaran(jari:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hitung_l" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("jari", jari)))))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
