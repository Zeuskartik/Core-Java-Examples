package coreJava;

public class Construction {

private boolean booleanMember;
private byte byteMember;
private short shortMember;
private int intMember;
private long longMember;
private char charMember;
private float floatMember;
private double doubleMember;
private Object referenceMember;

public Construction(){

System.out.println("boolean "+booleanMember);

System.out.println("byteMember "+byteMember);

System.out.println("shortMember "+shortMember);

System.out.println("intMember "+intMember);

System.out.println("longMember "+longMember);

System.out.println("floatMember "+floatMember);

System.out.println("doubleMember "+doubleMember);

System.out.println("referenceMember "+referenceMember);

System.out.println("charMember "+Character.codePointAt( new char[] { charMember }, 0 ));

}
public static void main (String Args[]){
	Construction d = new Construction();
	System.out.println(d);

}



}
