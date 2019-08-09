package com.linfix.study.index01;


import com.linfix.study.util.DataModelBuildUtil;

import net.sf.json.JSONObject;

public class Student {
	
	private String sname;
	
	private int sage;
	
	private String ssex;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	
	public Student() {
		super();
	}

	public Student(String sname, int sage, String ssex) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
	}
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", ssex=" + ssex + "]";
	}

	public static void main(String[] args) throws Exception {
		Student stu = new Student("linhu", 18, "男");
		JSONObject stuStr = JSONObject.fromObject(stu);
		System.out.println(stuStr);
		Student student = null;
		try {
			student = DataModelBuildUtil.buildModel(stuStr, Student.class, null);
		} catch (Exception e) {
			throw new Exception("失败");
		}
		System.out.println(student);
	}
}
