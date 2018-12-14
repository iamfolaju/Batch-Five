//Name: Akpan Daniel
//Course: java
//centre: mushin
//Project title: Ip Locator
//Tel: 08083214684

package ip_locator;
import java.net.*;

public class IP_locator {

    
    public static void main(String[] args) {{try {             
    InetAddress address = InetAddress.getLocalHost();
    
    System.out.println("WElCoME TO DYBG LOCALIP APP");
    System.out.println();
    System.out.println("This app only getHostName and getLocalHost");
  
    System.out.println();
    System.out.println("IP address: " + address.getHostAddress());             
    System.out.println("Host name : " + address.getHostName()); 
     } 
                  
         catch (UnknownHostException uhEx) { 
             System.out.println( "Could not find local address!"); 
         }    
        
    }
    
}
}
