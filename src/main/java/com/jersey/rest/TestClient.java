package com.jersey.rest;
import org.apache.commons.lang3.StringUtils;

public class TestClient {

	public static void main(String[] args) 
	{
		System.out.println((System.getProperty("simple.message")==null?"":System.getProperty("simple.message")) + StringUtils.swapCase(args.length<=0?"":args[0]) + " from REST Web Service Test Client !");
	}

}
