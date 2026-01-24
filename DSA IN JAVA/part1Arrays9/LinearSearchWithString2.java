package part1Arrays9;

public class LinearSearchWithString2 {
	public static int linearSearchMenu(String menu[], String selectIteam) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i] == selectIteam) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String menu[] = {"Dosa","Samosa","Chole bhatore","Momos","Chaat"};
		String selectIteam = "Momos";
		int index = linearSearchMenu(menu, selectIteam);
		if(menu[index] != selectIteam) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Iteam index is : "+index);
		}
	}
}
