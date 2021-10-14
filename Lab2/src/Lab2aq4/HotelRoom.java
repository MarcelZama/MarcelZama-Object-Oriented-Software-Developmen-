package Lab2aq4;

public class HotelRoom {
		private int roomNumber;
		private String roomType;
		private int roomStatus;
		private double rate;
		private boolean occupied = true;
			
		public HotelRoom() {
			roomNumber = 0;
			roomType = "Single";
			roomStatus = 0;
			rate = 0;
		}
		public HotelRoom(int newroomNumber,String newroomType,int newroomStatus,double newrate) {
		 roomNumber = newroomNumber;
		 roomType = newroomType;
		 roomStatus = newroomStatus;
		 rate = newrate;
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
				
			if(newRoomStatus == 0)
			{
				roomStatus = newRoomStatus;
			}
			else if(roomStatus == 1)
			{
				occupied = false;
			}
			
			}
			
			public int getRoomStatus()
			{
				return roomStatus;
			}
			
			public boolean setisOccupied(boolean occupied)
			{
				if(roomStatus == 1)
					{
						occupied = false;
					}
			}

			public boolean getisOccupied()
			{
				return occupied;
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
			/*public boolean isOcuppied()s*/