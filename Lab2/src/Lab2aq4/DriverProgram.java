package Lab2aq4;

public class DriverProgram {

	public static void main(String[] args) {
		
						String roomStatus;
						String roomOccupied;

						HotelRoom FirstRoom = new HotelRoom();		
						HotelRoom SecondRoom = new HotelRoom();
						HotelRoom ThirdRoom = new HotelRoom(202,"Single",0,90);

						FirstRoom.setRoomNumber(200);
						FirstRoom.setRoomType("Single");
						FirstRoom.setRoomStatus(1);
						FirstRoom.setRoomRate(100);
						
						if(FirstRoom.getisOccupied()==true)
						{roomStatus = "Vacanat";}
						else {roomStatus = "Ocuppied";}
						
						System.out.println("roomA (room number is " + FirstRoom.getRoomNumber() + ",type is'" + FirstRoom.getRoomType() + "')" );
						System.out.println("roomA is " + roomStatus + " and the rate is " + FirstRoom.getRoomRate());
						
						System.out.println();
						
						SecondRoom.setRoomNumber(201);
						SecondRoom.setRoomType("Double");
						SecondRoom.setRoomStatus(0);
						SecondRoom.setRoomRate(80);

						/*If (roomB.isoccupied() == false)
						 * 	{
						 * 		roomb.seticcyoued(1);
						 * 	}*/
						if(SecondRoom.getisOccupied()==false)
						{roomOccupied = "Is not Ocuppied";}
						else {roomOccupied = "The room Is allready Ocuppied";}
						
						if(SecondRoom.getRoomStatus()==0)
						{roomStatus = "Vacanat";}
						else {roomStatus = "Ocuppied";}
						
						System.out.println("roomB (room number is " + SecondRoom.getRoomNumber() + ",type is'" + SecondRoom.getRoomType() + "')" );
						System.out.println("roomB is " + roomStatus + " and the rate is " + SecondRoom.getRoomRate());
						
						System.out.println();
						SecondRoom.setRoomStatus(1);
						System.out.println(roomOccupied);
						System.out.println();
						
						if(ThirdRoom.getRoomStatus()==0)
						{roomStatus = "Vacanat";}
						else {roomStatus = "Ocuppied";}
						
						System.out.println("roomC (room number is " + ThirdRoom.getRoomNumber() + ",type is'" + ThirdRoom.getRoomType() + "')" );
						System.out.println("roomC is " + roomStatus + " and the rate is " + ThirdRoom.getRoomRate());
	}

}
