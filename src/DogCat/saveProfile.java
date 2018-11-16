package DogCat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class saveProfile {
	public static String name; // 이름 등록 안한경우 null값
	public static int gender = -1; //(수컷은 0 , 암컷은 1, 선택안된경우 -1)
	public static Day birthday;
	public static String species;
	public static boolean create = false;
	public static String age;

	public static void saveFile() {
		File file = new File("profile.txt");
		String str = name + "/" + gender + "/" + birthday.years + "/" + birthday.months
				+ "/" + birthday.days + "/" + species + "/" + age;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(str);
			bw.close(); 
		} catch (IOException eI) {
			System.out.println("에러 발생");
		}
	}
	public static void loadFile() {
		File file = new File("profile.txt");
		String str = "";
		String[] splStr ;
		if(file.isFile()) {
			try {
				Scanner scan = new Scanner(file);
				str = scan.nextLine();
				splStr = str.split("/");
				saveProfile.name = splStr[0];
				saveProfile.gender = new Integer(splStr[1]);
				Day day = new Day(new Integer(splStr[2]), new Integer(splStr[3]), new Integer(splStr[4]));
				saveProfile.birthday = day;
				saveProfile.species = splStr[5];
				saveProfile.age = splStr[6];
				saveProfile.create = true;
			}
			catch (FileNotFoundException e) {
				System.out.println("에러 발생");
			} 
		}
	}
}


