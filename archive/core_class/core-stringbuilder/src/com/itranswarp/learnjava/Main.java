package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
	}

	static String buildInsertSql(String table, String[] fields) {
		StringBuilder ss = new StringBuilder();
		ss.append("INSERT INTO ").append(table).append(" (");
		for(int i = 0; i < fields.length - 1; i++){
			ss.append(fields[i]).append(", ");
		}

		ss.append(fields[fields.length - 1]).append(") VALUES (");

		for(int i = 0; i < fields.length - 1; i++){
			ss.append("?, ");
		}
		
		ss.append("?)");

		return ss.toString();
	}

}
