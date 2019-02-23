package edu.battleship.modele;

public class Host {
	private int port;
	private String address;
	private boolean server;
	
	public Host(int port, String address, boolean server) {
		super();
		this.port = port;
		this.address = address;
		this.server = server;
	}

	public Host() {
		// TODO Auto-generated constructor stub
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isServer() {
		return server;
	}

	public void setServer(boolean server) {
		this.server = server;
	}

}
