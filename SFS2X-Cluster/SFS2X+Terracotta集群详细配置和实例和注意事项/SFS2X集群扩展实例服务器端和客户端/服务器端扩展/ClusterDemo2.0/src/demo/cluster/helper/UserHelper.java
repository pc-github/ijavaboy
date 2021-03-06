package demo.cluster.helper;

import java.util.List;

import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.Zone;
import com.smartfoxserver.v2.extensions.SFSExtension;

public class UserHelper {
	
	/**
	 * 获取zone中的用户列表
	 * @param zone
	 * @return
	 */
	public static List<User> getRecipientList(Zone zone){
		
		return (List<User>)zone.getUserList();
	}
	
	public static List<User> getRecipientList(Room currentRoom) {
		return currentRoom.getUserList();
	}
	
	public static List<User> getRecipientList(SFSExtension extension, String roomName){
		
		Room room =  extension.getParentZone().getRoomByName(roomName);
		
		if(room != null){
			
			return room.getUserList();
		}
		
		return null;
	}

}
