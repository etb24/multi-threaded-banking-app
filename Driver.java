

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	long startTime = System.currentTimeMillis();
    	
    	//start all threads
        Network objNetwork = new Network();
        System.out.println("\n [Main] Starting Network thread");
        objNetwork.start();
        
        System.out.println("\n [Main] Starting Server threads");
        Server objServer1 = new Server("1");
        objServer1.start();
        
        Server objServer2 = new Server("2");
        objServer2.start();
        
        Server objServer3 = new Server("3");
        objServer3.start();
        
        System.out.println("\n [Main] Starting Client Send thread");
        Client objClientSend = new Client("sending");
        objClientSend.start();
        
        System.out.println("\n [Main] Starting Client Receive thread");
        Client objClientReceive = new Client("receiving");
        objClientReceive.start();
        
        //wait for threads to finish
        try {
        	objClientSend.join();
            System.out.println("\n [Main] Client Send thread has terminated");
            
            objClientReceive.join();
            System.out.println("\n [Main] Client Receive thread has terminated");
            
            objServer1.join();
            System.out.println("\n [Main] Server thread 1 has terminated");
            
            objServer2.join();
            System.out.println("\n [Main] Server thread 2 has terminated");
            
            objServer3.join();
            System.out.println("\n [Main] Server thread 3 has terminated");
            
            objNetwork.join();
            System.out.println("\n [Main] Network thread has terminated");
            
            System.out.println("\n [Main] Banking Application terminated");
            
        } catch (InterruptedException e) {
            System.out.println("\n [Main] Thread execution was interrupted");
            e.printStackTrace();
        }
       
        long endTime = System.currentTimeMillis();
        System.out.println(" Total execution time: " + (endTime - startTime) + " milliseconds");
       
    }
    
 }
