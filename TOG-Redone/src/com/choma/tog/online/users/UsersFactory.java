package com.choma.tog.online.users;

import java.util.List;

public interface UsersFactory<T extends Users>{

	
	/*
	 * get all users from the game
	 */
	public List<T> getUsers();
	
	/*
	 * gets individual user using username as key
	 */
	public T getUser(String username);

	/*
	 * get users by rank. Specify pageNumber, numberOfResults and order
	 */
	public List<T> getUserByRank(Integer pageNumber, Integer numberOfResults, UserEnum order);
	
	
}
