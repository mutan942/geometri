package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

@Singleton
class Kelompok @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

   def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  def hitung_segitiga(alas:String,tinggi:String) = Action { 
    val hasil = (alas.toInt*tinggi.toInt)/2
     Ok(hasil.toString())
  }

  def hitung_pp(p:String,l:String) = Action { 
    val hasil = p.toInt*l.toInt
     Ok(hasil.toString())
  }

  def hitung_lingkaran(jari:String) = Action { 
    val hasil = jari.toInt*jari.toInt*math.Pi
     Ok(hasil.toString())
  }

}
