package com.ntl.microservices.MicroSRSLoginSignup.util;

import java.sql.Connection;

public interface DBUtil {
	static Connection getDBConnection(String driverType) {
		Connection con=null;
		return con;
	}
}
