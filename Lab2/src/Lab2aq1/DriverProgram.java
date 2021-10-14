package Lab2aq1;

public class DriverProgram {

	public static void main(String[] args) {
		
						HotelRoom FirstRoom = new HotelRoom();		
						HotelRoom SecondRoom = new HotelRoom();

						FirstRoom.setRoomNumber(200);
						FirstRoom.setRoomType("Single");
						
						
						System.out.println("roomA (room number is " + FirstRoom.getRoomNumber() + ",type is'" + FirstRoom.getRoomType() + "')" );
						
						System.out.println();
						
						SecondRoom.setRoomNumber(201);
						SecondRoom.setRoomType("Double");

						System.out.println("roomB (room number is " + SecondRoom.getRoomNumber() + ",type is'" + SecondRoom.getRoomType() + "')" );
						

	}

}
