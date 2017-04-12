package blueprint;

public class House {
	int address = 32;
	String schoolName = "Peoplentech";
	int rooms = 3;
	String tv = "Watch Game of Thrones";
		
		public int numberOfBedRooms(){
			System.out.println("Number of Rooms: "+rooms);
			return rooms;
		}
		public void watchTV(){
			System.out.println(tv);
		}
		public void sleep(){
			System.out.println("I sleep in my bedroom");
		}
		public void houseName() {
			System.out.println(schoolName);
			
		}
	}