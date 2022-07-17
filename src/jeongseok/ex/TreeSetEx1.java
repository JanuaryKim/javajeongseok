package jeongseok.ex;

import java.util.*;

class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		String from = "b";
		String to	= "d";

		set.add("abcd");set.add("addd");set.add("batewr");set.add("ccde");
		set.add("Addf");set.add("Cdfe");set.add("zzzzs");set.add("ddZXX");
		set.add("Bddas");set.add("bbdz");set.add("tgfgfd");set.add("adx");
		set.add("11asd");set.add("xcx");set.add(" dzzz"); set.add(" dzzzz");
		set.add(" dz=");set.add("dzz");

		System.out.println();
		System.out.println("==원래 구조==");
		System.out.println(set);
		System.out.println("==원래 구조==");
		System.out.println();
		System.out.println("== from ~ to ==");
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("== from ~ to ==");
		System.out.println();
		System.out.println("== from ~ dzzz ==");
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		System.out.println("== from ~ dzzz ==");
		System.out.println();
	}
}
