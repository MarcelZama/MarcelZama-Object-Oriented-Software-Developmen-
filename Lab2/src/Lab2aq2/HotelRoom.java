package Lab2aq2;

public class HotelRoom {
		private int roomNumber;
		private String roomType;
		private int roomStatus;
		private double rate;
			
		public HotelRoom() {
			roomNumber = 0;
			roomType = "Single";
			roomStatus = 0;
			rate = 0;
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
			
			
			
			public void setRoomStatus(int newRoomStatus)
			{
				roomStatus = newRoomStatus;
			}
			
			public int getRoomStatus()
			{
				return roomStatus;
			}
			
			
			public void setRoomRate(double newRoomRate)
			{
			rate = newRoomRate;		
			}
			
			public double getRoomRate()
			{
			return rate;
			}
			}