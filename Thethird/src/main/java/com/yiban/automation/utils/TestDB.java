package com.yiban.automation.utils;

import java.sql.*;

public class TestDB {

	String checkcode;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://10.21.3.45:3309/bbscore";
	String user = "admin";
	String password = "yiban_tongyi";

	public String checkcode(String sql) {

		try {
			// ���������
			Class.forName(driver);

			// ������ݿ�
			Connection conn = DriverManager.getConnection(url, user, password);

			if (!conn.isClosed())
				System.out.println("Succeeded connecting to the Database!");

			// statement����ִ��SQL���
			Statement statement = conn.createStatement();

			// Ҫִ�е�SQL���
			// String sql =
			// "select checkcode from reg_check_email order by create_time desc limit 1 ";

			// ���
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {

				// ѡ��sname�������
				checkcode = rs.getString("checkcode");

				// ����ʹ��ISO-8859-1�ַ�name����Ϊ�ֽ����в������洢�µ��ֽ������С�
				// Ȼ��ʹ��GB2312�ַ����ָ�����ֽ�����

				// ������
				// System.out.println("\t" + checkcode);
			}

			rs.close();
			conn.close();

		} catch (ClassNotFoundException e) {

			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		}
		return checkcode;

	}

//	public static void main(String[] args) {

//		TestDB tt = new TestDB();
//		System.out.println(tt.checkcode("select checkcode from reg_check_email order by create_time desc limit 1 "));

//	}

}