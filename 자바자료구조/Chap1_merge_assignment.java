package 자바자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class Chap1_merge_assignment {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add(1, "LA");

		//
		System.out.println("collection.sort()::");
		Collections.sort(list1);
		System.out.println("list1::");
		for (String city : list1)
			System.out.print(city + " ");
		System.out.println();
		System.out.println("list2::");
		Collections.sort(list2);
		for (String city : list2)
			System.out.print(city + " ");
		ArrayList<String> list3 = new ArrayList<String>();

		Iterator<String> iter1 = list1.iterator();
		Iterator<String> iter2 = list2.iterator();

		String s1 = iter1.next();
		String s2 = iter2.next();

		while (iter1.hasNext() && iter2.hasNext()) {
			if (s1.compareTo(s2) > 0) {
				list3.add(s2);

				if (iter2.hasNext()) {
					s2 = iter2.next();
				} else {
					break;
				}

			} else if (s1.compareTo(s2) == 0) {
				list3.add(s1);

				if (iter1.hasNext()) {
					s1 = iter1.next();
				} else {
					break;
				}
				if (iter2.hasNext()) {
					s2 = iter2.next();
				} else {
					break;
				}

			} else {
				list3.add(s1);
				if (iter1.hasNext()) {
					s1 = iter1.next();
				} else {
					break;
				}
			}
		}

		while (iter1.hasNext()) {
			list3.add(s1);
			if (iter1.hasNext())
				s1 = iter1.next();
			else
				break;
		}
		while (iter2.hasNext()) {
			list3.add(s2);
			if (iter2.hasNext())
				s2 = iter2.next();
			else
				break;
		}
		System.out.println();
		System.out.println("merge:: ");

		for (String city : list3)
			System.out.print(city + " ");

	}
}
