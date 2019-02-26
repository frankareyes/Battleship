package edu.battleship.controller;

public class InfoConn {
	
	public enum EMODE {SOLO, CLIENT, SERVEUR}
	private EMODE mode;
	private int port;
	private String ipAdresse;
	
	public InfoConn(EMODE mode) {
		super();
		this.mode = mode;
		this.port = 0;
		this.ipAdresse = "";
	}

	public InfoConn(EMODE mode, int port, String ipAdresse) {
		super();
		this.mode = mode;
		this.port = port;
		this.ipAdresse = ipAdresse;
	}

	public EMODE getMode() {
		return mode;
	}

	public int getPort() {
		return port;
	}

	public String getIpAdresse() {
		return ipAdresse;
	}

}