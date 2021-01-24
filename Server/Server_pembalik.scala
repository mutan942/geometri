import java.net.ServerSocket
import java.net.Socket
import java.net._
import java.io.IOException
import java.io.DataInputStream
import java.io.DataOutputStream

import scala.collection.mutable.Stack



class HandleClient(sock:Socket) extends Thread{
  override def run(){
    var s = Stack[Char]()
    var strtam = ""
    val din=new DataInputStream(sock.getInputStream)
    val dout=new DataOutputStream(sock.getOutputStream)
    try{

      val str1=din.readUTF

      val result = str1.toCharArray()

      for(m1<-result) {
        s.push(m1)
      }
      for(m1<-result)
      {
        strtam+=s.pop
      }

      println("Receive a string : "+str1)
      //val str2=str1+" juga"
      dout.writeUTF(strtam)

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


class myServer(portnumber:Int){
  def startServer(){

    val serv=new ServerSocket(portnumber)
    println("Server started at : "+portnumber)
    while(true){
      val sock=serv.accept
      if(sock.isConnected){
        println("There is a client connected...")
        println("a thread for handle the client is started...")
        val thandle=new HandleClient(sock)
        new Thread(thandle).start()
      }
    }

  }

}



object Server_pembalik{

  def main(args:Array[String]){

    val p=new myServer(6000)
    p.startServer

  }

}
