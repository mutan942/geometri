import java.net.ServerSocket
import java.net.Socket
import java.net._
import java.io.IOException
import java.io.DataInputStream
import java.io.DataOutputStream

import scala.collection.mutable.Stack



class HandleClient_last(sock:Socket) extends Thread{
  override def run(){
    var strtam = ""
    val din=new DataInputStream(sock.getInputStream)
    val dout=new DataOutputStream(sock.getOutputStream)
    try{

      val str1=din.readUTF

      var hasil=str1.split(" ")
      val listku = hasil.toList
      val akhir = listku.sortWith(_ < _)
      for(y <-akhir)
      {
        strtam += y+" "
      }

      println("Receive a string : "+str1)
      println("Ordered string : "+strtam.trim())
      //val str2=str1+" juga"
      dout.writeUTF(strtam.trim())

    }catch {
      case e: Exception => None
    }
    finally {
      try {
        if (dout != null) {
          dout.close()
        }
        if (din != null) {
          din.close()
          sock.close
        }
      }catch {
        case e: Exception => None
      }
    }
  }
}


class myServer_last(portnumber:Int){
  def startServer(){

    val serv=new ServerSocket(portnumber)
    println("Server started at : "+portnumber)
    while(true){
      val sock=serv.accept
      if(sock.isConnected){
        println("There is a client connected...")
        println("a thread for handle the client is started...")
        val thandle=new HandleClient_last(sock)
        new Thread(thandle).start()
      }
    }

  }

}



object Server_last{

  def main(args:Array[String]){

    val p=new myServer_last(5000)
    p.startServer

  }

}
