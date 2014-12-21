package edu.sjsu.cmpe.cache.client;

import com.mashape.unirest.http.Unirest;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting Cache Client...");
        CRDTClient crdtClient = new CRDTClient();
	System.out.println("Step1:put 1=>a");
        crdtClient.put(1, "a"); 
	System.out.println("going to sleep now");
        Thread.sleep(30*1000);
       
	System.out.println("Step2:put 2=>a");
	crdtClient.put(1, "b");
	System.out.println("going to sleep now");
        Thread.sleep(30*1000);
        
        String final_value = crdtClient.get(1);
        System.out.println("Step 3: get(1) is" + final_value);

        System.out.println("Exiting Client...");
        Unirest.shutdown();
    }

}
