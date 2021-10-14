package Lab2aq1;

public class HotelRoom {
		private int roomNumber;
		private String roomType;
			
		public HotelRoom() {
			roomNumber = 0;
			roomType = "Single";
		}
			
			public void setRoomNumber(int newRoomNumber)
			{
			roomNumber = newRoomNumber;		
			}
			
			public int getRoomNumber()
			{
			return roomNumber;
			}
			
			
			public void setRoomType(String newRoomType)
			{
			roomType = newRoomType;		
			}
			
			public String getRoomType()
			{
			return roomType;
			}
			
			}
