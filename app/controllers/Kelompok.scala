package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import java.io.{File, FileWriter, PrintWriter}

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
    val writer = new FileWriter("Geometri.txt",true)
    val ade = new PrintWriter(writer)

    ade.println("Segitiga:alas = "+alas+" tinggi = "+tinggi+":"+hasil)
    ade.close()
     Ok(hasil.toString())
  }

  def hitung_pp(p:String,l:String) = Action { 
    val hasil = p.toInt*l.toInt
    val writer = new FileWriter("Geometri.txt",true)
    val ade = new PrintWriter(writer)

    ade.println("Persegi Panjang:panjang = "+p+" lebar = "+l+":"+hasil)
    ade.close()
     Ok(hasil.toString())
  }

  def hitung_lingkaran(jari:String) = Action { 
    val hasil = jari.toInt*jari.toInt*math.Pi
    val writer = new FileWriter("Geometri.txt",true)
    val ade = new PrintWriter(writer)

    ade.println("Lingkaran:jari-jari = "+jari+":"+hasil)
    ade.close()
     Ok(hasil.toString())
  }

  def history() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.history())
  }

  def dataku() = Action { 
   val fileName = "Geometri.txt"
    val bufferedSource = scala.io.Source.fromFile(fileName)
    var html = ""
    var no = 0
    for (lines <- bufferedSource.getLines()) {
      no=no+1
      html += "<tr><td>"+no+"</td>"
      var ade = lines.split(":")
      for (e <- ade) {
        html += "<td>"+e+"</td>"
      }
       html += "</tr>"
    }
    Ok(html)
  }
}
