package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import java.net.ServerSocket
import java.net.Socket
import java.io.IOException
import java.io.DataInputStream
import java.io.DataOutputStream
import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

@Singleton
class ClientSocket @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

   def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.clientpertama())
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  def minta_balik(stringku:String) = Action { 
    //println("Open connection to "+hostname+" at port "+portnumber)
    var hasil = ""
    try{
        val sock=new Socket("localhost",6000)
        if(sock.isConnected){
        //  println("Connected...")
          val din=new DataInputStream(sock.getInputStream)
          val dout=new DataOutputStream(sock.getOutputStream)

          dout.writeUTF(stringku.toString())
          val msgreceive=din.readUTF()
          //println("Receive from server : "+msgreceive)
          hasil = "<div class='alert alert-primary' role='alert'>Response : "+msgreceive+"</div>"
        }else{
          hasil = "<div class='alert alert-danger' role='alert'>Gagal terkoneksi ke server !</div>"
        }
    }catch {
        case e: Exception => hasil = "<div class='alert alert-danger' role='alert'>Gagal terkoneksi ke server !</div>"
    }
    
    Ok(hasil)
  }

  def latihan2(stringku:String) = Action { 
    val portku = Array(5000, 7000, 8000)
    var hasil=stringku.split(" ")
    var pesan = ""
    var kiriman = ""
    val listku = hasil.toList
    val sizeku = listku.size/3
    if (sizeku<1){
        pesan = "<div class='alert alert-danger' role='alert'>Jumlah kata "+sizeku+", kurang dari 3 !</div>"
    }else{
        var no=0;
        for(x <- listku.grouped(sizeku)) 
        { 
            try{
            val sock=new Socket("localhost",portku(no))
                if(sock.isConnected){
                //  println("Connected...")
                  val din=new DataInputStream(sock.getInputStream)
                  val dout=new DataOutputStream(sock.getOutputStream)

                  for(y <-x) 
                  { 
                    kiriman += y+" "
                  }

                  dout.writeUTF(kiriman)
                  val msgreceive=din.readUTF()
                  //println("Receive from server : "+msgreceive)
                  pesan += "<div class='alert alert-primary' role='alert'>Response Server ["+portku(no)+"] : "+msgreceive+"</div>"
                }else{
                  pesan += "<div class='alert alert-danger' role='alert'>Gagal terkoneksi ke Server ["+portku(no)+"] !</div>"
                }
            }catch {
                case e: Exception => pesan += "<div class='alert alert-danger' role='alert'>Gagal terkoneksi ke Server ["+portku(no)+"] !</div>"
            }
            if(no==2){
              no=0
            }else{
              no=no+1
            }
            kiriman = ""
        } 
    }
    val jsonString = Json.toJson(hasil)
    Ok(pesan)
  }
}
