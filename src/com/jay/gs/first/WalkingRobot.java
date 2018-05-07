package com.jay.gs.first;

public class WalkingRobot {

	public static void main(String[] args) {
		String path = "UDDRLDURLUDD";
		String path2 = "UDDLLRUUUDUURUDDUULLDRRRR";
		String path3 = "UDDLRL";
		
		walkRobot(path);
		walkRobot(path2);
		walkRobot(path3);
	}
	
	public static void walkRobot(String path) {
		char[] ch = path.toCharArray();
		Point p = new Point();
		for(char c : ch) {
			move(p, String.valueOf(c));
		}
		
		System.out.println("Final Position will be: [" + p.getX() + ", " + p.getY() + "]");
	}
	
	public static Point move(Point p, String dir)	 {
		
		if("U".equals(dir)) {
			p.setY(p.getY() + 1);
		} else if("D".equals(dir)) {
			p.setY(p.getY() - 1);
		} else if("L".equals(dir)) {
			p.setX(p.getX() - 1);
		} else if("R".equals(dir)) {
			p.setX(p.getX() + 1);
		}
		return p;
	}
}


class Point {
	private int x;
	private int y;
	public Point() {
	
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}