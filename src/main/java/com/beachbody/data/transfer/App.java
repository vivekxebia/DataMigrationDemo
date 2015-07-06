package com.beachbody.data.transfer;

import java.sql.SQLException;
import java.util.Scanner;

import com.beachbody.data.transfer.service.controller.FetchTrainerDataController;




/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args ) throws SQLException
    {
    	final FetchTrainerDataController fetchTrainerDataController= new FetchTrainerDataController();
    	@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
    	System.out.println("Enter DataBase Name From 'test' and 'xebia_hrims'");
    	String dataBaseName=sc.next();
    	fetchTrainerDataController.getData(dataBaseName);
    	
    }
}
    
