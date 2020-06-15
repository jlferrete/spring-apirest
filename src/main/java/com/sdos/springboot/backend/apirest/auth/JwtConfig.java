package com.sdos.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIBOQIBAAJBAOCldNndXvwNuX0xS8n/fbHRI82/GQM5IL69PUT+iSIydlx2M5Yz\r\n" + 
			"Mp0eovZFk9uzhUKC6YxSx2CrapwSZDOaUGUCAwEAAQJAROwehLU5biWb0kAsm4Xq\r\n" + 
			"f4LF9Fr8BpQhasPOp3tcgYPcoG4Hv5AFRJQIxvsFY6ImWSIrKSNKZnTTbmWbOnZp\r\n" + 
			"5QIhAPuRydWR3xMxtOLqn1kaHFKzN37VsKCJU1MPkOkSAFFzAiEA5JpIphwqZwqi\r\n" + 
			"WgMSE5wtbxiju/OgSThygxedJvJ5AMcCIFCUYhIGp21+fnIwtNnVgzz6Ksx1ph3F\r\n" + 
			"3uq8Ea6WFYQBAiABgqdyOYNqNN7Hu3d2G7UNI9uJFV38vdu70/8cz8NO5wIgejzi\r\n" + 
			"N1cfdCdo0Odp9YQgSFO5pRFROXAuqIqpaRvxq04=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAOCldNndXvwNuX0xS8n/fbHRI82/GQM5\r\n" + 
			"IL69PUT+iSIydlx2M5YzMp0eovZFk9uzhUKC6YxSx2CrapwSZDOaUGUCAwEAAQ==\r\n" + 
			"-----END PUBLIC KEY-----";
}
