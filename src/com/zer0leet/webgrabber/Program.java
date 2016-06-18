/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet.webgrabber;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Deepika
 */
public class Program {

   
    public static void main(String[] args) {
        try{
            String link="http://www.jobsnepal.com/images/logo.png";
        URL url = new URL (link);
        URLConnection conn=url.openConnection();
          String[] data=link.split("/");
          FileOutputStream os= new FileOutputStream(data[data.length-1]);
      InputStream is=conn.getInputStream();
      byte[] byt=new byte[1024];
      int i=0;
      while((i=is.read(byt))!=-1){
          os.write(byt, 0, i);
        }
        is.close();
        System.out.println("File Downloaded");
        os.close();
        }
      catch(IOException ioe){
            
    }
    }
}
