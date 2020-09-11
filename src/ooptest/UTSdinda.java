package ooptest;

public class UTSdinda {
	public static void main (String[]args) {
		String abjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
		String sub_abjad = abjad.substring(3,4)+abjad.substring(8,9)+
				abjad.substring(13,14)+abjad.substring(3,4)+abjad.substring(0,1)+
				abjad.substring(27,28)+abjad.substring(15,16)+abjad.substring(20,21)+
				abjad.substring(19,20)+abjad.substring(17,18)+abjad.substring(8,9);
		
		System.out.println(sub_abjad);
	}
}
