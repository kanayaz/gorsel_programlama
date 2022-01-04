package dbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.*;



public class MysqlDb {
	Connection c =null;
	public static String deneme;
	
	public Connection MysqlDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql:localhost:3306/okul","***","***");
			Statement stm = c.createStatement();
			ResultSet rs=stm.executeQuery("select * from kullanicilar where name='ibrahim';");
			while (rs.next()) {
				deneme=rs.getString("name");
				
			}
			return c;
			}
					
		catch (Exception e) {
			deneme=e.toString();
		}
		return c;
		
	
	}
	public String userControl(String nam) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
			String requ = "select * from kullanicilar where (kname='"+nam+"');";
			//c= this.c;
			String donus = null;
			Statement stm = c.createStatement();
			ResultSet rs=stm.executeQuery(requ);
			while(rs.next()) {
				donus=rs.getString(4);
			}
			return donus;
		} catch (Exception e) {
			// TODO: handle exception
				return e.toString();
		}
	}
	public String gizliSoru(String nam) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
			String requ = "select gizliSoru from kullanicilar where (kname='"+nam+"');";
			String donus = null;
			Statement stm = c.createStatement();
			ResultSet rs=stm.executeQuery(requ);
			while(rs.next()) {
				donus=rs.getString(1);
			}
			return donus;
		} catch (Exception e) {
			// TODO: handle exception
				return e.toString();
		}
	}
	public String gizliCevap(String nam) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
			String requ = "select * from kullanicilar where (kname='"+nam+"');";
			String donus = null;
			Statement stm = c.createStatement();
			ResultSet rs=stm.executeQuery(requ);
			while(rs.next()) {
				donus=rs.getString(6);
			}
			return donus;
		} catch (Exception e) {
			// TODO: handle exception
				return e.toString();
		}
	}
	public String gelenSifre(String nam) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
			String requ = "select * from kullanicilar where (kname='"+nam+"');";
			String donus = null;
			Statement stm = c.createStatement();
			ResultSet rs=stm.executeQuery(requ);
			while(rs.next()) {
				donus=rs.getString(4);
			}
			return donus;
		} catch (Exception e) {
			// TODO: handle exception
				return e.toString();
		}
	}
	public boolean setP(String name,String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
			String requ = "update kullanicilar set sifre='"+pass+"' where (kName='"+name+"');";
			String donus = null;
			Statement stm = c.createStatement();
			stm.execute(requ);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
public int sinifSay() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
			String requ = "select count(distinct sinif) from sinif";
			int donus = 0;
			Statement stm = c.createStatement();
			ResultSet rs=stm.executeQuery(requ);
			while(rs.next()) {
				donus=rs.getInt(1);
				return donus;
			}

		} catch (Exception e) {
			return 0;
		}
		return 0;
	}
public int sinifSec(int say) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "select distinct sinif  from sinif";
		int donus = 0;
		Statement stm = c.createStatement();
		ResultSet rs=stm.executeQuery(requ);
		int row=0;
		while(rs.next()) {
			if(row==say) {
				donus=rs.getInt(1);
				return donus;
			}
			row++;
		
		}
	} catch (Exception e) {
		System.out.print(e.toString()+"\n");
		return 88;
		
	}
	return 99;
}
public int subeSay(int s) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "select count(sube) from sinif where sinif='"+s+"'";
		int donus = 0;
		Statement stm = c.createStatement();
		ResultSet rs=stm.executeQuery(requ);
		while(rs.next()) {
			donus=rs.getInt(1);
			return donus;
		}

	} catch (Exception e) {
		return 0;
	}
	return 0;
}
public String subeSec(int say,int s) {

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
	String requ = "select sube  from sinif where sinif='"+s+"'";
	
	String donus = null;
	Statement stm = c.createStatement();
	ResultSet rs=stm.executeQuery(requ);
	int row=0;
	while(rs.next()) {
		if(row==say) {
			donus=rs.getString("sube");
			return donus;
		}
		row++;
	
	}
} catch (Exception e) {
	System.out.print(e.toString()+"\n");
	return "hata";
	
}
return "komple hata";
}
public boolean kaydet(String a,String b,String m,String d,String e,String f,String g,int h, String i, int j, int k, int l) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "insert into ogrenciler"
				+ "(tcno, isim, soyisim, bisim, aisim, dyeri, dtarihi, sinif, sube, okulno, tucret, taksit, aktiflik) "
				+ "values ('"+a+"','"+b+"','"+m+"','"+d+"','"+e+"','"+f+"','"+g+"',"+h+",'"+i+"',"+j+","+k+","+l+",true);";
		Statement stm = c.createStatement();
		stm.executeUpdate(requ);
		
		return true;
	} catch (Exception z) {
		System.out.print(z);
		return false;
	}
}
public boolean ucretKaydet(String a, int b, int d) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "insert into u"+d+" (tcno,ucret) values ('"+a+"',"+b+");";
		Statement stm = c.createStatement();
		stm.executeUpdate(requ);
		
		return true;
	} catch (Exception z) {
		System.out.print(z);
		return false;
	}
}
public int taksit(String tc,int i) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "select * from u"+i+" where (tcno='"+tc+"');";
		int donus = 0;
		Statement stm = c.createStatement();
		ResultSet rs=stm.executeQuery(requ);
		while(rs.next()) {
			donus=Integer.parseInt(rs.getString(2));
		}
		return donus;
	} catch (Exception e) {
		// TODO: handle exception
			return 0;
	}
}
public boolean kayitSE(String tc,Boolean jbool) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "update ogrenciler set aktiflik="+jbool+" where (tcno='"+tc+"');";
		String donus = null;
		Statement stm = c.createStatement();
		stm.execute(requ);
		
		return true;
	} catch (Exception e) {
		return false;
	}
}
public boolean olustur(String a,String b,String m,String d,String e,String f) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "insert into kullanicilar(name, surname, kName, sifre, gizliSoru, gizliCeap)  VALUES ("
				+ "'"+a+"','"+b+"','"+m+"','"+d+"','"+e+"','"+f+"');";
		Statement stm = c.createStatement();
		stm.executeUpdate(requ);
		
		return true;
	} catch (Exception z) {
		System.out.print(z);
		return false;
	}
}
public boolean sil(String a) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","***","***");
		String requ = "DELETE FROM kullanicilar where (kName='"+a+"';";
		Statement stm = c.createStatement();
		ResultSet rs=stm.executeQuery(requ);
		rs.first(); 
			
		

		
		return true;
	} catch (Exception z) {
		System.out.print(z);
		return false;
	}
}
}
