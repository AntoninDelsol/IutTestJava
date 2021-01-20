package IutTestJava;

public class ClassePrincipale {
	private SingleClass laSingleClass = SingleClass.getInstance();
	public void afficheTexte () {
		System.out.println("Ceci est la classe principale");
		laSingleClass.printUuid();
	}
}
