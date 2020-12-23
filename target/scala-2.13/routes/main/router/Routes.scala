// @GENERATOR:play-routes-compiler
// @SOURCE:D:/scalaweb/conf/routes
// @DATE:Wed Dec 23 08:39:33 SGT 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Kelompok_2: controllers.Kelompok,
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:18
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Kelompok_2: controllers.Kelompok,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:18
    Assets_0: controllers.Assets
  ) = this(errorHandler, Kelompok_2, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Kelompok_2, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Kelompok.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hitung_s""", """controllers.Kelompok.hitung_segitiga(alas:String, tinggi:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hitung_p""", """controllers.Kelompok.hitung_pp(panjang:String, lebar:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hitung_l""", """controllers.Kelompok.hitung_lingkaran(jari:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.Kelompok.history"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hhh""", """controllers.Kelompok.dataku"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Kelompok_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Kelompok_index0_invoker = createInvoker(
    Kelompok_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Kelompok",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_1.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Kelompok_hitung_segitiga2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hitung_s")))
  )
  private[this] lazy val controllers_Kelompok_hitung_segitiga2_invoker = createInvoker(
    Kelompok_2.hitung_segitiga(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Kelompok",
      "hitung_segitiga",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """hitung_s""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Kelompok_hitung_pp3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hitung_p")))
  )
  private[this] lazy val controllers_Kelompok_hitung_pp3_invoker = createInvoker(
    Kelompok_2.hitung_pp(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Kelompok",
      "hitung_pp",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """hitung_p""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Kelompok_hitung_lingkaran4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hitung_l")))
  )
  private[this] lazy val controllers_Kelompok_hitung_lingkaran4_invoker = createInvoker(
    Kelompok_2.hitung_lingkaran(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Kelompok",
      "hitung_lingkaran",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hitung_l""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_tutorial5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial5_invoker = createInvoker(
    HomeController_1.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Kelompok_history6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Kelompok_history6_invoker = createInvoker(
    Kelompok_2.history,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Kelompok",
      "history",
      Nil,
      "GET",
      this.prefix + """history""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Kelompok_dataku7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hhh")))
  )
  private[this] lazy val controllers_Kelompok_dataku7_invoker = createInvoker(
    Kelompok_2.dataku,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Kelompok",
      "dataku",
      Nil,
      "GET",
      this.prefix + """hhh""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Kelompok_index0_route(params@_) =>
      call { 
        controllers_Kelompok_index0_invoker.call(Kelompok_2.index)
      }
  
    // @LINE:8
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_1.explore)
      }
  
    // @LINE:9
    case controllers_Kelompok_hitung_segitiga2_route(params@_) =>
      call(params.fromQuery[String]("alas", None), params.fromQuery[String]("tinggi", None)) { (alas, tinggi) =>
        controllers_Kelompok_hitung_segitiga2_invoker.call(Kelompok_2.hitung_segitiga(alas, tinggi))
      }
  
    // @LINE:10
    case controllers_Kelompok_hitung_pp3_route(params@_) =>
      call(params.fromQuery[String]("panjang", None), params.fromQuery[String]("lebar", None)) { (panjang, lebar) =>
        controllers_Kelompok_hitung_pp3_invoker.call(Kelompok_2.hitung_pp(panjang, lebar))
      }
  
    // @LINE:11
    case controllers_Kelompok_hitung_lingkaran4_route(params@_) =>
      call(params.fromQuery[String]("jari", None)) { (jari) =>
        controllers_Kelompok_hitung_lingkaran4_invoker.call(Kelompok_2.hitung_lingkaran(jari))
      }
  
    // @LINE:12
    case controllers_HomeController_tutorial5_route(params@_) =>
      call { 
        controllers_HomeController_tutorial5_invoker.call(HomeController_1.tutorial)
      }
  
    // @LINE:13
    case controllers_Kelompok_history6_route(params@_) =>
      call { 
        controllers_Kelompok_history6_invoker.call(Kelompok_2.history)
      }
  
    // @LINE:14
    case controllers_Kelompok_dataku7_route(params@_) =>
      call { 
        controllers_Kelompok_dataku7_invoker.call(Kelompok_2.dataku)
      }
  
    // @LINE:18
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
