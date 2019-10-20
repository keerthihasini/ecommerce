package Dao;

import java.util.List;

import Collabration.Backend1.Friend;
import Collabration.Backend1.User;

public interface FriendsDao {
	List<User> getListOfSuggestedUsers(String username);

	void addFriendRequest(String username, String toId);

	List<Friend> getPendingRequests(String username);

	void updatePendingRequest(Friend pendingRequest);

	List<Friend> listOfFriends(String username);

}
