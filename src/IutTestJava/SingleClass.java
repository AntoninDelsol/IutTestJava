package IutTestJava;

import java.io.Serializable;
import java.util.UUID;

public class SingleClass implements Serializable{
	private static SingleClass laSingleClass;
	private UUID uuid;
	
	private SingleClass () {
		this.uuid = UUID.randomUUID();
	}
	
	public static SingleClass getInstance() {
		if (laSingleClass==null) {
			laSingleClass=new SingleClass();
		}
		return laSingleClass;		
	}
	
	public void printUuid() {
		System.out.println(this.uuid.toString());
	}
}
