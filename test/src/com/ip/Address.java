package com.ip;

import java.net.*;
import java.rmi.UnknownHostException;

public class Address {
	public static void main(String[] args) throws java.net.UnknownHostException {
		InetAddress ip;
		ip = InetAddress.getLocalHost();
		String localname = ip.getHostName();
		String localip = ip.getHostAddress();
		System.out.println("本机名："+localname);
		System.out.println("本机IP地址："+localip);
	}
}
